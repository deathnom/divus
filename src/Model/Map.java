package Model;

import java.awt.Color;

import View.Gui;

public class Map {

	public Map(int mapChoice){
		
	}
	public static void initialize(){
		for(int i=0; i<8; i++){
			for(int j=0; j<16; j++){
				Gui.squares[i][j].setBackground(Color.GREEN);
			}
		}
		Player.playerRepaint();
	}
	
	
	
	
	
}
