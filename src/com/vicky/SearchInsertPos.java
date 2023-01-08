package com.vicky;

public class SearchInsertPos {


    public static int searchInsert(int[] nums, int target) {

        // assinging left and right
        int left = 0;
        int right = nums.length-1;

        // calculating the middle index
        while(left <= right) {
            int middle = left + (right - left) / 2;
            int value = nums[middle];

            if (value == target) {
                return middle;
            }
            else if (value < target) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return left; // returning the left is the target is not found
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,67,32};
        int target = 0;
        int ans = searchInsert(nums,target);
        System.out.println(ans);
    }
}
