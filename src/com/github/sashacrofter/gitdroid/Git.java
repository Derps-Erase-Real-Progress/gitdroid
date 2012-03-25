package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public abstract class Git
{
	public abstract void run(AGit agit, String[] args, HashMap<String, String> argmap);
}
