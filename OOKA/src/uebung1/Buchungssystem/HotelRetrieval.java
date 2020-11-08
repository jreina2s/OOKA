package uebung1.Buchungssystem;

import java.util.List;

import uebung1.Buchungssystem.Hotel.Hotel;

public class HotelRetrieval {
	private DBAccess db;
	
	public HotelRetrieval() {
		db = new DBAccess();
	}
	
	public List<Hotel> getHotelByName(String name) {
		return null;
	}
	
	public void openSession() {
		db.openConnection();
	}
	
	public void cacheResult(String key, List<Object> value) {
		
	}

}
