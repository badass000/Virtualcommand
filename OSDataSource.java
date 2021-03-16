package com.virtualcommand.main.command;
import java.util.ArrayList;
import java.util.Hashtable;
public class OSDataSource {
	private static OSDataSource instance;

	private Hashtable<String, ArrayList<String>> dataSource;
	private String presentWorkingDirectory;
	private int length;

	public static OSDataSource getInstance() {
		if (instance == null) {
			instance = new OSDataSource();
		}
		return instance;
	}

	private OSDataSource() {
		// TODO Auto-generated constructor stub
		dataSource = new Hashtable<>();
		presentWorkingDirectory="/";
	}
	

	public String getPresentWorkingDirectory() {
		return presentWorkingDirectory;
	}

	public void setPresentWorkingDirectory(String presentWorkingDirectory2) {
		this.presentWorkingDirectory = presentWorkingDirectory2;
	}

	public Hashtable<String, ArrayList<String>> getDataSource() {
		return dataSource;
	}
	public void setLength()
	{
		this.length = presentWorkingDirectory.length();
	}
	public int getLength()
	{
		return length;
	}
}
