public class LeapYear {

    public static boolean isLeapYear (int year) {

        int leapYear = 366;

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return (year % 400 == 0);
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }











    }






