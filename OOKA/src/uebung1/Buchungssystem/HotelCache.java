package uebung1.Buchungssystem;

import java.util.HashMap;
import java.util.List;

import uebung1.Buchungssystem.Hotel.Hotel;
import uebung1.cache.ICaching;

public class HotelCache implements ICaching<Hotel> {
	
	private HashMap<String, List<Hotel>> cache;
	private static final HotelCache me = new HotelCache();
	
	public static ICaching<Hotel> getInstance() {
		return me;
	}
	
	public HotelCache() {
		cache = new HashMap<String, List<Hotel>>();
	}

	@Override
	public void cacheResult(String key, List<Hotel> values) {
		cache.put(key, values);
	}

	@Override
	public HashMap<String, List<Hotel>> getCache() {
		return cache;
	}

	@Override
	public List<Hotel> getValueFromKey(String key) {
		return cache.get(key);
	}

	@Override
	public void clearCache() {
		cache.clear();
	}

	@Override
	public void deleteValueFromKey(String key) {
		cache.remove(key);
	}
}
