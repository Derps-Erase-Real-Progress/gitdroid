package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Pull {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Pull(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String pull() {
		
		return "Called pull";
	}//close pull
	
}//close Git_Pull
