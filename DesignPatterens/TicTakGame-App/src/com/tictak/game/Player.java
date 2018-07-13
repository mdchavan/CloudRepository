package com.tictak.game;

public class Player {
	private String playerO;
	private String playerX;
	private String player;
	public Player(){
		this.playerO="0";
		this.playerX="x";
		this.player=this.playerO;
	}
	
	public String getPlayerO() {
		return playerO;
	}
	public String getPlayerX() {
		return playerX;
	}
	public String getPlayer(){
		if(player=="0")
			player=getPlayerX();
		else
			player=getPlayerO();
		return player;
	}
	
}
