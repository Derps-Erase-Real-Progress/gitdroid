package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Fetch {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Fetch(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String fetch() {
		
		return "Called fetch";
	}//close fetch
	
}//close Git_Fetch
