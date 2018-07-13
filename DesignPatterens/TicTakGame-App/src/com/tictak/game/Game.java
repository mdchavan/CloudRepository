package com.tictak.game;

public class Game {
	private Board board;
	private Player player;
	private GameAnalyzer gameAnalyzer;
	
	public Game(){
		this.board=new Board();
		this.player=new Player();
		this.gameAnalyzer=new GameAnalyzer(this.board);
	}
	
	
	public String getPlayerName(){
		return player.getPlayer();
	}
	public GameState getGameState(){
		return gameAnalyzer.analize();
	}
	public void markCellAtPosition(int position,String mark){
		board.markCell(position, mark);
	}
	public boolean isBoardFull(){
		return board.isFullBoard();
	}
	public boolean isBoardEmpty(){
		return board.isEmptyBoard();
	}
	public String[] getMarkArray(){
		return board.getMarkArray();
	}
	public boolean isCellPositionEmpty(int position){
		return board.isEmptyCellPosition(position);
	}

}
