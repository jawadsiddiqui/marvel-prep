package org.example;

public class WordAbbr {
    public static void main(String[] args) {
        String word = "kubernetes";
        String abbr = "k8s";

        int abbrIndex =0;

        while(abbrIndex < abbr.length()) {
            //check if character is digit
            if(Character.isDigit(abbr.charAt(abbrIndex))){
                int digit = abbr.charAt(abbrIndex);
                System.out.println(digit);
            } else {
                
            }
        }
    }
}
