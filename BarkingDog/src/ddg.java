public class ddg {

        public static boolean shouldWakeUp (boolean barking, int hoursOfDay) {


            if (barking && hoursOfDay >= 0 && hoursOfDay <= 24) {
                if (hoursOfDay < 8 || hoursOfDay > 22) {
                    return true;
                }

            }
            return false;

        }

}
