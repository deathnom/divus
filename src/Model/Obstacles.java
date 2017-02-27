package Model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import Controller.ActionListeners;
import View.Gui;

public class Obstacles {
	static int a = Player.playerx;
	static int b = Player.playery;
	static ArrayList<JButton> Obstacle = new ArrayList<JButton>();
	 
	public Obstacles(int mapChoice){
		if(mapChoice==1){
			
		}
	}
	
	public static void Obstacle(){
		Obstacle.add(Gui.squares[2][2]);
		Obstacle.add(Gui.squares[2][3]);
		for(int i=0; i<8; i++){
			for(int j=0; j<16; j++){
				if(Obstacle.contains(Gui.squares[i][j])){
					Gui.squares[i][j].setBackground(Color.GRAY);
				}
			}
		}
		
	}
	public static boolean movementCheck(int y, int x){
		boolean variable=true;
		if(Obstacle.contains(Gui.squares[2][2])){
			//top
			if(x+1==a&&ActionListeners.up){
				variable=false;
			}
			//bot
			if(Gui.squares[x][y]==Gui.squares[a][b]&&ActionListeners.down){
				variable=false;
			}
			//left
			if(Gui.squares[x][y]==Gui.squares[a][b]&&ActionListeners.right){
				variable=false;
			}
			//right
			if(Gui.squares[x][y]==Gui.squares[a][b]&&ActionListeners.left){
				variable=false;
			}
			else{
				return true;
			}
		}
		return variable;
	}
	
	
}
