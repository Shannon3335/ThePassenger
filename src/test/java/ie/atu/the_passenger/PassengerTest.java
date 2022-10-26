package ie.atu.the_passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {


    @BeforeEach
    void setUp() {

    }

    @Test
    void test_success_title_check()
    {
        Passenger person = new Passenger(tq34y45hweg45h);
        assertEquals("Mr",person.get_title());
    }

    @Test
    void test_fail_title_check()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () ->{person.set_title("CAT");});
    }
    @AfterEach
    void tearDown() {
    }
}