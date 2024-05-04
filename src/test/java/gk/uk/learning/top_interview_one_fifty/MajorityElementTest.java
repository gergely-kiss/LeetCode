package gk.uk.learning.top_interview_one_fifty;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    @Test
    public void testMajorityElement() {
        MajorityElement solution = new MajorityElement();

        // Test case 1
        int[] nums1 = {3,2,3};
        int expected1 = 3;
        assertEquals(expected1, solution.majorityElement(nums1));

        // Test case 2
        int[] nums2 = {2,2,1,1,1,2,2};
        int expected2 = 2;
        assertEquals(expected2, solution.majorityElement(nums2));
    }

    @Test
    public void testMajorityElementWithSingleElement() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testMajorityElementWithLargeInput() {
        MajorityElement solution = new MajorityElement();
        int[] nums = new int[50000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i < 25001 ? 10 : 5;  // 10 appears 25001 times, 5 appears 24999 times
        }
        int expected = 10;
        assertEquals(expected, solution.majorityElement(nums));
    }
}
