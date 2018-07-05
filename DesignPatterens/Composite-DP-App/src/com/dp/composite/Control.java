package com.dp.composite;

public class Control implements IHtmlTag {
	private String tagName;
	public Control(String tagName){
		this.tagName=tagName;
	}
	public String getTagName() {
		return tagName;
	}
	@Override
	public void generateHtml() {
		System.out.println("<"+tagName+">");
		System.out.println("</"+tagName+">");
	}

}
