package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtmlTag {
	private List <ControlGroup> tagList; 
	private String tagName;
	
	
	public ControlGroup(String tagName){
		this.tagName=tagName;
		this.tagList=new ArrayList<ControlGroup>();
	}
	
	public void addChildTag(ControlGroup tag){
		tagList.add(tag);
	}
	public List<ControlGroup> getTagList(){
		return tagList;
	}
	@Override
	public String getTagName() {
		return tagName;
	}
	@Override
	public void generateHtml() {
		System.out.println("<"+tagName+">");
		for(ControlGroup controlGroup:getTagList()){
			controlGroup.generateHtml();
		}
		System.out.println("</"+tagName+">");
	}
	
	

}
