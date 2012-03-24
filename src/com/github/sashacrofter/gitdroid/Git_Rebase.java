package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Rebase {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Rebase(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String rebase() {
		
		return "Called rebase";
	}//close rebase
	
}//close Git_Rebase
