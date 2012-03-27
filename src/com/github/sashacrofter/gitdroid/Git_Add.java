package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.errors.NoFilepatternException;


public class Git_Add extends GitBase {
	
	private static HashMap <String, String> expandMap;
	
	/**
	 * Adds all untracked files specified in args recursively
	 */
	
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{	
		AddCommand add = agit.getGit().add();
		try {
			add.addFilepattern(args[2]).call(); //TODO add multiple file support
		} catch (NoFilepatternException e) { //TODO never hit this catch
			e.printStackTrace();
		}
		//TODO do JGit add call
		return "Called Add";
	}

	
	//TODO add git calls and argmap parsing
	
	public static void initExpandMaps()
	{
		expandMap = new HashMap<String, String>();
		expandMap.put("-n", "--dry-run");
		expandMap.put("-v", "--verbose");
		expandMap.put("-f", "--force");
		expandMap.put("-i", "--interactive");
		expandMap.put("-p", "--patch");
		expandMap.put("-e", "--edit");
		expandMap.put("-u", "--update");
		expandMap.put("-A", "--all");
		expandMap.put("-N", "--intent-to-add");
		
		//TODO we may need to add the option -- to the optionValueList
	}

}
