public class LEETCODE_1732 {
    public static void main(String){

    }
    public int largestAltitude(int[] gain) {
        int altitude = 0;   // starting altitude
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;                  // add current gain
            maxAltitude = Math.max(maxAltitude, altitude);  
        }

        return maxAltitude;
    }
    
}
