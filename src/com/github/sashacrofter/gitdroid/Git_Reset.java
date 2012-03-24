package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Reset {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Reset(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String reset() {
		
		return "Called reset";
	}//close reset
	
}//close Git_Reset
