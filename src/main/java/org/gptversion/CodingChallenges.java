package org.gptversion;

public class CodingChallenges {


    public static void main(String[] args) {

        //Find reverse of string
        String text = "Hello";
        System.out.println(ReverseString(text));


        // Find missing number
        int[] nums = {1,2,4,5,6};
        int n = 6;
        //this is the magic happening right now
        findMissingNumber(n, nums);



    }

    private static void findMissingNumber(int n, int[] nums) {
        int totalSum = n * (n +1)/2;

        System.out.println(totalSum);
        int arraySum = 0 ;

        for(int num: nums){
            arraySum+=num;
        }

        int missingNumber = totalSum - arraySum;

        System.out.println(missingNumber);


        // Find if string is palindrome
        String palindromeString = "racecar";




    }

    private static String ReverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
}
