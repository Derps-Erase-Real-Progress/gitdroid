package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Grep {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Grep(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String grep() {
		
		return "Called grep";
	}//close grep
	
}//close Git_Grep
