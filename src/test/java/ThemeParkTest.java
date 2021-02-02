import attractions.*;
import org.junit.Test;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark park;

    @Test
    public void canGetAllReviewed(){
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Dodgems("dodge", 3));
        attractions.add(new RollerCoaster("weeee", 4));
        attractions.add(new Park("patch", 2));
        attractions.add(new Playground("swing", 1));
        ArrayList<Stall> stalls = new ArrayList<>();
        stalls.add(new CandyflossStall("Floss", "bill", ParkingSpot.B1, 2));
        stalls.add(new TobaccoStall("Backy", "dave", ParkingSpot.A3, 5));
        stalls.add(new IceCreamStall("Creams", "liz", ParkingSpot.B2, 3));
        park = new ThemePark(attractions, stalls);
        assertEquals(7, park.getAllReviewed().size());
    }
}
