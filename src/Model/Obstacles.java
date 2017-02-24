package Model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import Controller.ActionListeners;
import View.Gui;

public class Obstacles {
	static int a = Player.playerx;
	static int b = Player.playery;
	static ArrayList Obstacle = new ArrayList();
	 
	public Obstacles(int mapChoice){
		if(mapChoice==1){
			
		}
	}
	
	public static void Obstacle(){
		Obstacle.add(Gui.squares[2][2]);
		for(int i=0; i<8; i++){
			for(int j=0; j<15; j++){
				if(Obstacle.contains(Gui.squares[i][j])){
					Gui.squares[i][j].setBackground(Color.GRAY);
				}
			}
		}
		
	}
	public static boolean movementCheck(int x, int y){
		
		if(Obstacle.contains(Gui.squares[x][y])){
			//top
			if(Gui.squares[x][y-1]==Gui.squares[a][b]&&ActionListeners.up){
				return false;
			}
			//bot
			if(Gui.squares[x][y+1]==Gui.squares[a][b]&&ActionListeners.down){
				return false;
			}
			//left
			if(Gui.squares[x+1][y]==Gui.squares[a][b]&&ActionListeners.left){
				return false;
			}
			if(Gui.squares[x-1][y]==Gui.squares[a][b]&&ActionListeners.right){
				return false;
			}
			
		}
		return true;
	}
	
	
}
