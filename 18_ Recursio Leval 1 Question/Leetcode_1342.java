public class Leetcode_1342 {
    public static void main(String[] args) {
        int num = 23;
        Leetcode_1342 obj = new Leetcode_1342(); // Create object to call non-static method
        int steps = obj.numOfStesps(num); // Call method to get number of steps
        System.out.println("Number: " + num);
        System.out.println("Steps to reduce to zero: " + steps);
    }

    public int numOfStesps(int num) {
        return helper(num, 0); // initially steps = 0
    }

    private int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
