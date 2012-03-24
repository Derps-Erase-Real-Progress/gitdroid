package com.github.sashacrofter.gitdroid;

import java.io.File;
import java.util.HashMap;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;

public class AGit
{
	private Git git;
	private Repository repo;
	
	/**
	 * Creates AGit object to interact with based on the current working directory
	 * @param CWD
	 */
	public AGit(File CWD)
	{
		//TODO make new repository
		
		//note to self: use baseRepoBuilder.setGitDir(CWD) to make git object probably
		
		//repo = new Repository(BaseRepositoryBuilder);
		git = new Git(null);
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
		//TODO provide method calls to each of these
		//TODO change logic to one-liners
		if(cmd.equals("add")) this.add(args, argmap);
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
			//TODO allow instantiation of a repository
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
	
	private String add(String[] args, HashMap<String, String> argmap)
	{
		
		return null;
	}
}
