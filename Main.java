package com.virtualcommand.main;
import java.util.Scanner;

import com.virtualcommand.main.command.CdCommand;
import com.virtualcommand.main.command.ICommand;
import com.virtualcommand.main.command.LSCommand;
import com.virtualcommand.main.command.MkdirCommand;
import com.virtualcommand.main.command.PresentDirectory;
import com.virtualcommand.main.command.RmdirCommand;

public class Main {
	   public static String[] s;
		public void processInstructions() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to system Please enter command to start..!");
			while (true) {
				ICommand command = null;
				String[] instructions = scanner.nextLine().split(" ");
				switch (instructions[0]) {
				case "mkdir":
					command = new MkdirCommand();
					break;
				case "ls":
					command = new LSCommand();
					break;
				case "cd":
					command = new CdCommand();
					break;
				case "pwd":
					command = new PresentDirectory();
					break;
				case "rmdir":
					command = new RmdirCommand();
					break;
				default:
					break;
				}
				try {
					if (command != null) {
						String[] instruction = instructions.length > 1 ? instructions : null;
						command.execute(instruction);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}

		

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Main main1 = new Main();
		main1.processInstructions();

	}

	}


