package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;

import View.Gui;

public class ActionListeners implements ActionListener {
private JMenuItem Exit;
static int up = KeyEvent.VK_W;

	public ActionListeners(){
		
	}
	public ActionListeners(JMenuItem Exit){
		this.Exit = Exit;
	}
	public static void initialize(){
//		Gui.Newgame.addActionListener(this);
//		Gui.exit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		if(e.getSource() instanceof JMenuItem){
			if(item.getText().equals("New Game")){
				
			}else if(item.getText().equals("Exit")){
				System.exit(0);
			}
		}
	}
}
