package com.github.sashacrofter.gitdroid;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.InitCommand;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public class AGit
{
	private final File dir; //Absolute path for the directory this AGit was created at
	
	private Git git;
	private Repository repo;
	
	/**
	 * Creates AGit object to interact with based on the current working directory.
	 * Any time the user calls $git, there needs to be an AGit object to
	 * interact with it.
	 * @param CWD Current Working Directory
	 */
	public AGit(File CWD)
	{
		this.dir = CWD.getAbsoluteFile();
		try {
			repo = new FileRepositoryBuilder()
					.setGitDir(CWD)
					.readEnvironment()
					.findGitDir()
					.build();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TODO make new repository still
		
		git = new Git(null);
	}
	
	/**
	 * @return Current Wo
	 */
	public File getDir()
	{
		return this.dir;
	}
	
	/**
	 * Saves changes (such as those by $git add [file],) and should be called
	 * prior to no longer using this AGit instance.
	 * @return true if successful, false if saving (and therefore deletion)
	 * has failed.
	 */
	public boolean save()
	{
		//Does anything need to be saved? Wouldn't JGit handle that anyway?
		//TODO make sure things are saved properly (but don't save this AGit)
		//We could use this.finalize() to actually get rid of this instance,
		//but using this.finalize() is bad practice.
		return true;
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
		else if(cmd.equals("init")) this.init(args, argmap);
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
	
	/**
	 * Adds all untracked files specified in args recursively
	 * @param args
	 * @param argmap
	 * @return
	 */
	private String add(String[] args, HashMap<String, String> argmap)
	{
		
		return "Called add";
	}
	
	/**
	 * equivalent to $ git init
	 * @param args If specified and args[0] is a valid file, initializes in that
	 * directory instead.
	 * @param argmap
	 * @return
	 */
	private String init(String[] args, HashMap<String, String> argmap)
	{
		File initFile = this.getDir(); //Set initiation location to dir by default
		
		if(args.length > 0) //Allow init of non-this.getDir() directory
		{
			File f = new File(args[0]);
			if(f.exists() && f.isDirectory()) initFile = f;
		}
			
		InitCommand init = Git.init(); //Create InitCommand object to call
        init.setDirectory(initFile); //Set the directory to the specified one
        init.call(); //Create the repository
		return "Called init";
	}
}
