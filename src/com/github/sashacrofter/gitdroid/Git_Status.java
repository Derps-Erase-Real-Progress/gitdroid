package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Status {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Status(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String status() {
		
		return "Called status";
	}//close status
	
}//close Git_Status
