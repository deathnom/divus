package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JMenuItem;

import Model.Obstacles;
import Model.Player;
import View.Gui;

public class ActionListeners implements ActionListener, KeyListener {
private JMenuItem Exit;
public static boolean up=false;
public static boolean left=false;
public static boolean right=false;
public static boolean down= false;


	public ActionListeners(){
		
	}
	public ActionListeners(JMenuItem Exit){
		this.Exit = Exit;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<8; i++){
			for(int j=0; j<16; j++){
				if(e.getSource()==Gui.squares[i][j]){
					Player.playerlocationMouse(i, j);
				}
			}
		}
		
		if(e.getSource() instanceof JMenuItem){
			JMenuItem item = (JMenuItem) e.getSource();
			if(item.getText().equals("New Game")){
				
			}else if(item.getText().equals("Exit")){
				System.exit(0);
			}
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		
		
		
		if(e.getKeyCode()== KeyEvent.VK_W){
			
			
			if(Player.playery>0){
				up=true;
				if(Obstacles.movementCheck(Player.playerx, (Player.playery-1))){
					Player.playery-=1;
				}
				up=false;
							
			}
			
		
		}
		else if(e.getKeyCode()==KeyEvent.VK_S){
			
			if(Player.playery<7){
				down=true;
				if(Obstacles.movementCheck(Player.playerx, (Player.playery+1))){
					Player.playery+=1;
				}
			
			down=false;
			}
			
			}
			else if(e.getKeyCode()==KeyEvent.VK_A){
				if(Player.playerx>0){
				left=true;
				if(Obstacles.movementCheck((Player.playerx-1), Player.playery)){
			
			Player.playerx-=1;
			}				
			left=false;
				}
		}
			else if(e.getKeyCode()==KeyEvent.VK_D){
				if(Player.playerx<15){
				right=true;
				if(Obstacles.movementCheck((Player.playerx+1), Player.playery)){
				Player.playerx+=1;
				}
				right=false;
				}
			}
		  
		Player.playerRepaint();
			
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub	        
	
		  }
	
}
