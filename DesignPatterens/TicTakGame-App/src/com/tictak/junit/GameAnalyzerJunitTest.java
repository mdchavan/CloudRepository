package com.tictak.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tictak.game.Board;
import com.tictak.game.GameAnalyzer;
import com.tictak.game.GameState;

public class GameAnalyzerJunitTest {
	@Test
	public void chechRowFirst(){
		Board board=new Board();
		board.markCell(1, "0");
		board.markCell(2, "0");
		board.markCell(3, "0");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.NAUGHTWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechRowSecond(){
		Board board=new Board();
		board.markCell(4, "x");
		board.markCell(5, "x");
		board.markCell(6, "x");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.CROSSWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechRowThird(){
		Board board=new Board();
		board.markCell(7, "0");
		board.markCell(8, "0");
		board.markCell(9, "0");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.NAUGHTWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechColumnFirst(){
		Board board=new Board();
		board.markCell(1, "x");
		board.markCell(4, "x");
		board.markCell(7, "x");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.CROSSWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechColumnSecond(){
		Board board=new Board();
		board.markCell(2, "0");
		board.markCell(5, "0");
		board.markCell(8, "0");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.NAUGHTWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechColumnThird(){
		Board board=new Board();
		board.markCell(3, "0");
		board.markCell(6, "0");
		board.markCell(9, "0");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.NAUGHTWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechDiagonalFirst(){
		Board board=new Board();
		board.markCell(1, "x");
		board.markCell(5, "x");
		board.markCell(9, "x");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.CROSSWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}
	@Test
	public void chechDiagonalSecond(){
		Board board=new Board();
		board.markCell(3, "0");
		board.markCell(5, "0");
		board.markCell(7, "0");
		GameAnalyzer gameAnalyzer=new GameAnalyzer(board);
		GameState actual=GameState.NAUGHTWON;
		GameState excepted=gameAnalyzer.analize();
		assertEquals(actual,excepted);
	}



}
