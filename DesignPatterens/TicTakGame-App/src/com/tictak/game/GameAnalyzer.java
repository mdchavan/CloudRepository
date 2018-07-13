package com.tictak.game;

public class GameAnalyzer {
	private Board board;
	private String markArray[];
	private GameState gameState;
	
	public GameAnalyzer(Board board){
		this.board=board;
		
	}
	
	public boolean hashWon(){
		markArray=board.getMarkArray();
		//gameState=GameState.DRAW;
		for(int i=1;i<=8;i++){
			switch(i){
			case 1:
				gameState = checkFirstRow();
				break;		
			case 2:
				gameState = checkSecondRow();
				break;
			case 3:
				gameState = checkThirdRow();
				break;
			case 4:
				gameState = checkFirstColumn();
				break;
			case 5:
				gameState = checkSecondColumn();
				break;
			case 6:
				gameState = checkThirdColumn();
				break;
			case 7:
				gameState = checkFirstDiagonal();
				break;
			case 8:
				gameState = checkSecondDiagonal();
				break;
			}	//switch(i)

		}	//for(8 time)loop
		if(gameState==GameState.CROSSWON||gameState==GameState.NAUGHTWON)
			return true;
		else
			return false;
	}	//hashWon()

	private GameState checkSecondDiagonal() {
		int countO;
		int countX;
		countO=countX=0;
			for(int j=2;j<=6;j=j+2){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkFirstDiagonal() {
		int countO;
		int countX;
		countO=countX=0;
			for(int j=0;j<=8;j=j+4){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkThirdColumn() {
		int countO;
		int countX;
		countO=countX=0;
			for(int j=2;j<=8;j=j+3){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkSecondColumn() {
		int countO;
		int countX;
		countO=countX=0;
			for(int j=1;j<=7;j=j+3){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkFirstColumn() {
		int countO;
		int countX;
		countO=countX=0;
			for(int j=0;j<=6;j=j+3){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkSecondRow() {
		int countO;
		int countX;
		countO=countX=0;
		for(int j=3;j<=5;j++){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkFirstRow() {
		int countO;
		int countX;
		countO=countX=0;
		for(int j=0;j<=2;j++){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}

	private GameState checkThirdRow() {
		int countO;
		int countX;
		countO=countX=0;
		for(int j=6;j<=8;j++){
			if(markArray[j]=="0")
				countO++;
			else if(markArray[j]=="x")
				countX++;
		}
		if(countO==3)
			gameState=GameState.NAUGHTWON;
		else if(countX==3)
			gameState=GameState.CROSSWON;
		return gameState;
	}
	
	public GameState analize(){
		if(hashWon())
			return gameState;
		else if(board.isFullBoard())
			return GameState.DRAW;
		else
			return GameState.PLAYING;
	}	//analyze()

}	//class
