package com.tictak.gametest;

import java.util.Scanner;

import com.tictak.game.Cell;

public class CellTest {
	public static void main(String args[]){
	Cell cell=new Cell();
	Scanner scanner=new Scanner(System.in);
	int pos;
	
	do{
		System.out.println("1 : Mark cell .");
		System.out.println("2 : Display cell .");
		System.out.println("3 : Exit .");
		
		System.out.println("Enter user input ");
		pos=scanner.nextInt();
		switch(pos){
		case 1:
			System.out.println("Enter  row position ");
			int row=scanner.nextInt();
			System.out.println("Enter  column position ");
			int column=scanner.nextInt();
			System.out.println("Enter  mark value");
			String mark=scanner.next();
			//cell.markCell(row, column, mark);
			break;
		case 2:
			//cell.display();
			
		}

	}while(pos!=3);
	}
}
