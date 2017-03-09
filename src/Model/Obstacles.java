package Model;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Controller.ActionListeners;
import View.Gui;

public class Obstacles {
	public static ArrayList<JButton> Obstacle = new ArrayList<JButton>();
	public static ArrayList<String> Items = new ArrayList<String>();
	public static ArrayList<JButton> Inventory = new ArrayList<JButton>();
	public static ArrayList<JButton> NPC = new ArrayList<JButton>();
	public static Player p = new Player();
	public static boolean stepped = false;

	public Obstacles() {

	}

	public static void Obstacle(int mapChoice) {
		ImageIcon rock = new ImageIcon("Rock.png");
		ImageIcon boldL = new ImageIcon("boulderleft.png");
		ImageIcon boldT = new ImageIcon("bouldertop.png");
		ImageIcon boldR = new ImageIcon("boulderright.png");
		ImageIcon boldB = new ImageIcon("boulderbottom.png");
		ImageIcon treeT = new ImageIcon("TreeTop.png");
		ImageIcon treeB = new ImageIcon("TreeBottom.png");
		ImageIcon crab = new ImageIcon("crab.png");
		ImageIcon mush = new ImageIcon("mush.png");
		ImageIcon patch = new ImageIcon("patch.png");
		ImageIcon crushed = new ImageIcon("stepped.png");
		
		if (mapChoice == 8) {
			Obstacle.add(Gui.squares[2][2]);
			Obstacle.add(Gui.squares[2][3]);
			Obstacle.add(Gui.squares[1][2]);
			Obstacle.add(Gui.squares[1][3]);
			Obstacle.add(Gui.squares[4][4]);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					if (Obstacle.contains(Gui.squares[i][j])) {
						Gui.squares[i][j].setIcon(null);
					}
				}
			}
			Gui.squares[1][2].setIcon(boldL);
			Gui.squares[1][3].setIcon(boldT);
			Gui.squares[2][2].setIcon(boldB);
			Gui.squares[2][3].setIcon(boldR);
			Gui.squares[4][4].setIcon(rock);

			int a = 7;

			for (int b = 0; b < 7; b++) {
				Obstacle.add(Gui.squares[a][b]);
				Gui.squares[a][b].setIcon(treeT);
			}
			for (int c = 9; c < 16; c++) {
				Obstacle.add(Gui.squares[a][c]);
				Gui.squares[a][c].setIcon(treeT);
			}
		} else if (mapChoice == 13) {
			Obstacle.add(Gui.squares[6][5]);

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 16; j++) {
					if (Obstacle.contains(Gui.squares[i][j])) {
						Gui.squares[i][j].setIcon(rock);
					}
				}
			}

			int a = 0;

			for (int b = 0; b < 7; b++) {
				Obstacle.add(Gui.squares[a][b]);
				Gui.squares[a][b].setIcon(treeB);
			}
			for (int c = 9; c < 16; c++) {
				Obstacle.add(Gui.squares[a][c]);
				Gui.squares[a][c].setIcon(treeB);
			}
			Obstacles.Obstacle.add(Gui.squares[4][4]);
			Obstacles.Obstacle.add(Gui.squares[3][4]);
			Gui.squares[4][4].setIcon(treeB);
			Gui.squares[3][4].setIcon(treeT);
		} else if (mapChoice == 2 || mapChoice == 3 || mapChoice == 4) {
			for (int b = 0; b < 16; b++) {
				Obstacle.add(Gui.squares[4][b]);
			}
		} else if (mapChoice == 1) {
			Obstacle.add(Gui.squares[4][15]);
			Obstacle.add(Gui.squares[5][14]);
			Obstacle.add(Gui.squares[6][13]);
			Obstacle.add(Gui.squares[7][12]);
			
			if(p.playerx == 15 && p.playery == 5){
				stepped = true;
				Gui.dialogueBox("Did I step on something? Guess not.");
			}
			
			if(stepped == true){
				Gui.squares[5][15].setIcon(crushed);
				Obstacle.add(Gui.squares[5][15]);
			}else{
				Gui.squares[5][15].setIcon(crab);
			}
		} else if (mapChoice == 6 || mapChoice == 11 || mapChoice == 16){
			for (int b = 0; b < 8; b++){
				Obstacle.add(Gui.squares[b][12]);
			}
		} else if (mapChoice == 21){
			Obstacle.add(Gui.squares[0][12]);
			Obstacle.add(Gui.squares[1][13]);
			Obstacle.add(Gui.squares[2][14]);
			Obstacle.add(Gui.squares[3][15]);
		} else if (mapChoice == 22 || mapChoice == 23 || mapChoice == 24){
			for (int b = 0; b < 16; b++){
				Obstacle.add(Gui.squares[3][b]);
			}
		} else if (mapChoice == 25){
			Obstacle.add(Gui.squares[3][0]);
			Obstacle.add(Gui.squares[2][1]);
			Obstacle.add(Gui.squares[1][2]);
			Obstacle.add(Gui.squares[0][3]);
		} else if (mapChoice == 10 || mapChoice == 15 || mapChoice == 20){
			for (int b = 0; b < 8; b++){
				Obstacle.add(Gui.squares[b][3]);
			}
		} else if (mapChoice == 5){
			Obstacle.add(Gui.squares[7][3]);
			Obstacle.add(Gui.squares[6][2]);
			Obstacle.add(Gui.squares[5][1]);
			Obstacle.add(Gui.squares[4][0]);
		} else if (mapChoice == 7) {
			Obstacle.add(Gui.squares[7][15]);
			Gui.squares[7][15].setIcon(rock);
		} else if (mapChoice == 9){
			for (int b = 0; b < 16; b++){
				Obstacle.add(Gui.squares[7][b]);
				Gui.squares[7][b].setIcon(treeT);
			}
		} 
		if (mapChoice == 14){
			for (int b = 0; b < 16; b++){
				Obstacle.add(Gui.squares[0][b]);
				Gui.squares[0][b].setIcon(treeB);
			}
			Obstacle.add(Gui.squares[1][8]);
			Gui.squares[1][8].setIcon(patch);
		} 
		if (mapChoice == 18){
			Obstacle.add(Gui.squares[5][6]);
			Gui.squares[5][6].setIcon(mush);;
		} 
		if (mapChoice == 2){
			Obstacle.add(Gui.squares[4][0]);
			Obstacle.add(Gui.squares[5][0]);
			Gui.squares[5][0].setIcon(rock);
		}
		if (mapChoice == 3){
			Obstacle.remove(Gui.squares[3][2]);
			Obstacle.add(Gui.squares[2][2]);
		}
		if(mapChoice==4){
			Obstacle.add(Gui.squares[6][8]);
			Gui.squares[6][8].setIcon(crab);
			Obstacle.add(Gui.squares[5][7]);
			Gui.squares[5][7].setIcon(rock);
		}
		if(mapChoice==5){
			Obstacle.add(Gui.squares[7][0]);
			Gui.squares[7][0].setIcon(rock);
		}
		if(mapChoice==6){
			Obstacle.add(Gui.squares[4][3]);
			Gui.squares[4][3].setIcon(rock);
		}
		if(mapChoice==7){
			Obstacle.add(Gui.squares[2][3]);
			Gui.squares[4][2].setIcon(rock);
		}
		if(mapChoice==9){
			Obstacle.add(Gui.squares[6][3]);
			Gui.squares[4][2].setIcon(rock);
			Obstacle.add(Gui.squares[3][8]);
			Gui.squares[3][8].setIcon(rock);
			Gui.squares[5][13].setIcon(rock);
			Obstacle.add(Gui.squares[5][13]);
		}
		if(mapChoice==10){
			Obstacle.add(Gui.squares[3][2]);
			Gui.squares[3][2].setIcon(rock);
		}
		if(mapChoice==12){
			Obstacle.add(Gui.squares[1][10]);
			Obstacle.add(Gui.squares[2][10]);
			Obstacle.add(Gui.squares[3][10]);
			Obstacle.add(Gui.squares[4][10]);
			Obstacle.add(Gui.squares[5][10]);
			Obstacle.add(Gui.squares[6][10]);
			Obstacle.add(Gui.squares[2][11]);
			Obstacle.add(Gui.squares[3][12]);
			Obstacle.add(Gui.squares[4][13]);
			Obstacle.add(Gui.squares[5][12]);
			Obstacle.add(Gui.squares[6][11]);
			Obstacle.add(Gui.squares[7][10]);
			Obstacle.add(Gui.squares[3][9]);
			Obstacle.add(Gui.squares[3][8]);
			Obstacle.add(Gui.squares[3][7]);
			Obstacle.add(Gui.squares[3][6]);
			Obstacle.add(Gui.squares[3][5]);
			Obstacle.add(Gui.squares[3][8]);
			Obstacle.add(Gui.squares[3][7]);
			Obstacle.add(Gui.squares[3][6]);
			Obstacle.add(Gui.squares[3][5]);
			Obstacle.add(Gui.squares[5][9]);
			Obstacle.add(Gui.squares[5][9]);
			Obstacle.add(Gui.squares[5][8]);
			Obstacle.add(Gui.squares[5][7]);
			Obstacle.add(Gui.squares[5][6]);
			Obstacle.add(Gui.squares[5][5]);
			Obstacle.add(Gui.squares[4][5]);
			
			
			Gui.squares[1][10].setIcon(rock);
			Gui.squares[2][10].setIcon(rock);
			Gui.squares[3][10].setIcon(rock);
			Gui.squares[4][10].setIcon(rock);
			Gui.squares[5][10].setIcon(rock);
			Gui.squares[6][10].setIcon(rock);
			Gui.squares[2][11].setIcon(rock);
			Gui.squares[3][12].setIcon(rock);
			Gui.squares[4][13].setIcon(rock);
			Gui.squares[5][12].setIcon(rock);
			Gui.squares[6][11].setIcon(rock);
			Gui.squares[7][10].setIcon(rock);
			Gui.squares[3][9].setIcon(rock);
			Gui.squares[3][8].setIcon(rock);
			Gui.squares[3][7].setIcon(rock);
			Gui.squares[3][6].setIcon(rock);
			Gui.squares[3][5].setIcon(rock);
			Gui.squares[5][9].setIcon(rock);
			Gui.squares[5][8].setIcon(rock);
			Gui.squares[5][7].setIcon(rock);
			Gui.squares[5][6].setIcon(rock);
			Gui.squares[5][5].setIcon(rock);
			Gui.squares[4][5].setIcon(rock);
		}
		if(mapChoice==14){
			Gui.squares[2][2].setIcon(rock);
			Gui.squares[2][3].setIcon(rock);
			Obstacle.add(Gui.squares[2][2]);
			Obstacle.add(Gui.squares[2][3]);
		}
		if(mapChoice==16){
			Gui.squares[4][6].setIcon(rock);
		}
		if(mapChoice==17){
			
		}
	}

	public static boolean movementCheck(int y, int x) {
		boolean variable = true;
		// top
		if (Obstacle.contains(Gui.squares[x][y])) {
			if (ActionListeners.up) {
				variable = false;
			}
			// bot
			else if (ActionListeners.down) {
				variable = false;
			}
			// left
			else if (ActionListeners.right) {
				variable = false;
			}
			// right
			else if (ActionListeners.left) {
				variable = false;
			} else {
				return true;
			}
		}
		return variable;
	}

	public static boolean itemCheck() {
		boolean isthereitem=false;
		if (ActionListeners.right) {
			if (movementCheck((Player.playerx + 1), Player.playery)) {
				
			}
			if (ActionListeners.left) {
				if (movementCheck((Player.playerx - 1), Player.playery)) {

				}

			}
			if (ActionListeners.up) {
				if (movementCheck(Player.playerx, (Player.playery - 1))) {

				}

			}
			if (ActionListeners.down) {
				if (movementCheck(Player.playerx, (Player.playery + 1))) {

				}

			}
			
		}
		return isthereitem;
		
	}
public static void checkDialogue(){
	double y = Math.random();
	if(Map.mapChoice==1||Map.mapChoice==2||Map.mapChoice==3||Map.mapChoice==4||Map.mapChoice==5||Map.mapChoice==6||Map.mapChoice==10||Map.mapChoice==11
			||Map.mapChoice==15||Map.mapChoice==16||Map.mapChoice==20||Map.mapChoice==21||Map.mapChoice==22||Map.mapChoice==23||Map.mapChoice==24||Map.mapChoice==25){
		if(y>.66){
			randDialogue();
		}
		else if(y>.4&&y<.66){
			Gui.dialogueBox("Is that a ship?");
		}
		else if(y>.2&&y<.4){
			Gui.dialogueBox("I hate crabs..");
		}
		else if(y<.2){
			Gui.dialogueBox("It seems im stranded here :(");
		}
		
	}
	else if(Map.mapChoice==7||Map.mapChoice==8||Map.mapChoice==9||Map.mapChoice==12){
		if(y>.66){
			randDialogue();
		}
		else if(y>.4&&y<.66){
			Gui.dialogueBox("Kiss my grass.");
		}
		else if(y>.2&&y<.4){
			Gui.dialogueBox("I have no idea what im doing");
		}
		else if(y<.2){
			Gui.dialogueBox("I should explore more.");
		}
	}
	else if(Map.mapChoice==13||Map.mapChoice==14||Map.mapChoice==17||Map.mapChoice==18||Map.mapChoice==19){
		if(y>.66){
			randDialogue();
		}
		else if(y>.4&&y<.66){
			Gui.dialogueBox("The mushroom land is wide... For a mushroom.");
		}
		else if(y>.2&&y<.4){
			Gui.dialogueBox("Where can I find a note?");
		}
		else if(y<.2){
			Gui.dialogueBox("Trees are the only things I can talk to here.");
		}
	}
	

}
public static void randDialogue(){
double x = Math.random();
if(x<.1){
	Gui.dialogueBox("Hmm.");
}
else if(x>.1&&x<.2){
	Gui.dialogueBox("I wish i had my meme page with me :C");
}
else if(x>.2&&x<.3){
	Gui.dialogueBox("What are you even trying to interact with?");
}
else if(x>.3&&x<.4){
	Gui.dialogueBox("Guess what my favorite band is...Got it? Its One direction. Get it? Cause i can't turn?");
}
else if(x>.4&&x<.5){
	Gui.dialogueBox("Hi Errlin!");
}
else if(x>.5&&x<.6){
	Gui.dialogueBox("Do you ever feel like you are being controlled too?");
}
else if(x>.6&&x<.7){
	Gui.dialogueBox("The best part of the game comes up if you hit Options, then exit. ");
}
else if(x>.7&&x<.8){
	Gui.dialogueBox("I'm actually quite the intelligent AI, but my creator couldnt develop me proper legs.");
}
else if(x>.8&&x<.9){
	Gui.dialogueBox("I have a wife and kids please send help");
}
}
}
