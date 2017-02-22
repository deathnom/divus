package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Controller.ActionListeners;


public class Gui extends JFrame {
	public static Font font1 = new Font("Sans-serif", Font.BOLD, 40);
	public static Font Title = new Font ("Sans-serif", Font.BOLD, 200);
	public static JButton[][] squares = new JButton[8][16];
	public Gui() {

	}
/**
 * Current ideas: Pop up menu in upper left or esc which allows player to access
 * options/exit. Options could be font size for instance. Also brings up title 
 * screen which brings up the name DIVUS which can be passed by menu with button
 * or by accessing through menu in upper left.
 */
	public static void initialize() {
		Gui g = new Gui();
		
		JFrame frame = new JFrame("Divus");
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
		JMenuItem Newgame = new JMenuItem("New Game");
		JMenuItem Pause = new JMenuItem("Pause/Unpause");
		JMenuItem exit = new JMenuItem("Exit");
		JMenu menu = new JMenu("Options");
		JMenuBar menuBar = new JMenuBar();
		ActionListener actionListener = new ActionListeners(exit);
		menu.add(Newgame);
		
		exit.addActionListener(actionListener);
		//ActionListeners.initialize();
		menu.add(Pause);
		//Pause.addActionListener(this);
		menu.add(exit);
		//exit.addActionListener(this);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
	}

	public void addPanel(JFrame frame) {
		JPanel panel = new JPanel(new GridLayout(8,16));
		panel.setBackground(Color.GRAY);
		for(int i=0; i<8; i++){
			  for(int j=0; j<16; j++){
				  squares[i][j] = new JButton();
				  squares[i][j].setText("");
				  
				  squares[i][j].setVisible(true);
				  panel.add(squares[i][j]);
				 }
			  }
		squares[1][1].setBackground(Color.BLACK);
		frame.add(panel);
	}
	

	
}