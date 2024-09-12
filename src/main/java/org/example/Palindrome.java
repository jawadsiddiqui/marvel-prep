package org.example;

public class Palindrome {


    public static void main(String[] args) {
        String palindromeString = "abwnwbaf";

        isPalindrome(palindromeString);

    }

    private static boolean isPalindrome(String palindromeString) {
        int left = 0;
        int right = palindromeString.length() - 1;  //6

        while (left < right){
            if(palindromeString.charAt(left) != palindromeString.charAt(right)){
                System.out.println("This is not palindrome");
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
