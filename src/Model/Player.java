package Model;

import java.awt.Color;

import javax.swing.ImageIcon;

import View.Gui;

public class Player {
	// causes issue between collision
	public static int playerx = 14;
	public static int playery = 2;

	//
	public static void playerlocationMouse(int y, int x) {
		playerx = x;
		playery = y;
		playerRepaint();
	}

	public static void playerRepaint() {
		ImageIcon dude = new ImageIcon("Divus.png");
		ImageIcon grass = new ImageIcon("GrassD.png");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 16; j++) {
				Gui.squares[i][j].setIcon(null);
				Gui.squares[i][j].setIcon(grass);

				Map.map();
				Obstacles.Obstacle(Map.mapChoice);
				
			}
		}
		
		Gui.squares[playery][playerx].setIcon(dude);
	}

}
