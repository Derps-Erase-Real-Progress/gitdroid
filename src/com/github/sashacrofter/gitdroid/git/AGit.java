package com.github.sashacrofter.gitdroid.git;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.jgit.api.Git;
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
		
		git = new Git(repo);
	}//close constructor
	
	public File getDir() {
		return this.dir;
	}
	
	public Git getGit() {
		return this.git;
	}
	
	public Repository getRepo() {
		return this.repo;
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
	public String gitCall(String command, String[] args, HashMap<String, String> argmap) {
		//Prints if gets to the end without finding a matching command
		String commandNotFound = "Command not found.";
		String cmd = command.toLowerCase();
		
		if (cmd.equals("add")) return Git_Add.run(this, args, argmap);
		
		else if(cmd.equals("bisect")) return Git_Bisect.run(this, args, argmap);
		
		else if(cmd.equals("branch")) return Git_Branch.run(this, args, argmap);
		
		else if(cmd.equals("checkout")) return Git_Checkout.run(this, args, argmap);

		else if(cmd.equals("clone")) return Git_Clone.run(this, args, argmap);

		else if(cmd.equals("commit")) return Git_Commit.run(this, args, argmap);

		else if(cmd.equals("diff")) return Git_Diff.run(this, args, argmap);

		else if(cmd.equals("fetch")) return Git_Fetch.run(this, args, argmap);

		else if(cmd.equals("grep")) return Git_Grep.run(this, args, argmap);

		else if(cmd.equals("init")) return Git_Init.run(this, args, argmap);
		
		else if(cmd.equals("log")) return Git_Log.run(this, args, argmap);

		else if(cmd.equals("merge")) return Git_Merge.run(this, args, argmap);
		
		else if(cmd.equals("mv")) return Git_Mv.run(this, args, argmap);

		else if(cmd.equals("pull")) return Git_Pull.run(this, args, argmap);

		else if(cmd.equals("rebase")) return Git_Rebase.run(this, args, argmap);

		else if(cmd.equals("reset")) return Git_Reset.run(this, args, argmap);

		else if(cmd.equals("rm")) return Git_Rm.run(this, args, argmap);

		else if(cmd.equals("show")) return Git_Show.run(this, args, argmap);

		else if(cmd.equals("status")) return Git_Status.run(this, args, argmap);

		else if(cmd.equals("tag")) return Git_Tag.run(this, args, argmap);

		else return commandNotFound; //TODO print statement from $git
	}//close GitCall
	
} //close AGit
