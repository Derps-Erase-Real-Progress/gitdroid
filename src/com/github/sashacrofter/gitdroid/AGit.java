package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

public class AGit
{
	
	
	public AGit()
	{
		
	}
	
	/**
	 * Calls the proper Git method for any given pre-parsed command sequence.
	 * @param command The command following git.
	 * @param args The arguments not including options (or Strings following
	 * options that require Strings.)
	 * @param argmap The HashMap containing options (Key) and their values
	 * (Value) if any such were included.
	 * @return String The String output of the corresponding Git method.
	 */
	public String GitCall(String command, String[] args,
			HashMap<String, String> argmap)
	{
		//Prints if gets to the end without finding a matching command
		String commandNotFound = "Command not found.";
		//TODO print like in "$git" instead
		
		String cmd = command.toLowerCase();
		if(cmd.equals("add")) //TODO provide method calls to each of these
		{
			
		}
		else if(cmd.equals("bisect"))
		{
			
		}
		else if(cmd.equals("branch"))
		{
			
		}
		else if(cmd.equals("checkout"))
		{
			
		}
		else if(cmd.equals("clone"))
		{
			
		}
		else if(cmd.equals("commit"))
		{
			
		}
		else if(cmd.equals("diff"))
		{
			
		}
		else if(cmd.equals("fetch"))
		{
			
		}
		else if(cmd.equals("grep"))
		{
			
		}
		else if(cmd.equals("init"))
		{
			
		}
		else if(cmd.equals("log"))
		{
			
		}
		else if(cmd.equals("merge"))
		{
			
		}
		else if(cmd.equals("mv"))
		{
			
		}
		else if(cmd.equals("pull"))
		{
			
		}
		else if(cmd.equals("rebase"))
		{
			
		}
		else if(cmd.equals("reset"))
		{
			
		}
		else if(cmd.equals("rm"))
		{
			
		}
		else if(cmd.equals("show"))
		{
			
		}
		else if(cmd.equals("status"))
		{
			
		}
		else if(cmd.equals("tag"))
		{
			
		}
		return commandNotFound;
	}
	
	//TODO add git calls and argmap parsing
}
