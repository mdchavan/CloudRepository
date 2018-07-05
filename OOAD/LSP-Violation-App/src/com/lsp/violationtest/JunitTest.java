package com.lsp.violationtest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lsp.violation.Rectangle;
public class JunitTest {
	@Test

public	void shouldnotChangedHeightIfWidthChanged(Rectangle r){
		int before=r.getHeight();
		r.setWidth(20);
		int after=r.getHeight();
		assertEquals(before,after);
	}

}
