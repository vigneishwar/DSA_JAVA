package com.vicky;

public class SearchAndReturnUniqueElements {

    public static int singleUniqueElement(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right) {
            int middle = left + (right - left) / 2;
            if (middle == 0) {
                if(nums[middle] != nums[middle + 1]) {
                    return nums[middle];
                } else {
                    left = middle + 1;
                }
            }
            else if (middle == nums.length-1) {
                if(nums[middle] != nums[middle - 1]){
                    return nums[middle];
                } else {
                    right = middle - 1;
                }
            } else {
                if (nums[middle] != nums[middle - 1] && nums[middle] != nums[middle + 1]) {
                    return nums[middle];
                } else if (nums[middle] == nums[middle - 1]) {
                    left = middle + 1;
                }else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleUniqueElement(nums);
        System.out.println(ans);
    }
}
