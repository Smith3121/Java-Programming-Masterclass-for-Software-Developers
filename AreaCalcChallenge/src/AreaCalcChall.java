public class AreaCalcChall {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double ca = radius * radius * Math.PI;
        return ca;

    }
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0;
        }
        double ra = x * y;
        return ra;

    }
}
