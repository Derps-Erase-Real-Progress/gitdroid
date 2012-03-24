package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Merge {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Merge(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String merge() {
		
		return "Called merge";
	}//close merge
	
}//close Git_Merge
