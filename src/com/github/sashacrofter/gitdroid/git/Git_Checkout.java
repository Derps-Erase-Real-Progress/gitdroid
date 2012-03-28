package com.github.sashacrofter.gitdroid.git;

import java.util.HashMap;


public class Git_Checkout extends GitBase {
	
	private static HashMap <String, String> expandMap;
	
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		//TODO do JGit add call
		return "Called Checkout";
	}
	
	public static void initExpandMaps()
	{
		expandMap = new HashMap<String, String>();
		expandMap.put("-q", "--quiet");
		expandMap.put("-f", "--force");
		expandMap.put("-t", "--track");
		expandMap.put("-m", "--merge");
		expandMap.put("-p", "--patch");
		
		//TODO we may need to add the option -- to the optionValueList
	}

}//close Git_Checkout
