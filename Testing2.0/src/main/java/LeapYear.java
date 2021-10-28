public class LeapYear {
    public boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }

    public boolean isDivisibleByFourAndNotHundred(int year) {
        return (year % 4 == 0) && (year % 100 != 0);
    }

    public boolean isDivisibleByFourHundred(int year) {
        return year % 400 == 0;
    }

    public boolean isNotLeapYear(int year) {
        return (year % 4 != 0) || ((year % 100 == 0 && year % 400 != 0));
    }

    public boolean isNotDivisibleByFour(int year) {
        return year % 4 != 0;
    }

    public boolean isDivisibleByHundredAndNotFourHundred(int year) {
        return (year % 100 == 0) && (year % 400 != 0);
    }
}
