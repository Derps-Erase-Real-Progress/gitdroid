package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Diff {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Diff(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String diff() {
		
		return "Called diff";
	}//close diff
	
}//close Git_Diff
