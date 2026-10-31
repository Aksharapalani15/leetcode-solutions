 import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        int l = 0;

        long sum = 0;
        long maxSum = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int r = 0; r < n; r++) {

            // Remove duplicates from the current window
            while (set.contains(nums[r])) {
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            // Add the new element
            set.add(nums[r]);
            sum += nums[r];

            // Maintain window size k
            if (r - l + 1 > k) {
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

            // Check valid window of size k
            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}