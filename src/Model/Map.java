package Model;

import java.awt.Color;

import View.Gui;

public class Map {
public static int mapChoice=1;
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
	
	public static void path(){
		if(mapChoice==1){
		Gui.squares[6][8].setBackground(Color.YELLOW);
		Gui.squares[6][9].setBackground(Color.YELLOW);
		Gui.squares[7][7].setBackground(Color.YELLOW);
		Gui.squares[7][8].setBackground(Color.YELLOW);
		Gui.squares[6][7].setBackground(Color.YELLOW);
		Gui.squares[5][8].setBackground(Color.YELLOW);
		Gui.squares[5][9].setBackground(Color.YELLOW);
		Gui.squares[4][8].setBackground(Color.YELLOW);
		Gui.squares[4][9].setBackground(Color.YELLOW);
		Gui.squares[3][8].setBackground(Color.YELLOW);
		Gui.squares[3][9].setBackground(Color.YELLOW);
	}
		if(mapChoice==2){
			for(int i=0; i<5; i++){
				Gui.squares[i][7].setBackground(Color.yellow);
			}
			for(int i=0; i<5; i++){
				Gui.squares[i][8].setBackground(Color.YELLOW);
			}
			for(int i=0; i<7; i++){
				Gui.squares[4][i].setBackground(Color.YELLOW);
			}
			for(int i=0; i<7; i++){
				Gui.squares[3][i].setBackground(Color.yellow);
			}
		
		}
		
	}
	
	
}
