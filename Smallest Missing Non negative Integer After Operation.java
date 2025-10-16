import java.util.*;

public class MaxMEXAfterOperations {
    public static int findSmallestInteger(int[] nums, int value) {
        // Count frequency of each residue modulo 'value'
        int[] count = new int[value];
        for (int num : nums) {
            int mod = ((num % value) + value) % value; // handle negative numbers
            count[mod]++;
        }

        int mex = 0;
        while (true) {
            int mod = mex % value;
            if (count[mod] > 0) {
                count[mod]--; // use one number to "build" mex
                mex++;
            } else {
                break; // residue exhausted → max MEX reached
            }
        }

        return mex;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,-10,7,13,6,8};
        int value1 = 5;
        System.out.println(findSmallestInteger(nums1, value1)); // Output: 4

        int[] nums2 = {1,-10,7,13,6,8};
        int value2 = 7;
        System.out.println(findSmallestInteger(nums2, value2)); // Output: 2
    }
}
