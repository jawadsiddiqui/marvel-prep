package org.example;

import java.util.Arrays;

public class SumOfThree {
    public static void main(String[] args) {
        int[] nums = {1,2,4,3,5,5,2};

        Arrays.sort(nums);
        int target = 7;

        getThreeSum(nums, target);

    }

    private static boolean getThreeSum(int[] nums, int target) {
        int low, high, triples;


        for (int i = 0; i < nums.length-1; i++) {
            low = i+1;
            high = nums.length -1;

            while(low<high){
                triples = nums[i]+ nums[low]+ nums[high];
                if (triples == target){
                    System.out.println("Target Found"+target);
                    return true;
                } else if(triples< target){
                    low++;
                } else {
                    high--;
                }
            }
        }
        return false;
    }
}
