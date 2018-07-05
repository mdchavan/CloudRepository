package com.dp.compositetest;

import com.dp.composite.Control;
import com.dp.composite.ControlGroup;

public class ControlGroupTest {

	public static void main(String[] args) {
		ControlGroup html=new ControlGroup("HTML");
		ControlGroup body=new ControlGroup("BODY");
		ControlGroup head=new ControlGroup("HEAD");
		ControlGroup div=new ControlGroup("DIV");
		ControlGroup title=new ControlGroup("TITLE");
		ControlGroup button=new ControlGroup("BUTTON");
		ControlGroup text=new ControlGroup("TEXT");
		
		Control br=new Control("br");

		html.addChildTag(head);
		html.addChildTag(title);
		html.addChildTag(body);
		body.addChildTag(div);
		div.addChildTag(button);
		div.addChildTag(text);
		
		html.generateHtml();
		
	}

}
