package com.github.sashacrofter.gitdroid;

import java.io.File;
import java.util.HashMap;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.InitCommand;

public class Git_Init extends GitBase {
	
	
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		File initFile = agit.getDir(); //Set initiation location to dir by default
		
		if(args.length > 0) //Allow init of non-this.getDir() directory
		{
			File f = new File(args[0]);
			if(f.exists() && f.isDirectory()) initFile = f;
		}
			
		InitCommand init = Git.init(); //Create InitCommand object to call
        init.setDirectory(initFile); //Set the directory to the specified one
        init.call(); //Create the repository
		
		return "Called Init";
	}
	
	/**
	 * equivalent to $ git init
	 * @param args If specified and args[0] is a valid file, initializes in that
	 * directory instead.
	 * @param argmap
	 * @return
	 */
	
}//close Git_Init
