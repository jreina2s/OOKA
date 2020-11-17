package uebung1.Client;

import java.util.List;

import uebung1.Buchungssystem.HotelInterfaceHandler;
import uebung1.Buchungssystem.HotelRetrieval;
import uebung1.Buchungssystem.Hotel.Hotel;
import uebung1.Buchungssystem.IHotelAdvancedSearch;
import uebung1.Buchungssystem.IHotelSearch;

public class Client {
	
	public static void main(String[] args) {
		//IHotelSearch retrieval = new HotelRetrieval();
		HotelInterfaceHandler ifHandler = new HotelInterfaceHandler();
		IHotelSearch iHotelSearch = ifHandler.getBasicHotelSearchIF();
		//oder	beide Interfaces von SELBER Objektinstanz
		IHotelAdvancedSearch iHotelAdvancedSearch =  ifHandler.getAdvancedHotelSearchIF();

		iHotelAdvancedSearch.openSession();
		
		
		List<Hotel> hotels = iHotelAdvancedSearch.getHotelByName("*");
		
		for(Hotel h : hotels) {
			System.out.println(h);
			System.out.println("______________________________________________");
		}

		iHotelAdvancedSearch.endSession();
	}

}
