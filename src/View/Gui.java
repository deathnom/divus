package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Controller.ActionListeners;
import Model.Map;

public class Gui extends JFrame {
	public static Font font1 = new Font("Sans-serif", Font.BOLD, 40);
	public static Font Title = new Font("Sans-serif", Font.BOLD, 200);
	public static JButton[][] squares = new JButton[8][16];
	static JLabel msg = new JLabel();
	static JFrame frame= new JFrame("Divus");
	public Gui() {

	}

	/**
	 * Current ideas: Pop up menu in upper left or esc which allows player to
	 * access options/exit. Options could be font size for instance. Also brings
	 * up title screen which brings up the name DIVUS which can be passed by
	 * menu with button or by accessing through menu in upper left.
	 */
	public static void initialize() {
		Gui g = new Gui();

		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setLocation(15, 0);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setExtendedState(MAXIMIZED_BOTH);

		g.addMenu(frame);
		g.addPanel(frame);
		frame.setVisible(true);
		
	}

	public void addMenu(JFrame frame) {
		JMenuItem exit = new JMenuItem("Exit");
		JMenu menu = new JMenu("Options");
		JMenuBar menuBar = new JMenuBar();
		ActionListener actionListener = new ActionListeners(exit);
		exit.addActionListener(actionListener);
		// ActionListeners.initialize();
		menu.add(exit);
		// exit.addActionListener(this);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}

	public void addPanel(JFrame frame) {
		JPanel panel = new JPanel(new GridLayout(8, 16));
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel(new BorderLayout());
		panel2.setVisible(true);
		panel.setBackground(Color.GRAY);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		ActionListener actionListener = new ActionListeners();
		KeyListener Keylistener = new ActionListeners();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				squares[i][j] = new JButton();
				squares[i][j].setText("");
				squares[i][j].addActionListener(actionListener);
				squares[i][j].setBorder(emptyBorder);
				squares[i][j].setVisible(true);
				panel.add(squares[i][j]);
				squares[i][j].setFocusable(true);
				squares[i][j].requestFocus(true);
				squares[i][j].addKeyListener(Keylistener);
			}
			
		}
	
		msg.setFont(font1);
		msg.setText("WASD keys to move and space to interact");
		panel2.add(msg);
		frame.add(panel3);
		panel3.add(panel,BorderLayout.CENTER);
		frame.add(panel2,BorderLayout.SOUTH);
		Map.initialize();

	}

	public static void dialogueBox(String message) {
	msg.setText(message);
	}
	public static void inventory(boolean I){
		JPanel panel4 = new JPanel(new GridLayout());
		
		panel4.setBackground(Color.GRAY);
		
	 
		
		if(I){
		frame.add(panel4);
		}
		else{
			frame.remove(panel4);
		}
		
		
	}
	

}