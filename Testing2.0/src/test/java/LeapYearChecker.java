import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearChecker {
    LeapYear leapYear = new LeapYear();

    @Test
    public void Leap_Year_Checker() {
        assertTrue(leapYear.isLeapYear(2000));
        assertTrue(leapYear.isLeapYear(2004));
        assertTrue(leapYear.isLeapYear(1612));
        assertTrue(leapYear.isLeapYear(2988));
    }

    @Test
    public void Years_Divisible_By_4_Results_Leap_Year() {
        assertTrue(leapYear.isDivisibleByFour(2000));
        assertTrue(leapYear.isDivisibleByFour(2004));
        assertTrue(leapYear.isDivisibleByFour(1612));
        assertTrue(leapYear.isDivisibleByFour(2988));
    }

    @Test
    public void Years_Divisible_By_4_But_Not_100_Results_Leap_Year() {
        assertTrue(leapYear.isDivisibleByFourAndNotHundred(2004));
        assertTrue(leapYear.isDivisibleByFourAndNotHundred(1612));
        assertTrue(leapYear.isDivisibleByFourAndNotHundred(2988));
    }

    @Test
    public void Years_Divisible_By_400_Results_Leap_Year() {
        assertTrue(leapYear.isDivisibleByFourHundred(2000));
    }

    @Test
    public void Not_Leap_Year_Checker() {
        assertTrue(leapYear.isNotLeapYear(1800));
        assertTrue(leapYear.isNotLeapYear(1900));
        assertTrue(leapYear.isNotLeapYear(2001));
        assertTrue(leapYear.isNotLeapYear(2002));
        assertTrue(leapYear.isNotLeapYear(2003));
        assertTrue(leapYear.isNotLeapYear(2100));
    }

    @Test
    public void Years_Not_Divisible_By_4_Results_Not_Leap_Year() {
        assertTrue(leapYear.isNotDivisibleByFour(2001));
        assertTrue(leapYear.isNotDivisibleByFour(2002));
        assertTrue(leapYear.isNotDivisibleByFour(2003));
    }

    @Test
    public void Years_Divisible_By_100_But_Not_400_Results_Not_Leap_Year() {
        assertTrue(leapYear.isDivisibleByHundredAndNotFourHundred(1800));
        assertTrue(leapYear.isDivisibleByHundredAndNotFourHundred(1900));
        assertTrue(leapYear.isDivisibleByHundredAndNotFourHundred(2100));
    }
}
