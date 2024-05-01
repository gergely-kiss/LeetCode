package gk.uk.learning.top_interview_one_fifty;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class MergeSortedArrayTest {

    @Test
    public void testMergeTwoNonEmptyArrays() {
        // Arrange
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};

        // Act
        mergeSortedArray.merge(nums1, 3, nums2, 3);

        // Assert
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithEmptySecondArray() {
        // given
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {1, 2, 3};

        // when
        mergeSortedArray.merge(nums1, 3, nums2, 0);

        // then
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithEmptyFirstArray() {
        // given
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1};
        int[] expected = {1};

        // when
        mergeSortedArray.merge(nums1, 0, nums2, 1);

        // then
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWhenFirstArrayHasOnlyZeros() {
        // given
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] expected = {1, 2, 3};

        // when
        mergeSortedArray.merge(nums1, 0, nums2, 3);

        // then
        assertArrayEquals(expected, nums1);
    }
}

