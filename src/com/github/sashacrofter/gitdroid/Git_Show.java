package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Show {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Show(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String show() {
		
		return "Called show";
	}//close show
	
}//close Git_Show
