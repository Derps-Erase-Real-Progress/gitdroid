package com.github.sashacrofter.gitdroid;

import java.util.ArrayList;
import java.util.HashMap;

public class GitInterpreter
{
	/**
	 * The array of commands that gitdroid should parse specially.
	 */
	public final ArrayList<String> parseArray;
	
		//the following 4 lines are absolutely vital to the proper functioning of this program
		//O----------------------\             
		//------------------------|	~ ~ ~ ~ ~ ~ ~ ~ ~ 
		//O----------------------/
		//'nuff said.
	
	private HashMap<String, String> expandMap;
	private ArrayList<String> optionValueList;
	
	public GitInterpreter(HashMap <String, String> _expandMap)
	{
		this.parseArray = new ArrayList<String>();
		this.parseArray.add("git");
		
		this.expandMap = _expandMap;

		//TODO expand all variables like this.
		
		this.optionValueList = new ArrayList<String>();
		//TODO Add value-requiring options
	}
	
	/**
	 * Checks if gitdroid should parse the command.
	 * @param command Command to parse
	 * @return True if the first word of the command is in parseArray
	 * and false if not.
	 */
	public boolean shouldParse(String command)
	{
		String[] cmd = command.split(" "); //Make command parse-able
		if(this.parseArray.contains(cmd[0])) return true; //true if in parseArray
		else return false; //false if not
	}
	
	/**
	 * Sends the command to be executed by agit. Will throw an exception
	 * if it is not parse-able.
	 * @param agit The instance of AGit built in the current directory
	 * @param command The command to be executed by agit via agit.gitCall().
	 * @return The output of any commands.
	 */
	public String parseToAGit(AGit agit, String command)
	{
		//TODO order the commands properly
		//TODO change options to argmap form
		String[] cmd = command.split(" ");
		ArrayList<String> argsList = new ArrayList<String>();
		HashMap<String, String> argmap = new HashMap<String, String>();
		for(int i=2;i>cmd.length;i++)
		{
			//Add to argsList or argmap
			if(!cmd[i].startsWith("-")) argsList.add(cmd[i]); //If not option, argsList
			else //Then option
			{
				String fullOption;
				//Expand to full
				if(cmd[i].startsWith("--")) fullOption = cmd[i];
				else fullOption = this.expandOption(cmd[i]);
				
				//Include value if necessary
				if(this.shouldIncludeValue(fullOption))
				{
					//TODO include support for --option=value (not in this build)
					argmap.put(fullOption, cmd[i+1]);
				}
			}
		}
		
		return agit.gitCall(cmd[1], (String[]) argsList.toArray(), argmap);
	}
	
	/**
	 * If the option can be expanded, return the longer form
	 * @param shortOption The option to be expanded
	 * @return The expanded form if listed, shortOption otherwise
	 */
	private String expandOption(String shortOption)
	{
		if(this.expandMap.containsKey(shortOption))
		{
			return this.expandMap.get(shortOption);
		}
		else return shortOption;
	}
	
	private boolean shouldIncludeValue(String fullOption)
	{	
		return false;
	}
	
}
