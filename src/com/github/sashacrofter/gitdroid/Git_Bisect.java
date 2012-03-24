package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Bisect {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Bisect(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String bisect() {
		
		return "Called bisect";
	}//close bisect
	
}//close Git_Bisect
