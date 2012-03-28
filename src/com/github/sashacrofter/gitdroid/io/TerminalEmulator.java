package com.github.sashacrofter.gitdroid.io;

import java.io.File;

import com.github.sashacrofter.gitdroid.git.AGit;
import com.github.sashacrofter.gitdroid.git.GitInterpreter;

public class TerminalEmulator
{
	//TODO MOCKUP FILE
	private final File defaultDir;
	private final GitInterpreter gitI;
	private AGit agit;
	
	public TerminalEmulator()
	{
		this.defaultDir = new File("/sdcard/");
		this.gitI = new GitInterpreter();
		this.agit = new AGit(this.defaultDir);
	}
	
	//TODO print output to TUI
	public void execute(String command)
	{
		//TODO output properly
		String output;
		//This does what needs to be done for any command of the form $ git
		if(gitI.shouldParse(command)) 
		{
			output = this.gitI.parseToAGit(agit, command);
		}
		else
		{
			//parse the command in vanilla terminal emulator
		}
	}
}
