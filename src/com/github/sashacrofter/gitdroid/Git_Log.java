package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Log {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Log(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String log() {
		
		return "Called log";
	}//close log
	
}//close Git_Log
