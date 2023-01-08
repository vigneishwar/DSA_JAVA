package com.vicky;

public class SearchAndReturnUniqueElements {
    public static int singleUniqueElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        //checking base cases when the size of the array is small
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[right] != nums[right - 1]) {
            return nums[right];
        }

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (middle % 2 == 1) {  // checking if the middle is odd. If odd decrement it and make it even
                middle--;
            }

            if (nums[middle] == nums[middle + 1]) {
                left = middle + 2;
            } else {
                right = middle;
            }
        }

        return nums[left];
    }


    public static void main(String[] args) {
        int[]nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleUniqueElement(nums);
        System.out.println(ans);
    }
}
