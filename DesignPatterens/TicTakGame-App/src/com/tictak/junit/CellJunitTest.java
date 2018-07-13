package com.tictak.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tictak.game.Cell;
import com.tictak.game.Mark;

public class CellJunitTest {
	Cell cell=new Cell();
	@Test
		public void shouldMarkToCross(){
		Mark actual=Mark.CROSS;
		cell.setMark(Mark.CROSS);
		Mark expected=cell.getMark();
			assertEquals(actual,expected);
		}
	@Test
		public void shouldMarkToNaught(){
		Mark actual=Mark.NAUGHT;
		cell.setMark(Mark.NAUGHT);
		Mark expected=cell.getMark();
			assertEquals(actual,expected);
		
	}
	@Test
	public void shouldMarkToEmpty(){
	Mark actual=Mark.EMPTY;
	cell.setMark(Mark.EMPTY);
	Mark expected=cell.getMark();
		assertEquals(actual,expected);
	
	}
	@Test
	public void shouldNotMarkIfAlreadyMark(){
	cell.setMark(Mark.CROSS);
	assertTrue(cell.isEmpty());
	}

}
