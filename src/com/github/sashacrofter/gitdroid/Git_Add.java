package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.errors.NoFilepatternException;


public class Git_Add extends GitBase {
	
	/**
	 * Adds all untracked files specified in args recursively
	 */
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		AddCommand add = agit.getGit().add();
		try {
			add.addFilepattern(args[2]).call(); //TODO add multiple file support
		} catch (NoFilepatternException e) { //TODO never hit this catch
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TODO do JGit add call
		return "Called Add";
	}

	
	//TODO add git calls and argmap parsing
	
	

}//close Git_Add
