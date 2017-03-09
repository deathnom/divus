package Model;

import java.awt.Color;
import javax.swing.ImageIcon;

import View.Gui;

public class Map {
	public static int mapChoice = 17;
	public static Gui g = new Gui();

	public Map(int mapChoice) {

	}

	public static void initialize() {
		Obstacles.Items.add("Pickaxe");
		Obstacles.Items.add("Crab");
		Obstacles.Items.add("Wooden Sword");
		Obstacles.Items.add("Iron Sword");
		Obstacles.Items.add("Iron Shield");
		Obstacles.Items.add("Wooden Shield");
		Obstacles.Items.add("Branch");
		Player.playerRepaint();
	}

	public static void green() {
		Color grass = new Color(65, 210, 13);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				Gui.squares[i][j].setBackground(grass);
			}
		}
	}

	public static void ground() {
		Color mossGreen = new Color(140, 138, 0);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				Gui.squares[i][j].setBackground(mossGreen);
			}
		}
	}

	public static void ocean() {
		Color sea = new Color(0, 128, 204);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				Gui.squares[i][j].setBackground(sea);
			}
		}
	}

	public static void formea() {
		//meadow
		Color dirt = new Color(140, 138, 0);
		if (mapChoice == 7) {
			green();
			for (int i = 7; i < 16; i++) {
				Gui.squares[3][i].setBackground(dirt);
				Gui.squares[4][i].setBackground(dirt);

				Gui.squares[3][i].setIcon(null);
				Gui.squares[4][i].setIcon(null);
			}
			for (int i = 3; i < 8; i++) {
				Gui.squares[i][6].setBackground(dirt);
				Gui.squares[i][7].setBackground(dirt);

				Gui.squares[i][6].setIcon(null);
				Gui.squares[i][7].setIcon(null);
			}
		}
		if (mapChoice == 8) {
			green();
			Gui.squares[6][8].setBackground(dirt);
			Gui.squares[6][9].setBackground(dirt);
			Gui.squares[7][7].setBackground(dirt);
			Gui.squares[7][8].setBackground(dirt);
			Gui.squares[6][7].setBackground(dirt);
			Gui.squares[5][8].setBackground(dirt);
			Gui.squares[5][9].setBackground(dirt);
			Gui.squares[4][8].setBackground(dirt);
			Gui.squares[4][9].setBackground(dirt);
			Gui.squares[3][8].setBackground(dirt);
			Gui.squares[3][9].setBackground(dirt);

			Gui.squares[6][8].setIcon(null);
			Gui.squares[6][9].setIcon(null);
			Gui.squares[7][7].setIcon(null);
			Gui.squares[7][8].setIcon(null);
			Gui.squares[6][7].setIcon(null);
			Gui.squares[5][8].setIcon(null);
			Gui.squares[5][9].setIcon(null);
			Gui.squares[4][8].setIcon(null);
			Gui.squares[4][9].setIcon(null);
			Gui.squares[3][8].setIcon(null);
			Gui.squares[3][9].setIcon(null);
		}
		if(mapChoice == 9){
			green();
		}
		if (mapChoice == 12) {
			green();
			for (int i = 0; i < 5; i++) {
				Gui.squares[i][7].setBackground(dirt);
				Gui.squares[i][7].setIcon(null);
			}
			for (int i = 0; i < 5; i++) {
				Gui.squares[i][8].setBackground(dirt);
				Gui.squares[i][8].setIcon(null);
			}
			for (int i = 0; i < 7; i++) {
				Gui.squares[4][i].setBackground(dirt);
				Gui.squares[4][i].setIcon(null);
			}
			for (int i = 0; i < 7; i++) {
				Gui.squares[3][i].setBackground(dirt);
				Gui.squares[3][i].setIcon(null);
			}

		}
		
		//forest
		ImageIcon forest = new ImageIcon("Forest.png");
		ImageIcon forestb;
		if(mapChoice == 13){
			ground();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) { }
			} 
		}
		if(mapChoice == 14){
			ground();
			for (int i = 0; i < 8; i++) { 
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(forest);
				}
			}
		}
		if (mapChoice == 17) {
			ground();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(forest);
				}
			}
		}
		if (mapChoice == 18) {
			ground();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(forest);
				}
			}
		}
		if(mapChoice == 19){
			ground();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(forest);
				}
			}
		}
	}

	public static void map() {
		ImageIcon water = new ImageIcon("Water.png");
		ImageIcon surface = new ImageIcon("Sand.png");
		ImageIcon cSing = new ImageIcon("sing.png");
		ImageIcon waterrock = new ImageIcon("rockWater.png");
		ImageIcon seasand = new ImageIcon("seasand.png");
		ImageIcon sideA = new ImageIcon("sideA.png");
		ImageIcon sideB = new ImageIcon("sideB.png");
		ImageIcon sideC = new ImageIcon("sideC.png");
		ImageIcon sideD = new ImageIcon("sideD.png");
		ImageIcon cornerA = new ImageIcon("corner1.png");
		ImageIcon cornerAx= new ImageIcon("corner1x.png");
		ImageIcon cornerAy = new ImageIcon("corner1y.png");
		ImageIcon cornerB = new ImageIcon("corner5.png");
		ImageIcon cornerBx=new ImageIcon("corner5x.png");
		ImageIcon cornerBy = new ImageIcon("corner5y.png");
		ImageIcon cornerC = new ImageIcon("corner21.png");
		ImageIcon cornerCx = new ImageIcon("corner21x.png");
		ImageIcon cornerCy = new ImageIcon("corner21y.png");
		ImageIcon cornerD = new ImageIcon("corner25.png");
		ImageIcon cornerDx = new ImageIcon("corner25x.png");
		ImageIcon cornerDy = new ImageIcon("corner25y.png");
		
		Color sand = new Color(255, 193, 108);
		// top left corner
		if(mapChoice == 1){
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			
			for (int i = 4; i < 8; i++){
				Gui.squares[i][15].setBackground(sand);
				Gui.squares[i][15].setIcon(surface);
			}
			
			for (int i = 5; i < 8; i++){
				Gui.squares[i][14].setBackground(sand);
				Gui.squares[i][14].setIcon(surface);
			}
			
			for (int i = 6; i < 8; i++){
				Gui.squares[i][13].setBackground(sand);
				Gui.squares[i][13].setIcon(surface);
			}
			
			Gui.squares[7][12].setBackground(sand);
			Gui.squares[7][12].setIcon(surface);
			
			Gui.squares[3][5].setIcon(cSing);
			Gui.squares[2][13].setIcon(waterrock);
			Gui.squares[5][0].setIcon(waterrock);
			Gui.squares[7][12].setIcon(cornerA);
			Gui.squares[6][13].setIcon(cornerA);
			Gui.squares[5][14].setIcon(cornerA);
			Gui.squares[4][15].setIcon(cornerA);
			Gui.squares[6][14].setIcon(cornerAx);
			Gui.squares[5][15].setIcon(cornerAx);
			Gui.squares[7][13].setIcon(cornerAx);
			Gui.squares[7][11].setIcon(cornerAy);
			Gui.squares[6][12].setIcon(cornerAy);
			Gui.squares[5][13].setIcon(cornerAy);
			Gui.squares[4][14].setIcon(cornerAy);
			Gui.squares[3][15].setIcon(cornerAy);
			//Gui.squares
			
		}
		// top beach
		if (mapChoice == 2 || mapChoice == 3 || mapChoice == 4) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			for (int i = 4; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(sand);
					Gui.squares[i][j].setIcon(surface);
				}
			}
			for(int i = 0; i < 16; i++){
				Gui.squares[4][i].setIcon(sideC);
			}
		}
		
		if(mapChoice == 3){
			Gui.squares[1][12].setIcon(waterrock);
			Gui.squares[3][2].setIcon(waterrock);
		}
		// top right corner
		if (mapChoice == 5) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			for (int i = 4; i < 8; i++) {
				Gui.squares[i][0].setBackground(sand);
				Gui.squares[i][0].setIcon(surface);
			}
			for (int i = 5; i < 8; i++) {
				Gui.squares[i][1].setBackground(sand);
				Gui.squares[i][1].setIcon(surface);
			}
			for(int i = 6; i < 8; i++){
				Gui.squares[i][2].setBackground(sand);
				Gui.squares[i][2].setIcon(surface);
			}
			Gui.squares[7][3].setBackground(sand);
			Gui.squares[7][3].setIcon(surface);
			Gui.squares[7][3].setIcon(cornerB);
			Gui.squares[6][2].setIcon(cornerB);
			Gui.squares[5][1].setIcon(cornerB);
		
			Gui.squares[4][0].setIcon(cornerB);
			Gui.squares[5][0].setIcon(cornerBx);
			Gui.squares[6][1].setIcon(cornerBx);
			Gui.squares[7][2].setIcon(cornerBx);
			Gui.squares[4][1].setIcon(cornerBy);
			Gui.squares[3][0].setIcon(cornerBy);
			Gui.squares[5][2].setIcon(cornerBy);
			Gui.squares[6][3].setIcon(cornerBy);
			Gui.squares[7][4].setIcon(cornerBy);

		}
		// left beaches
		if (mapChoice == 6 || mapChoice == 11 || mapChoice == 16) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			for (int i = 12; i < 16; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(sand);
					Gui.squares[j][i].setIcon(surface);
				}
			}
			for(int i = 0; i < 8; i++){
				Gui.squares[i][12].setIcon(sideB);
			}
		}

		// bottom left corner
		if (mapChoice == 21) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			for (int i = 0; i < 2; i++) {
				Gui.squares[i][13].setBackground(sand);
				Gui.squares[i][13].setIcon(surface);
			}
			for (int i = 0; i < 3; i++) {
				Gui.squares[i][14].setBackground(sand);
				Gui.squares[i][14].setIcon(surface);
			}
			for (int i = 0; i < 4; i++) {
				Gui.squares[i][15].setBackground(sand);
				Gui.squares[i][15].setIcon(surface);
			}
			Gui.squares[0][12].setBackground(sand);
			Gui.squares[0][12].setIcon(surface);
			
			Gui.squares[4][9].setIcon(waterrock);
			Gui.squares[0][4].setIcon(waterrock);
			Gui.squares[6][2].setIcon(waterrock);
			Gui.squares[0][12].setIcon(cornerC);
			Gui.squares[1][13].setIcon(cornerC);
			Gui.squares[2][14].setIcon(cornerC);
			Gui.squares[3][15].setIcon(cornerC);
			Gui.squares[0][13].setIcon(cornerCx);
			Gui.squares[1][14].setIcon(cornerCx);
			Gui.squares[2][15].setIcon(cornerCx);
			Gui.squares[4][15].setIcon(cornerCy);
			Gui.squares[3][14].setIcon(cornerCy);
			Gui.squares[2][13].setIcon(cornerCy);
			Gui.squares[1][12].setIcon(cornerCy);
			
		}
		if (mapChoice == 22 || mapChoice == 23 || mapChoice == 24) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(sand);
					Gui.squares[i][j].setIcon(surface);
				}
			}
			for(int i = 0; i < 16; i++){
				Gui.squares[3][i].setIcon(sideD);
				Gui.squares[3][i].setFocusable(false);
			}
		}
		
		// bottom right corner
		if (mapChoice == 25) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			Gui.squares[0][3].setBackground(sand);
			Gui.squares[0][3].setIcon(surface);
			for (int i = 0; i < 2; i++) {
				Gui.squares[i][2].setBackground(sand);
				Gui.squares[i][2].setIcon(surface);
			}
			for (int i = 0; i < 3; i++) {
				Gui.squares[i][1].setBackground(sand);
				Gui.squares[i][1].setIcon(surface);
			}
			for (int i = 0; i < 4; i++) {
				Gui.squares[i][0].setBackground(sand);
				Gui.squares[i][0].setIcon(surface);
			}
		
			Gui.squares[3][0].setIcon(cornerD);
			Gui.squares[4][0].setIcon(cornerDy);
			Gui.squares[2][0].setIcon(cornerDx);
			Gui.squares[2][1].setIcon(cornerD);
			Gui.squares[3][1].setIcon(cornerDy);
			Gui.squares[1][1].setIcon(cornerDx);
			Gui.squares[2][2].setIcon(cornerDy);
			Gui.squares[0][2].setIcon(cornerDx);
			Gui.squares[1][2].setIcon(cornerD);
			Gui.squares[0][3].setIcon(cornerD);
			Gui.squares[1][3].setIcon(cornerDy);
			Gui.squares[0][4].setIcon(cornerDy);
}
		// right side beach

		if (mapChoice == 10 || mapChoice == 15 || mapChoice == 20) {
			ocean();
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setIcon(water);
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(sand);
					Gui.squares[j][i].setIcon(surface);
				}
			}
			for(int i = 0; i < 8; i++){
				Gui.squares[i][3].setIcon(sideA);
			}
		}
		
		if(mapChoice == 20){
			Gui.squares[4][2].setIcon(seasand);
			Gui.squares[2][0].setIcon(seasand);
		}
		
		// inside maps

		if (mapChoice == 7 || mapChoice == 8 || mapChoice == 9 || mapChoice == 12 || mapChoice == 13 || mapChoice == 14 || mapChoice == 17 ||
				  mapChoice == 18 || mapChoice == 19) {
			formea();
		}

	}

	public static void mapChange(String movement) {
		formea();
		if (movement.equals("s")) {
			if (Map.mapChoice != 21 && Map.mapChoice != 22 && Map.mapChoice != 23 && Map.mapChoice != 24
					&& Map.mapChoice != 25) {
				Map.mapChoice += 5;
				Player.playery -= 7;
				Obstacles.Obstacle.clear();
			}
		}
		if (movement.equals("w")) {
			if (Map.mapChoice != 1 && Map.mapChoice != 2 && Map.mapChoice != 3 && Map.mapChoice != 4
					&& Map.mapChoice != 5) {
				Map.mapChoice -= 5;
				Player.playery += 7;
				Obstacles.Obstacle.clear();
			}
		}
		if (movement.equals("a")) {
			if (Map.mapChoice != 1 && Map.mapChoice != 6 && Map.mapChoice != 11 && Map.mapChoice != 16
					&& Map.mapChoice != 21) {
				Map.mapChoice -= 1;
				Player.playerx += 15;
				Obstacles.Obstacle.clear();
			}
		}
		if (movement.equals("D")) {

			if (Map.mapChoice != 5 && Map.mapChoice != 10 && Map.mapChoice != 15 && Map.mapChoice != 20
					&& Map.mapChoice != 25) {
				Map.mapChoice += 1;
				Player.playerx -= 15;
				Obstacles.Obstacle.clear();
			}
		}

	}

}

