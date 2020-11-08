package uebung1.Buchungssystem;

import java.util.List;

import uebung1.Buchungssystem.Hotel.Hotel;

public class HotelRetrieval {
	private DBAccess db;

	public HotelRetrieval() {
		db = new DBAccess();
	}

	public Hotel[] getHotelByName(String name) {
		List<String> results = db.getObjects(DBAccess.HOTEL, name);
		int hotelCount = results.size() / 5;

		Hotel[] hotels = new Hotel[hotelCount];

		Hotel hotel;
		for (int i = 0; i < hotelCount; i++) {
			int j = i * 5;
			hotel = new Hotel();
			hotel.setId(results.get(0 + j) != null ? Integer.valueOf(results.get(0 + j)) : null);
			hotel.setName(results.get(1 + j));
			hotel.setCity(results.get(2 + j));
			hotel.setStars(results.get(3 + j) != null ? Integer.valueOf(results.get(3 + j)) : null);
			hotel.setContact(results.get(4 + j));

			hotels[i] = hotel;
		}

		return hotels;
	}

	public void openSession() {
		db.openConnection();
	}

	public void endSession() {
		db.closeConnection();
	}

	public void cacheResult(String key, List<Object> value) {

	}

}
