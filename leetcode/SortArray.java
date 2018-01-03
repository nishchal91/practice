package com.practice.leetcode;

public class SortArray {
	private static int firstOneIndex = -1;
	private static int firstTwoIndex = -1;

	// private static int[] nums;

	public int[] swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
		return nums;
	}

	public static void main(String[] args) {
		int[] a = { 0, 0, 1, 0, 1, 0, 0, 0 };
		SortArray obj = new SortArray();
		obj.sortArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

	public void sortArray(int[] nums) {
		// array=nums;
		firstOneIndex = -1;
		firstTwoIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				boolean flag = false;
				if (firstTwoIndex != -1 && i > firstTwoIndex) {
					nums = swap(nums, i, firstTwoIndex);
					flag = true;

				}
				if (firstOneIndex != -1 && i > firstOneIndex) {
					nums = firstTwoIndex != -1 ? swap(nums, firstOneIndex,
							firstTwoIndex) : swap(nums, firstOneIndex, i);
					firstOneIndex++;
				}
				if (flag) {
					firstTwoIndex++;
					flag = false;
				}

			} else if (nums[i] == 1) {
				if (firstOneIndex == -1)
					firstOneIndex = i;
				if (firstTwoIndex != -1 && i > firstTwoIndex) {
					nums = swap(nums, i, firstTwoIndex);
					if (i == firstOneIndex)
						firstOneIndex = firstTwoIndex;
					firstTwoIndex++;

				}

			} else if (nums[i] == 2) {
				if (firstTwoIndex == -1)
					firstTwoIndex = i;
			}

		}
	}

}
