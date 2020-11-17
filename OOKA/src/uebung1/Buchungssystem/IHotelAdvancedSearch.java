package uebung1.Buchungssystem;

import uebung1.Buchungssystem.Hotel.Hotel;

import java.util.List;

public interface IHotelAdvancedSearch extends IHotelSearch {
    public List<Hotel> getHotelBySomethingSpecial(String special);

}
