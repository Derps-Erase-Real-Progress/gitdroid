package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Checkout {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Checkout(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}//close constructor
	
	/**
	 * 
	 * @return
	 */
	
	protected String checkout() {
		
		return "Called checkout";
	}//close checkout
	
}//close Git_Checkout
