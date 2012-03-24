package com.github.sashacrofter.gitdroid;

import java.util.HashMap;

import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.errors.NoFilepatternException;
import org.eclipse.jgit.lib.Repository;

public class Git_Add {
	
	private String [] args;
	private HashMap <String, String> argmap;
	private Repository repo;
	private AddCommand add;
	
	public Git_Add(String [] _args, HashMap <String, String> _argmap, Repository _repo) {
		super();
		this.args = _args;
		this.argmap = _argmap;
		this.repo = _repo;
	}//close constructor
	
	//TODO add git calls and argmap parsing
	
	/**
	 * Adds all untracked files specified in args recursively
	 * @param args
	 * @param argmap
	 * @return
	 */
	protected String add()
	{	
		this.add = new AddCommand(repo);
		/**
		 * The AddCommand javadocs class says the following:
		 * "A class used to execute a Add command. It has setters for all supported 
		 * options and arguments of this command and a call() method to finally 
		 * execute the command. Each instance of this class should only be used 
		 * for one invocation of the command (means: one call to call())"
		 */
		try { add.call(); } 
		catch (NoFilepatternException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Called add";
	}//close add

}//close Git_Add
