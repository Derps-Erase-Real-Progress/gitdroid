package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Mv {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Mv(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String mv() {
		
		return "Called mv";
	}//close mv
	
}//close Git_Mv
