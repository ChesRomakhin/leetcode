package ru.chesromakhin.leetcode.problems0xx;

public class Problem4 {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    if (n == 0 && m == 0) {
      return 0;
    }

    if (n == 0) {
      return getMedianOf(nums2);
    }

    if (m == 0) {
      return getMedianOf(nums1);
    }

    if(n > m) {
      return findMedianSortedArrays(nums2, nums1);
    }

    int l = 0;
    int r = nums1.length;

    while (true) {
      int i = l + (r - l) / 2;
      int j = (m + n + 1) / 2 - i;

      double left1 = i - 1 >= 0 ? nums1[i - 1] : Double.NEGATIVE_INFINITY;
      double right1 = i < nums1.length ? nums1[i] : Double.POSITIVE_INFINITY;

      double left2 = j - 1 >= 0 ? nums2[j - 1] : Double.NEGATIVE_INFINITY;
      double right2 = j < nums2.length ? nums2[j] : Double.POSITIVE_INFINITY;

      if (left1 <= right2 && left2 <= right1) {
        if ((n + m) % 2 == 1) {
          return Double.max(left1, left2);
        } else {
          return (Double.max(left1, left2) + Double.min(right1, right2)) / 2.0;
        }
      } else if (left1 > right2) {
        r = i - 1;
      } else {
        l = i + 1;
      }
    }
  }

  private double getMedianOf(int[] nums) {
    int length = nums.length;
    if (length % 2 == 0) {
      return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
    }

    return nums[length / 2];
  }

}

class Problem4Merge {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    if (n == 0 && m == 0) {
      return 0;
    }

    if (n == 0) {
      return getMedianOf(nums2);
    }

    if (m == 0) {
      return getMedianOf(nums1);
    }

    int target = (n + m) / 2;

    int i = 0;
    int j = 0;

    int[] merged = new int[n + m];

    while (i + j <= target) {
      if (i == n) {
        merged[i + j] = nums2[j++];
        continue;
      }

      if (j == m) {
        merged[i + j] = nums1[i++];
        continue;
      }

      if (nums1[i] > nums2[j]) {
        merged[i + j] = nums2[j++];
      } else {
        merged[i + j] = nums1[i++];
      }
    }

    return getMedianOf(merged);
  }

  private double getMedianOf(int[] nums) {
    int length = nums.length;
    if (length % 2 == 0) {
      return (nums[length / 2 - 1] + nums[length / 2]) / 2.0;
    }

    return nums[length / 2];
  }

}
