package uebung1.Client;

import uebung1.Buchungssystem.DBAccess;
import uebung1.Buchungssystem.HotelRetrieval;
import uebung1.Buchungssystem.Hotel.Hotel;

public class Client {
	
	public static void main(String[] args) {
		HotelRetrieval retrieval = new HotelRetrieval();
		
		retrieval.openSession();
		
		
		Hotel[] hotels = retrieval.getHotelByName("*");
		
		retrieval.endSession();
	}

}
