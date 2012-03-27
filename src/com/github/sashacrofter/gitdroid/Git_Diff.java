package com.github.sashacrofter.gitdroid;

import java.util.HashMap;


public class Git_Diff extends GitBase {
	
	private static HashMap <String, String> expandMap;
	
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		//TODO do JGit add call
		return "Called Diff";
	}

	public static void initExpandMaps()
	{
		expandMap = new HashMap<String, String>();
		expandMap.put("-p", "--patch");
		expandMap.put("-u", "--patch");
		expandMap.put("-U", "--unified");
		expandMap.put("-B", "--break-rewrites");
		expandMap.put("-M", "--find-renames");
		expandMap.put("-C", "--find-copies");
		expandMap.put("-D", "--irreversible-delete");
		expandMap.put("-a", "--text");
		expandMap.put("-b", "--ignore-space-change");
		expandMap.put("-w", "--ignore-all-space");
		expandMap.put("-W", "--function-context");
		expandMap.put("--textconv", "--no-textconv");
		
		//TODO we may need to add the option -- to the optionValueList
	}
	
}//close Git_Diff
