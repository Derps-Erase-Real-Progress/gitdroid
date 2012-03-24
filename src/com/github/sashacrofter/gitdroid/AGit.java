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
	public String GitCall(String command, String[] args, HashMap<String, String> argmap) {
		//Prints if gets to the end without finding a matching command
		String commandNotFound = "Command not found.";		
		String cmd = command.toLowerCase();
		
		if (cmd.equals("add")) {new Git_Add(args, argmap, repo).add(); return "$git add";}
		
		else if(cmd.equals("bisect")) {new Git_Bisect(args, argmap).bisect(); return "$git bisect";}
		
		else if(cmd.equals("branch")) {new Git_Branch(args, argmap).branch(); return "$git branch";}
		
		else if(cmd.equals("checkout")) {new Git_Checkout(args, argmap).checkout(); return "$git checkout";}

		else if(cmd.equals("clone")) {new Git_Clone(args, argmap).clone(); return "$git clone";}

		else if(cmd.equals("commit")) {new Git_Commit(args, argmap).commit(); return "$git commit";}

		else if(cmd.equals("diff")) {new Git_Diff(args, argmap).diff(); return "$git diff";}

		else if(cmd.equals("fetch")) {new Git_Fetch(args, argmap).fetch(); return "$git fetch";}

		else if(cmd.equals("grep")) {new Git_Grep(args, argmap).grep(); return "$git grep";}

		else if(cmd.equals("init")) {new Git_Init(args, argmap, dir).init(); return "$git init";}
		
		else if(cmd.equals("log")) {new Git_Log(args, argmap).log(); return "$git log";}

		else if(cmd.equals("merge")) {new Git_Merge(args, argmap).merge(); return "$git merge";}
		
		else if(cmd.equals("mv")) {new Git_Mv(args, argmap).mv(); return "$git mv";}

		else if(cmd.equals("pull")) {new Git_Pull(args, argmap).pull(); return "$git pull";}

		else if(cmd.equals("rebase")) {new Git_Rebase(args, argmap).rebase(); return "$git rebase";}

		else if(cmd.equals("reset")) {new Git_Reset(args, argmap).reset(); return "$git reset";}

		else if(cmd.equals("rm")) {new Git_Rm(args, argmap).rm(); return "$git rm";}

		else if(cmd.equals("show")) {new Git_Show(args, argmap).show(); return "$git show";}

		else if(cmd.equals("status")) {new Git_Status(args, argmap).status(); return "$git status";}

		else if(cmd.equals("tag")) {new Git_Tag(args, argmap).tag(); return "$git tag";}

		else return commandNotFound;
	}//close GitCall
	
} //close AGit
