package com.tictak.gametest;

import com.tictak.game.Board;
import com.tictak.game.GameAnalyzer;
import com.tictak.game.GameState;

public class GameAnalyzerTest {
	public static void main(String[] args) {
		Board board=new Board();
		
		System.out.println(" Board empty : "+board.isEmptyBoard());
		System.out.println(" Board full : "+board.isFullBoard());
		board.resetBoard();
		System.out.println("After reset board.");
		board.display();
		board.markCell(1, "0");
		board.markCell(2, "0");
		board.markCell(3, "x");
		board.markCell(4, "0");
		board.markCell(5, "0");
		board.markCell(6, "x");
		board.markCell(7, "x");
		board.markCell(8, "0");
		board.markCell(9, "0");
		System.out.println("After mark board.");
		board.display();
		
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState gameState=gameAnalyzer.analize();
		switch(gameState){
		case CROSSWON:
			System.out.println("Winner is : CROSSWON.");
			break;
		case NAUGHTWON:
			System.out.println("Winner is : NAUGHTWON.");
			break;
		case DRAW:
			System.out.println("DRAW  game.");
		case PLAYING:
			System.out.println("PLAYING  game.");
			break;
		}
		
		//board.markCell(1, "x");
		//board.display();
	
	}
}
