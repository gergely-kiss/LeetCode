package gk.uk.learning.top_interview_one_fifty;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void testRemoveElement() {
        RemoveElement remover = new RemoveElement();

        // Test Case 1: Standard removal
        int[] nums1 = {3, 2, 2, 3};
        int expectedK1 = 2;
        int[] expectedNums1 = {2, 2}; // Expected result (order matters)
        assertEquals(expectedK1, remover.removeElement(nums1, 3));
        assertArrayEquals(expectedNums1, trimArray(nums1, expectedK1));

        // Test Case 2: No removal needed
        int[] nums2 = {1, 2, 4};
        int expectedK2 = 3;
        int[] expectedNums2 = {1, 2, 4}; // Expected result (order matters)
        assertEquals(expectedK2, remover.removeElement(nums2, 3));
        assertArrayEquals(expectedNums2, trimArray(nums2, expectedK2));

        // Test Case 3: Remove all elements
        int[] nums3 = {2, 2, 2};
        int expectedK3 = 0;
        int[] expectedNums3 = {}; // Expected result (order matters)
        assertEquals(expectedK3, remover.removeElement(nums3, 2));
        assertArrayEquals(expectedNums3, trimArray(nums3, expectedK3));

        // Test Case 4: Empty array
        int[] nums4 = {};
        int expectedK4 = 0;
        int[] expectedNums4 = {}; // Expected result (order matters)
        assertEquals(expectedK4, remover.removeElement(nums4, 1));
        assertArrayEquals(expectedNums4, trimArray(nums4, expectedK4));
    }

    // Helper method to trim the array to the size of k
    private int[] trimArray(int[] nums, int k) {
        int[] result = new int[k];
        System.arraycopy(nums, 0, result, 0, k);
        return result;
    }
}

