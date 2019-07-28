package com.skilldistillery.jet;

import java.util.*;

public class MenuSwitch {
	private Scanner kb = new Scanner(System.in);

	public void listFleet(AirField airField) {
		List<Jet> jetList = airField.getJets();
		for (Jet jet : jetList) {
			System.out.println();
			System.out.println(jet.toString());
		}
	}// end listFleet

	public void flyAllJets(AirField airField) {
		List<Jet> jetList = airField.getJets();
		for (Jet jet : jetList) {
			jet.fly(jet, airField);
		}
	}// end flyAllJets

	public void viewFastestJet(AirField airField) {
		List<Jet> jetList = airField.getJets();
		double fastest = 0;
		for (Jet jet : jetList) {
			if (jet.getSpeedMPH() > fastest) {
				fastest = jet.getSpeedMPH();
			}
		}
		for (Jet jet2 : jetList) {
			if (fastest == jet2.getSpeedMPH()) {
				System.out.println();
				System.out.println(jet2.toString());
			}
		}
	}// end viewFastestJet

	public void viewLongestRangeJet(AirField airField) {
		List<Jet> jetList = airField.getJets();
		double furthestRange = 0;
		for (Jet jet : jetList) {
			if (jet.getRange() > furthestRange) {
				furthestRange = jet.getRange();
			}
		}
		for (Jet jet2 : jetList) {
			if (furthestRange == jet2.getRange()) {
				System.out.println();
				System.out.println(jet2.toString());
			}
		}
	}// end viewLongestRangeJet

	public void loadAllCargoJets(AirField airField) {
		List<Jet> jetList = airField.getJets();
		for (Jet jet : jetList) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo(jet);
			}
		}
	}// end loadAllCargoJets

	public void dogFight(AirField airField) {
		List<Jet> jetList = airField.getJets();
		for (Jet jet : jetList) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).loadWeapons(jet);
			}
		}
		for (Jet jet : jetList) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight(jet);
			}
		}
	}// end dogFight

	public void addAJet(AirField airField) {
		System.out.println();
		System.out.println("What type of jet would you like to add?");
		System.out.println("Cargo, Fighter, Passenger, Spy, or Bomber?");
		String type = kb.next();
		getNewJetInfo(type, airField);
	}// end addAJet

	private void getNewJetInfo(String type, AirField airField) {
		System.out.println("Jet Model: ");
		String model = kb.next();
		System.out.println("Jet Speed: ");
		double speed = kb.nextDouble();
		System.out.println("Jet Range: ");
		int range = kb.nextInt();
		System.out.println("Jet Price: ");
		long price = kb.nextLong();

		if (type.equalsIgnoreCase("cargo")) {
			System.out.println("Jet Cargo Volume: ");
			int cargoVolume = Integer.parseInt(kb.next());
			airField.parkJet(new CargoJet(model, speed, range, price, cargoVolume));
		}
		if (type.equalsIgnoreCase("fighter")) {
			System.out.println("Missile Capacity: ");
			int missileCapacity = Integer.parseInt(kb.next());
			airField.parkJet(new FighterJet(model, speed, range, price, missileCapacity));
		}
		if (type.equalsIgnoreCase("passenger")) {
			System.out.println("Passenger Capacity: ");
			int passengerCapacity = Integer.parseInt(kb.next());
			airField.parkJet(new PassengerJet(model, speed, range, price, passengerCapacity));
		}
		if (type.equalsIgnoreCase("spy")) {
			System.out.println("Jet Radar: ");
			String radar = kb.next();
			airField.parkJet(new SpyJet(model, speed, range, price, radar));
		}
		if (type.equalsIgnoreCase("bomber")) {
			System.out.println("Jet Payload: ");
			int payload = Integer.parseInt(kb.next());
			airField.parkJet(new BomberJet(model, speed, range, price, payload));
		}

	}// end getNewJetInfo

	public void removeAJet(AirField airField) {
		List<Jet> jetList = airField.getJets();
		int i = 1;
		for (Jet jet : jetList) {
			System.out.println();
			System.out.println(i + ". " + jet.getModel());
			i++;
		}
		System.out.println();
		System.out.print("Which jet would you like to remove?");
		int removeChoice = kb.nextInt();
		System.out.println();
		System.out.println(jetList.remove(removeChoice - 1));
		System.out.println();
		System.out.println("has been removed.");

	}// end removeAJet

}// end Class
