package com.github.sashacrofter.gitdroid;

import java.io.File;
import java.util.HashMap;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.InitCommand;

public class Git_Init {
	
	private String [] args;
	private HashMap <String, String> argmap;
	private final File dir;
	
	public Git_Init(String [] _args, HashMap <String, String> _argmap, File _dir) {
		super();
		this.args = _args;
		this.argmap = _argmap;
		this.dir = _dir;
	}//close constructor
	
	/**
	 * @return current directory
	 */
	
	private File getDir()
	{
		return this.dir;
	}
	
	/**
	 * equivalent to $ git init
	 * @param args If specified and args[0] is a valid file, initializes in that
	 * directory instead.
	 * @param argmap
	 * @return
	 */
	protected String init()
	{
		File initFile = this.getDir(); //Set initiation location to dir by default
		
		if(args.length > 0) //Allow init of non-this.getDir() directory
		{
			File f = new File(this.args[0]);
			if(f.exists() && f.isDirectory()) initFile = f;
		}
			
		InitCommand init = Git.init(); //Create InitCommand object to call
        init.setDirectory(initFile); //Set the directory to the specified one
        init.call(); //Create the repository
		return "Called init";
	}//close init
}//close Git_Init
