package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Rm {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Rm(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String rm() {
		
		return "Called rm";
	}//close rm
	
}//close Git_Rm
