package com.github.sashacrofter.gitdroid.git;

import java.util.HashMap;


public class Git_Bisect extends GitBase {
	
	private static HashMap <String, String> expandMap;
	
	/**
	 * Adds all untracked files specified in args recursively
	 */
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		//TODO do JGit add call
		return "Called Bisect";
	}
	
	public static void initExpandMaps()
	{
		expandMap = new HashMap<String, String>();
		expandMap.put("", "");
		
		//TODO we may need to add the option -- to the optionValueList
	}

}//close Git_Bisect
