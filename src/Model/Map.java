package Model;

import java.awt.Color;

import javax.swing.ImageIcon;

import View.Gui;

public class Map {
	public static int mapChoice = 8;

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
		public static void ground(){
			Color mossGreen = new Color(140, 138, 0);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(mossGreen);
				}
			}
		}
		public static void path() {
			Color dirt = new Color(140, 138, 0);
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
			if (mapChoice == 13) {
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
			if (mapChoice == 12) {
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
			if (mapChoice == 17) {
				ground();
				ImageIcon forest = new ImageIcon("Forest.png");
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setIcon(forest);
					}
				}
			}
			if (mapChoice == 18) {
				ground();
				ImageIcon forest = new ImageIcon("Forest.png");
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setIcon(forest);
					}
				}
			}
		}

	

	public static void map() {
		// top left corner
		if (mapChoice == 1) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
				Gui.squares[7][15].setBackground(Color.YELLOW);
				Gui.squares[6][14].setBackground(Color.yellow);
				Gui.squares[7][14].setBackground(Color.yellow);
				Gui.squares[6][15].setBackground(Color.YELLOW);
				Gui.squares[5][15].setBackground(Color.YELLOW);
				Gui.squares[7][13].setBackground(Color.yellow);
			}
		}
		// top beach
		if (mapChoice == 2) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 5; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.yellow);

				}
			}
		}

		if (mapChoice == 3) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 5; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.yellow);

				}
			}
		}
		if (mapChoice == 4) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 5; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.yellow);

				}
			}
		}
		// top right corner
		if (mapChoice == 5) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 5; i < 8; i++) {
				Gui.squares[i][0].setBackground(Color.YELLOW);
			}
			for (int i = 6; i < 8; i++) {
				Gui.squares[i][1].setBackground(Color.YELLOW);
			}
			Gui.squares[7][2].setBackground(Color.yellow);
		}
		// left beaches
		if (mapChoice == 6) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 13; i < 16; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(Color.YELLOW);
				}
			}
		}
		if (mapChoice == 11) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 13; i < 16; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(Color.YELLOW);
				}
			}
		}
		if (mapChoice == 16) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 13; i < 16; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(Color.YELLOW);
				}
			}
		}

		// bottom left corner
		if (mapChoice == 21) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 0; i < 1; i++) {
				Gui.squares[i][13].setBackground(Color.YELLOW);
			}
			for (int i = 0; i < 2; i++) {
				Gui.squares[i][14].setBackground(Color.YELLOW);
			}
			for (int i = 0; i < 3; i++) {
				Gui.squares[i][15].setBackground(Color.YELLOW);
			}

		}
		if (mapChoice == 22) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.yellow);
				}
			}
		}
			if (mapChoice == 23) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setBackground(Color.BLUE);
					}
				}
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setBackground(Color.yellow);
					}
				}
			}
			if (mapChoice == 24) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setBackground(Color.BLUE);
					}
				}
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setBackground(Color.yellow);
					}
				}
			}
			// bottom right corner
			if (mapChoice == 25) {
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 16; j++) {
						Gui.squares[i][j].setBackground(Color.BLUE);
					}
				}
				for (int i = 0; i < 1; i++) {
					Gui.squares[i][2].setBackground(Color.YELLOW);
				}
				for (int i = 0; i < 2; i++) {
					Gui.squares[i][1].setBackground(Color.YELLOW);
				}
				for (int i = 0; i < 3; i++) {
					Gui.squares[i][0].setBackground(Color.YELLOW);
				}
			}
		//right side beach

		if (mapChoice == 10) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(Color.yellow);
				}
			}
		}
		if (mapChoice == 15) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(Color.yellow);
				}
			}
		}
		if (mapChoice == 20) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					Gui.squares[i][j].setBackground(Color.BLUE);
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 8; j++) {
					Gui.squares[j][i].setBackground(Color.yellow);
				}
			}
		}
			//inside maps
		
		if (mapChoice == 7) {

		}
		if (mapChoice == 8) {
			path();
		}
		if (mapChoice == 9) {

		}
		if (mapChoice == 12) {
			path();
		}
		if (mapChoice == 13 ) {
			path();
		}
		if (mapChoice == 14) {

		}
		if (mapChoice == 17) {
			path();
		}
		if (mapChoice == 18) {
			path();
		}
		if (mapChoice == 19) {

		}

	}

	public static void mapChange(String movement) {
		path();
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
