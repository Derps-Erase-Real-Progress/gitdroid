package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Commit {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Commit(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String commit() {
		
		return "Called commit";
	}//close commit
	
}//close Git_Commit
