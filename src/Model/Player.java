package Model;

import java.awt.Color;

import View.Gui;

public class Player {
	//causes issue between collision
	public static int playerx=3;
	public static int playery=3;
	//
	public static void playerlocationMouse(int y, int x){
		playerx=x;
		playery=y;
		playerRepaint();
	}
	public static void playerRepaint(){
		for(int i =0; i<8; i++){
			for(int j=0; j<16; j++ ){
				
	Gui.squares[i][j].setBackground(Color.GREEN);
	Obstacles.Obstacle(1);
			}
		}
		Gui.squares[playery][playerx].setBackground(Color.BLACK);
	}
	
	
	
}
