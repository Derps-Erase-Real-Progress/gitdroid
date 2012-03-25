package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public abstract class Git
{
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
	public static void run(AGit agit, String[] args, HashMap<String, String> argmap)
	{
		System.out.println("Method not defined in this class.");
	}
}
