package com.github.sashacrofter.gitdroid.git;

import java.util.HashMap;


public class Git_Commit extends GitBase {
	
	private static HashMap <String, String> expandMap;
	
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		//TODO do JGit add call
		return "Called Commit";
	}
	
	public static void initExpandMaps()
	{
		expandMap = new HashMap<String, String>();
		expandMap.put("-a", "--all");
		expandMap.put("-p", "--patch");
		expandMap.put("-C", "--reuse-message");
		expandMap.put("-c", "--reedit-message");
		expandMap.put("-F", "--file");
		expandMap.put("-t", "--template");
		expandMap.put("-s", "--signoff");
		expandMap.put("-n", "--no-verify");
		expandMap.put("-e", "--edit");
		expandMap.put("-i", "--include");
		expandMap.put("-o", "--only");
		expandMap.put("-u", "--untracked-files");
		expandMap.put("-v", "--verbose");
		expandMap.put("-q", "--quiet");
		
		
		//TODO we may need to add the option -- to the optionValueList
	}
	
}//close Git_Commit
