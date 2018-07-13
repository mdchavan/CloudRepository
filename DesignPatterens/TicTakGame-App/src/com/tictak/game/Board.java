package com.tictak.game;

public class Board {
	String markArray[];
	Cell cells[];
	
	public String[] getMarkArray() {
		return markArray;
	}
	
	public Cell[] getCells() {
		return cells;
	}
	
	public Board(){
		markArray=new String[9];
		cells=new Cell[9];
		for(int i=0;i<9;i++){
			cells[i]=new Cell();
		}
		}
	
	
	public void markCell(int position,String mark){
			switch(mark){
			case "0":
				cells[position-1].setMark(Mark.NAUGHT);
				markArray[position-1]=cells[position-1].getMark().toString();
				break;
			case "x":
				cells[position-1].setMark(Mark.CROSS);
				markArray[position-1]=cells[position-1].getMark().toString();
				break;
			}
	}
	
	public boolean isEmptyCellPosition(int position){
		if(markArray[position-1]==null)
			return true;
			else 
				return false;
	}
	public void display(){
		for(int i=0;i<9;i++){
			System.out.print("  "+markArray[i]);
			if((i+1)%3==0)
				System.out.println();
		}
	}
	public boolean isEmptyBoard(){
		int count=0;
		for(int i=0;i<9;i++){
			if(markArray[i]==null)
			count++;
		}
		if(count==9)
			return true;
		else 
			return false;
		}
	public boolean isFullBoard(){
		int count=0;
		for(int i=0;i<9;i++){
			if(markArray[i]!=null)
				count++;
		}
		if(count==9)
			return true;
		else 
			return false;
		}
	public void resetBoard(){
		for(int i=0;i<9;i++){
			markArray[i]=null;
		}
	}

}
