package uebung1.Client;

import java.util.List;

import uebung1.Buchungssystem.HotelRetrieval;
import uebung1.Buchungssystem.Hotel.Hotel;

public class Client {
	
	public static void main(String[] args) {
		HotelRetrieval retrieval = new HotelRetrieval();
		
		retrieval.openSession();
		
		
		List<Hotel> hotels = retrieval.getHotelByName("*");
		
		for(Hotel h : hotels) {
			System.out.println(h);
			System.out.println("______________________________________________");
		}
		
		retrieval.endSession();
	}

}
