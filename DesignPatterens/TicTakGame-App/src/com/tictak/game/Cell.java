package com.tictak.game;

public class Cell {
	private Mark mark;
	
	public Cell(){
		
	}
	
	public void setMark(Mark mark){
		this.mark=mark;
	}
	public Mark getMark(){
		return mark;
	}
	public boolean isEmpty(){
		if(mark==Mark.EMPTY)
			return true;
		else
			return false;
	}
	
}
