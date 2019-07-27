package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JetsApplication {
	private Scanner kb = new Scanner(System.in);
	private AirField airField = new AirField();

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch(app);
	}// end main

	private void launch(JetsApplication app) {
		int userInput = 0;
		do {
			userInput = app.displayUserMenu(app, userInput);
		} while (userInput != 9);

	}// end launch

	private void readBaseFleet(JetsApplication app) {
		try (BufferedReader buff = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = buff.readLine()) != null) {
				String jet[] = line.split(", ");
				double speedMPH = Double.parseDouble(jet[2]);
				int range = Integer.parseInt(jet[3]);
				long price = Long.parseLong(jet[4]);

				if (jet[0].equals("Cargo Jet")) {
					int cargoCapacity = Integer.parseInt(jet[5]);
					airField.parkJet(new CargoJet(jet[1], speedMPH, range, price, cargoCapacity));
					}//end if
				if (jet[0].equals("Fighter Jet")) {
					int missleCapacity = Integer.parseInt(jet[5]);
					airField.parkJet(new FighterJet(jet[1], speedMPH, range, price, missleCapacity));
				}//end if
				if (jet[0].equals("Passenger Jet")) {
					
					airField.parkJet(new PassengerJet(jet[1], speedMPH, range, price));

				}//end if
				if (jet[0].equals("Stealth Jet")) {
					
					airField.parkJet(new StealthJet(jet[1], speedMPH, range, price));
				}//end if
				if (jet[0].equals("Bomber Jet")) {
					int payload = Integer.parseInt(jet[5]);
					airField.parkJet(new BomberJet(jet[1], speedMPH, range, price, payload));

				}//end if
				
				
			}//end while loop
		} catch (FileNotFoundException e) {
			System.out.println("Get a clue!");
		} catch (IOException e) {
			System.out.println("Get a clue!");
		}

	}// end readBaseFleet

	private int displayUserMenu(JetsApplication app, int userInput) {
		app.readBaseFleet(app);
		System.out.println("1. List Fleet ");
		System.out.println("2. Fly All Jets ");
		System.out.println("3. View Fastest Jet ");
		System.out.println("4. View Jet With Longest Range ");
		System.out.println("5. Load All Cargo Jets ");
		System.out.println("6. Dogfight! ");
		System.out.println("7. Add A Jet To Fleet ");
		System.out.println("8. Remove A Jet From Fleet ");
		System.out.print("9. Quit ");
		userInput = kb.nextInt();
		app.menuSwitch(userInput);
		return userInput;

	}// end displayUserMenu

	private void menuSwitch(int userInput) {
		switch (userInput) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			System.out.println("Quitting Jets Application ");
			break;

		}// end switch
	}// end menuSwitch
}// end class
