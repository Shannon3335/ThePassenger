package ie.atu.the_passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger person;

    @BeforeEach
    void setUp() {

    }

    @Test
    void test_success_title_check()
    {
        person = new Passenger("Mr","Shannon",2368325,674612469,20);
        assertEquals("Mr",person.get_title());
    }
/*
    @Test
    void test_fail_title_check()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () ->{person.set_title("CAT");});
    }
    */
    @AfterEach
    void tearDown() {
    }
}