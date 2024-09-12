package org.example;

import java.util.Arrays;

public class SumOfThreeExample {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4,3,5,6,8};
        Arrays.sort(nums);
        getTriples(nums, 141);
    }

    private static boolean getTriples(int[] nums, int target) {

        int low, high, triples;

        for (int i = 0; i < nums.length -2; i++) {
            low = i+1;
            high = nums.length-1;

            while (low < high)
            {
                triples = nums[i]+ nums[low]+ nums[high];
                if(triples == target){
                    System.out.println("Found triplese +"+ triples);
                    return true;
                } else if (triples<target){
                    low++;
                } else {
                    high--;
                }
            }

        }
        System.out.println("Not found any triplese +"+ target);

        return false;
    }
}
