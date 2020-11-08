package uebung1.Buchungssystem;

import java.util.ArrayList;
import java.util.List;

import uebung1.Buchungssystem.Hotel.Hotel;

public class HotelRetrieval implements IHotelSearch {
	private DBAccess db;

	public HotelRetrieval() {
		db = new DBAccess();
	}

	@Override
	public List<Hotel> getHotelByName(String name) {
		List<String> results = db.getObjects(DBAccess.HOTEL, name);
		int hotelCount = results.size() / 5;

		List<Hotel> hotels = new ArrayList<Hotel>();
		Hotel hotel;
		for (int i = 0; i < hotelCount; i++) {
			int j = i * 5;
			hotel = new Hotel();
			hotel.setId(results.get(0 + j) != null ? Integer.valueOf(results.get(0 + j)) : null);
			hotel.setName(results.get(1 + j));
			hotel.setCity(results.get(2 + j));
			hotel.setStars(results.get(3 + j) != null ? Integer.valueOf(results.get(3 + j)) : null);
			hotel.setContact(results.get(4 + j));

			hotels.add(hotel);
		}
		HotelCache.getInstance().cacheResult(name, hotels);
		return hotels;
	}
	
	@Override
	public void openSession() {
		db.openConnection();
	}

	@Override
	public void endSession() {
		db.closeConnection();
	}

//	Wird nicht mehr gebraucht, da der Cache nun Singleton ist und über getInstance abgerufen werden kann!
//	public void setCache(HotelCache cache) {
//		this.cache = cache;
//	}

}
