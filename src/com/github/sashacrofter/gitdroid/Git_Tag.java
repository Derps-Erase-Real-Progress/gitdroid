package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Tag {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Tag(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String tag() {
		
		return "Called tag";
	}//close tag
	
}//close Git_Tag
