package com.virtualcommand.main.command;

import java.util.ArrayList;
import java.util.Hashtable;
public class CdCommand implements ICommand{
	public void execute(String[] instruction)
	{

		OSDataSource instance = OSDataSource.getInstance();
		Hashtable<String,ArrayList<String>> dataSource = instance.getDataSource();
		String presentWorkingDirectory = instance.getPresentWorkingDirectory();
		if(instruction[1].equals(".."))
		{
			int a = presentWorkingDirectory.length();
			String PresentWorkingDirectory = presentWorkingDirectory.substring(0,a-1);
			int index = PresentWorkingDirectory.lastIndexOf('/');
			PresentWorkingDirectory=PresentWorkingDirectory.substring(0,index+1);
			presentWorkingDirectory = PresentWorkingDirectory;
			instance.setPresentWorkingDirectory(presentWorkingDirectory);
			ArrayList<String> fileandfolders = dataSource.get(presentWorkingDirectory);
		}
		else
		{
		ArrayList<String> filesAndfolders = dataSource.get(presentWorkingDirectory);
		if(filesAndfolders.contains(instruction[1]))
		{
			presentWorkingDirectory = presentWorkingDirectory+instruction[1]+"/";
			instance.setPresentWorkingDirectory(presentWorkingDirectory);
		}
		else
		{
			System.out.println("No such folder exists");
		}
		}
		
		
	}
}
