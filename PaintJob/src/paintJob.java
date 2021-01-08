public class paintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double areaToPaint = width * height;

        double bucketsToPaintArea = areaToPaint / areaPerBucket;
        int bucketsToPaintRound =(int)Math.ceil(bucketsToPaintArea);
        return bucketsToPaintRound - extraBuckets;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
      return getBucketCount(width, height, areaPerBucket, 0);
    }
    public static int getBucketCount(double area, double areaPerBucket){
            return getBucketCount(1, area, areaPerBucket);
    }
}
