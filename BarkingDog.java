public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hoursOfDay){

        if ((hoursOfDay >= 0 && hoursOfDay <= 23) && barking ) {
            if (hoursOfDay < 8 || hoursOfDay > 22)
                return true;
        }
        return false;

    }
}
