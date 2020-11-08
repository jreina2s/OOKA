package uebung1.Buchungssystem;

import java.util.List;

import uebung1.Buchungssystem.Hotel.Hotel;

public interface IHotelSearch {
	public List<Hotel> getHotelByName(String name);
	public void openSession();
	public void endSession();
}
