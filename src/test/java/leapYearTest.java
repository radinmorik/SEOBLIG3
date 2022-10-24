import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leapYearTest {

    /*
    @Test
    void isLeapYear() {
        assertTrue(false);
    }
*/
    @Test
    void testing_if_year_is_dividable_by_4_not_100() {
        assertTrue(leapYear.isLeapYear(4));
    }

    @Test
    void testing_if_year_which_is_dividable_by_100_but_not_400_is_not_leap_year() {
        assertFalse(leapYear.isLeapYear(100));
    }

    @Test
    void testing_if_year_which_is_dividable_by_400_is_leap_year() {
        assertTrue(leapYear.isLeapYear(1600));
    }

    @Test
    void testing_if_year_which_is_not_dividable_by_4_is_not_leap_year() {
        assertFalse(leapYear.isLeapYear(7));
    }
}