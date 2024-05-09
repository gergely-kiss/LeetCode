package gk.uk.learning.top_interview_one_fifty;
/*

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.



Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
 */
public class JumpGame
{
    public boolean canJump(int[] nums) {
        // The farthest point that can be reached.
        int maxReach = 0;

        // Loop through each index up to the farthest point reachable.
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the farthest point we can reach, we cannot proceed further.
            if (i > maxReach) {
                return false;
            }

            // Update the farthest point we can reach from this index.
            maxReach = Math.max(maxReach, i + nums[i]);

            // If the farthest point we can reach or surpass is beyond or at the last index, we can finish.
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // We iterate till the end, but this line is theoretically unreachable due to the above return statement.
        return false;
    }

}
