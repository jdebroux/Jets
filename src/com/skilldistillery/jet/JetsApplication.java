package com.skilldistillery.jet;

import java.io.*;
import java.util.*;

public class JetsApplication {
	private Scanner kb = new Scanner(System.in);
	private AirField airField = new AirField();

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch(app);
	}// end main

	private void launch(JetsApplication app) {
		int userInput = 0;
		app.readBaseFleet(app);
		do {
			userInput = app.displayUserMenu(app, userInput);
		} while (userInput != 9);
	}// end launch

	private void readBaseFleet(JetsApplication app) {
		try (BufferedReader buff = new BufferedReader(new FileReader("jets2.txt"))) {
			String line;
			while ((line = buff.readLine()) != null) {
				String jet[] = line.split(", ");
				double speedMPH = Double.parseDouble(jet[2]);
				int range = Integer.parseInt(jet[3]);
				long price = Long.parseLong(jet[4]);
				
				if (jet[0].equals("Cargo Jet")) {
					int cargoVolume = Integer.parseInt(jet[5]);
					airField.parkJet(new CargoJet(jet[1], speedMPH, range, price, cargoVolume));
				} // end if
				else if (jet[0].equals("Fighter Jet")) {
					int missleCapacity = Integer.parseInt(jet[5]);
					airField.parkJet(new FighterJet(jet[1], speedMPH, range, price, missleCapacity));
				} // end if
				else if (jet[0].equals("Passenger Jet")) {
					int passengerCapacity = Integer.parseInt(jet[5]);
					airField.parkJet(new PassengerJet(jet[1], speedMPH, range, price, passengerCapacity));
				} // end if
				else if (jet[0].equals("Spy Jet")) {
					airField.parkJet(new SpyJet(jet[1], speedMPH, range, price, jet[5]));
				} // end if
				else if (jet[0].equals("Bomber Jet")) {
					int payload = Integer.parseInt(jet[5]);
					airField.parkJet(new BomberJet(jet[1], speedMPH, range, price, payload));
				} // end if
			} // end while loop
		} catch (FileNotFoundException e) {
			System.out.println("FNFE Get a clue!");
		} catch (IOException e) {
			System.out.println("IOE Get a clue!");
		}
	}// end readBaseFleet

	private int displayUserMenu(JetsApplication app, int userInput) {
		System.out.println();
		System.out.println("1. List Fleet ");
		System.out.println("2. Fly All Jets ");
		System.out.println("3. View Fastest Jet ");
		System.out.println("4. View Jet With Longest Range ");
		System.out.println("5. Load All Cargo Jets ");
		System.out.println("6. Dogfight! ");
		System.out.println("7. Add A Jet To Fleet ");
		System.out.println("8. Remove A Jet From Fleet ");
		System.out.println("9. Quit ");
		System.out.print("Selection: ");
		userInput = kb.nextInt();
		app.menuSwitch(userInput);
		return userInput;

	}// end displayUserMenu

	private void menuSwitch(int userInput) {
		MenuSwitch s = new MenuSwitch();
		switch (userInput) {
		case 1:
			s.listFleet(airField);
			break;
		case 2:
			s.flyAllJets(airField);
			break;
		case 3:
			s.viewFastestJet(airField);
			break;
		case 4:
			s.viewLongestRangeJet(airField);
			break;
		case 5:
			s.loadAllCargoJets(airField);
			break;
		case 6:
			s.dogFight(airField);
			break;
		case 7:
			s.addAJet(airField);
			break;
		case 8:
//			s.removeAJet(airField);
			break;
		case 9:
			System.out.println("Quitting Jets Application ");
			break;
		}// end switch
	}// end menuSwitch
}// end class
