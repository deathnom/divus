package Model;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Controller.ActionListeners;
import View.Gui;

public class Obstacles {
	public static ArrayList<JButton> Obstacle = new ArrayList<JButton>();
	 public static ArrayList<String> Items = new ArrayList <String>();
	 public static ArrayList<JButton> Inventory = new ArrayList<JButton>();
	public Obstacles(){
		
			
		}
	
	
	public static void Obstacle(int mapChoice){
		ImageIcon rock = new ImageIcon("Rock.png");
		if (mapChoice==8){
		Obstacle.add(Gui.squares[2][2]);
		Obstacle.add(Gui.squares[2][3]);
		Obstacle.add(Gui.squares[1][2]);
		Obstacle.add(Gui.squares[1][3]);
		Obstacle.add(Gui.squares[4][4]);
		for(int i=0; i<8; i++){
			for(int j=0; j<16; j++){
				if(Obstacle.contains(Gui.squares[i][j])){
					Gui.squares[i][j].setIcon(null);
				}
			}
		}
		Gui.squares[4][4].setIcon(rock);
		}
		else if(mapChoice==13){
			Obstacle.add(Gui.squares[6][5]);
			
			for(int i=0; i<8; i++){
				for(int j=0; j<16; j++){
					if(Obstacle.contains(Gui.squares[i][j])){
						Gui.squares[i][j].setIcon(rock);
					}
				}
			}
		}
		else if(mapChoice==3){
			
		}
		else if(mapChoice==4){
			
		}
	}
	public static boolean movementCheck(int y, int x){
		boolean variable=true;
			//top
		if(Obstacle.contains(Gui.squares[x][y])){
		if(ActionListeners.up){
				variable=false;
			}
			//bot
			else if(ActionListeners.down){
				variable=false;
			}
			//left
			else if(ActionListeners.right){
				variable=false;
			}
			//right
			else if(ActionListeners.left){
				variable=false;
			}
			else{
				return true;
			}
		}
		return variable;
	}
	public static void itemCheck(){
		if(ActionListeners.right){
		if(movementCheck((Player.playerx+1), Player.playery)){
			
		}
		if(ActionListeners.left){
			if(movementCheck((Player.playerx-1), Player.playery)){
		
	}
			
	}
		if(ActionListeners.up){
			if(movementCheck(Player.playerx, (Player.playery-1))){
		
	}
			
	}
		if(ActionListeners.down){
			if(movementCheck(Player.playerx, (Player.playery+1))){
		
	}
			
	}

		}
	}
}
