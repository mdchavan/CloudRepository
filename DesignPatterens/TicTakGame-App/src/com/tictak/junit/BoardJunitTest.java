package com.tictak.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tictak.game.Board;

public class BoardJunitTest {
	Board board=new Board();
@Test
	public void shouldEmptyBoard(){
		assertTrue(board.isEmptyBoard());
	}
@Test
public void shouldFullBoard(){
	assertTrue(!board.isFullBoard());
}
@Test
public void shouldAlreadyMarkPosition(){
	board.markCell(2, "x");
	assertTrue(board.isEmptyCellPosition(1));
}
}
