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
        person = new Passenger("Mr","Shannon",2368325234L,674612469,20);
        assertEquals("Mr",person.get_title());
    }

    @Test
    void test_fail_title_check()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("CAT","Shannon",2368325,674612469,20));
        assertEquals("Title can only be Mr, Mrs or Ms",e_message.getMessage());
    }

    @Test
    void test_success_name_check()
    {
        person = new Passenger("Mr","Edward",2368325672L,2834023,20);
        assertEquals("Edward",person.get_name());
    }

    @Test
    void test_fail_success_name_check()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,() -> person = new Passenger("Mr","Ed",2368325,2834023,20));
        assertEquals("Name must be longer than 3 characters",e_message.getMessage());
    }

    @Test
    void test_success_id_check()
    {
        person = new Passenger("Ms","Shan",1234567890,1234567,20);
        assertEquals(1234567890,person.get_id());
    }

    @Test
    void test_fail_id_check()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,()->person = new Passenger("Ms","Shan",1234560,1234567,20));
        assertEquals("Id must be at least 10 digits long",e_message.getMessage());
    }

    @Test
    void test_success_phoneno_check()
    {
        person = new Passenger("Ms","Shan",1234567890,1234567,20);
        assertEquals(1234567,person.get_phone_no());
    }

    @Test
    void test_fail_phoneno_check()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,() ->person = new Passenger("Ms","Shan",1234567890,12345,20));
        assertEquals("Phone number must be at least 7 digits long",e_message.getMessage());
    }
    @AfterEach
    void tearDown() {
    }
}