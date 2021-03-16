package com.virtualcommand.main.command;

public class PresentDirectory implements ICommand{
	@Override
	public void execute(String[] instruction) {
		
		OSDataSource instance = OSDataSource.getInstance();
		String presentWorkingDirectory = instance.getPresentWorkingDirectory();
		System.out.println("Present Working Directory is "+presentWorkingDirectory);
		
	}
}
