package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Branch {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Branch(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String branch() {
		
		return "Called branch";
	}//close branch
	
}//close Git_Branch
