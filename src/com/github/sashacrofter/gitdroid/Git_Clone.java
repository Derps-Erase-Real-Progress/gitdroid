package com.github.sashacrofter.gitdroid;

import java.util.HashMap;


public class Git_Clone extends GitBase {
	
	private static HashMap <String, String> expandMap;
	
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		//TODO do JGit add call
		return "Called Clone";
	}
	
	public static void initExpandMaps()
	{
		expandMap = new HashMap<String, String>();
		expandMap.put("-s", "--shared");
		expandMap.put("-q", "--quiet");
		expandMap.put("-v", "--verbose");
		expandMap.put("-n", "--no-checkout");
		expandMap.put("-o", "--origin");
		expandMap.put("-b", "--branch");
		expandMap.put("-u", "--unload-pack");
		expandMap.put("-c", "--config");
		expandMap.put("--recursive", "--recurse-submodules");
		
		//TODO we may need to add the option -- to the optionValueList
	}

}//close Git_Clone
