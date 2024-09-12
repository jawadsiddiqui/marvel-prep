package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "She\n sells         seashells on the \nseashore";
        System.out.println("Original sentence :\n"+ sentence);

        //remove extra spaces and remove extra leading/trailing spaces
        sentence = sentence.replaceAll("\\s+", " ").trim();

        System.out.println("Sentence :\n"+ sentence);

        char[] charArray = sentence.toCharArray();
        int endLen = charArray.length - 1;
        int startDev = 0;

        strRev(charArray, startDev, endLen);

        for (int start = 0, end = 0; end <= endLen; ++end) {
            if (end == endLen || charArray[end] == ' ') {
                int endIdx = (end == endLen) ? end : end - 1;
                strRev(charArray, start, endIdx);
                start = end +1;
            }
        }
        System.out.println(charArray);
    }

    private static void strRev(char[] charArray, int startDev, int endDev){
        while (startDev < endDev){
            char temp = charArray[startDev];
            charArray[startDev] = charArray[endDev];
            charArray[endDev] = temp;
            startDev++;
            endDev--;
        }
    }
}
