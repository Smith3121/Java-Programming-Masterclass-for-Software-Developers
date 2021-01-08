public class LeapYear {

    public static boolean isLeapYear(int year) {
        if ((year >=1) && (year < 9999) && (year != 1700) && (year != 1800) && (year != 1900) && (year != 2100) && (year != 2200) && (year != 2300) && (year != 2500) && (year != 2600)){
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0){
                        return true;
                    } return false;

                } return true;
            } return false;

        } return false;

    }
}
