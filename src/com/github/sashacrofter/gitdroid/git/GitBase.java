package com.github.sashacrofter.gitdroid.git;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class GitBase
{
	@SuppressWarnings("unused")
	private static HashMap<String, String> expandMap;
	@SuppressWarnings("unused")
	private static ArrayList<String> optionValueList;
	
	/**
	 * Performs the proper call to JGit, with no other parameters needed
	 * @param agit The AGit calling the method.
	 * @param args The basic, non-option arguments in the form where
	 * $ git add [file] would result in arg[0], arg[1], and arg[2] are
	 * "git" "add" and "[file]"
	 * @param argmap The options and their values in HashMap form. Basic
	 * use would work on the boolean argmap.contains("--option") but
	 * also might retrieve the value from the option's key.
	 */
	public static String run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		return "Method not defined in this class.";
	}
	
	public static void initExpandMap()
	{
		expandMap = new HashMap<String, String>();
		optionValueList = new ArrayList<String>();
	}
}
