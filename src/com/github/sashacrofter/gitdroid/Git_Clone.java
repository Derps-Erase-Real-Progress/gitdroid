package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Clone {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Clone(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String clone() {
		
		return "Called clone";
	}//close clone
	
}//close Git_Clone
