package com.tictak.game;

import java.util.Scanner;

public class GameConsole {
	public static String player;
	public static Game game=new Game();
	public static void main(String args[]){
		System.out.println("Welcome To Tic Tak Game :");
		
		while(game.getGameState()==GameState.PLAYING){
		player=game.getPlayerName();
		markCell();
		display();
		}
		System.out.println("==================================================================");
		switch(game.getGameState()){
		case CROSSWON:
			System.out.println("\nPlayer : "+player+" is "+game.getGameState()+" the game.\n");
			break;
		case NAUGHTWON :
			System.out.println("\nPlayer : "+player+" is "+game.getGameState()+" the game.\n");
			break;
		case DRAW:
			System.out.println("\n"+game.getGameState()+" the game.\n");
			break;
		}
		display();
	}

	private static void display() {
		String markArray[]=game.getMarkArray();
			for(int i=0;i<9;i++){
				System.out.print("  "+markArray[i]);
				if((i+1)%3==0)
					System.out.println();
			}
	}

	private static void markCell() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Player is : "+player);
		System.out.println("Enter cell position in between 1 to 9 .");
		int position=scanner.nextInt();
		if(position>=1&&position<=9){
			if(game.isCellPositionEmpty(position))
				game.markCellAtPosition(position, player);
			else{
				System.out.println("\nAlready mark position  : "+position);
				markCell();
			}
		}
		else{
			System.out.println("Invalid cell position : "+position);
			markCell();
		}
	}
}
