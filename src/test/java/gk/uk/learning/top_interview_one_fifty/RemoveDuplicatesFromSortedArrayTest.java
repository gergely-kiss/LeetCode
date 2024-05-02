package gk.uk.learning.top_interview_one_fifty;

import junit.framework.TestCase;

public class RemoveDuplicatesFromSortedArrayTest extends TestCase
{

    public void testRemoveDuplicates()
    {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray =
            new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};

        int[] expectedNums = {1, 2}; // Expected result (order matters)
        assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(nums));

        nums = new int[]{0};

        assertEquals(1, removeDuplicatesFromSortedArray.removeDuplicates(nums));

        nums = new int[]{0,0,0,0,0,0,0,0,0,0};

        assertEquals(1, removeDuplicatesFromSortedArray.removeDuplicates(nums));


        nums = new int[]{1,2,3,4,5,6,7,8,9};

        assertEquals(9, removeDuplicatesFromSortedArray.removeDuplicates(nums));
    }

}
