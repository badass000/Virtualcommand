package com.virtualcommand.main.command;
import java.util.ArrayList;
import java.util.Hashtable;
public class MkdirCommand implements ICommand{
	@Override
	public void execute(String[] instruction) {
		OSDataSource instance = OSDataSource.getInstance();
		Hashtable<String, ArrayList<String>> dataSource = instance.getDataSource();
		String presentWorkingDirectory = instance.getPresentWorkingDirectory();
		ArrayList<String> filesAndFolders = dataSource.get(presentWorkingDirectory);
		
		if(filesAndFolders==null) {
			filesAndFolders = new ArrayList<>();
		}
		if (filesAndFolders.contains(instruction[1])) {
			System.out.println(instruction[1] + " folder Already exists");
		} else {
			filesAndFolders.add(instruction[1]);
			dataSource.put(presentWorkingDirectory, filesAndFolders);
			System.out.println(instruction[1]+" Folder created successfully");
		}
	}
}
