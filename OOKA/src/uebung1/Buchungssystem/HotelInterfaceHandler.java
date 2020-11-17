package uebung1.Buchungssystem;

import java.util.ArrayList;

public class HotelInterfaceHandler {

    private static HotelRetrieval hotelRetrieval;


    private HotelRetrieval getHotelRetrievalInstance(){ //HotelRetrieval als Singleton
        if (hotelRetrieval==null)
            hotelRetrieval = new HotelRetrieval();
        return hotelRetrieval;
    }

    public IHotelSearch getBasicHotelSearchIF(){
        return getHotelRetrievalInstance(); //cast zu entsprechendem interface
    }

    public IHotelAdvancedSearch getAdvancedHotelSearchIF(){
        return getHotelRetrievalInstance();
    }

    public ArrayList<String> getAvailableInterfaces(){
        ArrayList<String> interfaces = new ArrayList<String>();
        interfaces.add("IHotelSearch");
        interfaces.add("IHotelAdvancedSearch");
        return interfaces;
    }
}
