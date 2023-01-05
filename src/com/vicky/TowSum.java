package com.vicky;

import java.util.Arrays;

public class TowSum {
    public static void main(String[] args) {
        int[] arr = {1,2,44,21,92};
        int target = 94;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] arr, int target){
        for(int i =0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
