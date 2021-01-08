public class NrOfDInMonth {

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ){
            return true;
        } else return false;
    }
    public static int getDaysInMonth(int month, int year){
        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        } else{
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    month = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    month = 30;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        month = 29;
                    }
                    else { month = 28;}
                    break;
                default:
                    month = -1;
                    break;
            }
        }return month;
    }
}
