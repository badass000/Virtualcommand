package com.virtualcommand.main.command;
import java.util.ArrayList;
import java.util.Hashtable;
public class LSCommand implements ICommand {
	@Override
	public void execute(String[] instruction) {
		OSDataSource instance = OSDataSource.getInstance();
		Hashtable<String,ArrayList<String>>  dataSource=instance.getDataSource();
		String presentWorkingDirectory = instance.getPresentWorkingDirectory();
		ArrayList<String> filesandfolders = dataSource.get(presentWorkingDirectory);
		if(filesandfolders==null || filesandfolders.size()==0)
		{
			System.out.println("No files");
		}
		else
		{
		for(int i =0;i<filesandfolders.size();i++)
		{
			System.out.println(filesandfolders.get(i));
		}
		}
		System.out.println(dataSource);
	}

}
