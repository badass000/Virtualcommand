package com.virtualcommand.main.command;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class RmdirCommand implements ICommand {

	@Override
	public void execute(String[] instruction) {
		
		OSDataSource instance = OSDataSource.getInstance();
		String presentWorkingDirectory = instance.getPresentWorkingDirectory();
		Hashtable<String, ArrayList<String>> datasource = instance.getDataSource();
		Enumeration<String> Enumeration = datasource.keys();
		while(Enumeration.hasMoreElements())	
		{
			String elemt = Enumeration.nextElement();
			if(elemt.contains(instruction[1]))
			{
			datasource.remove(elemt);
			}
			else
			{
				Enumeration<ArrayList<String>> enumeration2 = datasource.elements();
				while(enumeration2.hasMoreElements())
				{
					ArrayList<String> elemt1 = enumeration2.nextElement();
					if(elemt1.contains(instruction[1]))
					{
						elemt1.remove(instruction[1]);
					
					}
				}
			}
		}
	}
}
	
