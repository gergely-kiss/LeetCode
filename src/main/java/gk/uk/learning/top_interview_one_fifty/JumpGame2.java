package gk.uk.learning.top_interview_one_fifty;
/*
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].



Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2


Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 1000
It's guaranteed that you can reach nums[n - 1].
 */
public class JumpGame2 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;  // No need to jump if array has less than 2 elements

        // Initialize variables to manage the current and next furthest jump reach
        int maxReach = nums[0];
        int step = nums[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            // If we have reached the last element
            if (i == n - 1) {
                return jumps;
            }

            // Update the furthest point that can be reached
            maxReach = Math.max(maxReach, i + nums[i]);

            // We use a step to get to the current index
            step--;

            // If no more steps are remaining
            if (step == 0) {
                jumps++;  // we must have used a jump
                step = maxReach - i;  // re-initialize the steps to the maxReach from current position
            }
        }
        return jumps;  // although the question ensures we can always reach the end, so this line is never reached
    }

    public static void main(String[] args) {
        JumpGame2 game = new JumpGame2();
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Minimum jumps (expected 2): " + game.jump(nums1));
        System.out.println("Minimum jumps (expected 2): " + game.jump(nums2));
    }
}

