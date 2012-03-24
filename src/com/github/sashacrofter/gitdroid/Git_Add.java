package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class Git_Add {
	
	private String [] args;
	private HashMap <String, String> argmap;
	
	public Git_Add(String [] _args, HashMap <String, String> _argmap) {
		super();
		this.args = _args;
		this.argmap = _argmap;
	}
	
	//TODO add git calls and argmap parsing
	
	/**
	 * Adds all untracked files specified in args recursively
	 * @param args
	 * @param argmap
	 * @return
	 */
	protected String add()
	{
		
		return "Called add";
	}

}
