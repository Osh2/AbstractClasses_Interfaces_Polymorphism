package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorAllowed() {
        Visitor visitor = new Visitor(60, 156, 10000);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowed() {
        Visitor visitor = new Visitor(6, 101, 1);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
}
