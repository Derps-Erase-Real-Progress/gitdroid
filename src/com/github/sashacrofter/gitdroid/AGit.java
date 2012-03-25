package com.github.sashacrofter.gitdroid;

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
		
		git = new Git(null);
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
	public String GitCall(String command, String[] args, HashMap<String, String> argmap) {
		//Prints if gets to the end without finding a matching command
		String commandNotFound = "Command not found.";
		String cmd = command.toLowerCase();
		
		if (cmd.equals("add")) {Git_Add.run(this, args, argmap); return "$git add";}
		
		else if(cmd.equals("bisect")) {Git_Bisect.run(this, args, argmap); return "$git bisect";}
		
		else if(cmd.equals("branch")) {Git_Branch.run(this, args, argmap); return "$git branch";}
		
		else if(cmd.equals("checkout")) {Git_Checkout.run(this, args, argmap); return "$git checkout";}

		else if(cmd.equals("clone")) {Git_Clone.run(this, args, argmap); return "$git clone";}

		else if(cmd.equals("commit")) {Git_Commit.run(this, args, argmap); return "$git commit";}

		else if(cmd.equals("diff")) {Git_Diff.run(this, args, argmap); return "$git diff";}

		else if(cmd.equals("fetch")) {Git_Fetch.run(this, args, argmap); return "$git fetch";}

		else if(cmd.equals("grep")) {Git_Grep.run(this, args, argmap); return "$git grep";}

		else if(cmd.equals("init")) {Git_Init.run(this, args, argmap); return "$git init";}
		
		else if(cmd.equals("log")) {Git_Log.run(this, args, argmap); return "$git log";}

		else if(cmd.equals("merge")) {Git_Merge.run(this, args, argmap); return "$git merge";}
		
		else if(cmd.equals("mv")) {Git_Mv.run(this, args, argmap); return "$git mv";}

		else if(cmd.equals("pull")) {Git_Pull.run(this, args, argmap); return "$git pull";}

		else if(cmd.equals("rebase")) {Git_Rebase.run(this, args, argmap); return "$git rebase";}

		else if(cmd.equals("reset")) {Git_Reset.run(this, args, argmap); return "$git reset";}

		else if(cmd.equals("rm")) {Git_Rm.run(this, args, argmap); return "$git rm";}

		else if(cmd.equals("show")) {Git_Show.run(this, args, argmap); return "$git show";}

		else if(cmd.equals("status")) {Git_Status.run(this, args, argmap); return "$git status";}

		else if(cmd.equals("tag")) {Git_Tag.run(this, args, argmap); return "$git tag";}

		else return commandNotFound;
	}//close GitCall
	
} //close AGit
