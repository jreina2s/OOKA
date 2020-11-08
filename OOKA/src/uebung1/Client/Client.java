package uebung1.Client;

import uebung1.Buchungssystem.DBAccess;
import uebung1.Buchungssystem.HotelRetrieval;

public class Client {
	
	public static void main(String[] args) {
//		HotelRetrieval retrieval = new HotelRetrieval();
//		
//		retrieval.openSession();
		
		
		DBAccess acc = new DBAccess();
		System.out.println("Mini-Tutorial der Klasse DBAccess");
		System.out.println("c/o Sascha Alda, 2015-2020");
		System.out.println("---------------------------------");
		System.out.println(
				"Zunächst MUSS ein externer Client (außerhalb der Komponente!) mit der Methode openConnection() die Session explizit öffnen!");
		acc.openConnection();

		System.out.println("\nSuche nach allen Hotels:");
		System.out.println("Methodenaufruf: getObjects( DBAccess.HOTEL, \"*\")");
		
		acc.getObjects(DBAccess.HOTEL, "Hilton");
//		List<String> result = acc.getObjects(DBAccess.HOTEL, "*");
//		for ( String str : result ){
//			System.out.println( "String: " + str ); 
//		}

		System.out.println("\nSuche nach Hotels mit dem TeilString \'Jahres\':");
		System.out.println("Methodenaufruf: getObjects( DBAccess.HOTEL, \"Jahres\")");
//		result = acc.getObjects(DBAccess.HOTEL, "Jahres");
//		for ( String str : result ){
//			System.out.println( "String: " + str ); 
//		}

		System.out.println(
				"\nDann MUSS ein externer Client mit der Methode closeConnection() die Session explizit schließen!");
		acc.closeConnection();

	}

}
