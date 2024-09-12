package org.example;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence ="     Hello world \n                  123      ";


        sentence = sentence.replaceAll("\\s+", " ").trim();

        System.out.println(sentence);

        char[] charArray = sentence.toCharArray();

        int startDev =0;
        int endDev = charArray.length - 1;

        //reverse sentence

        strRev(charArray, startDev, endDev);

        System.out.println(charArray);

        for (int start = 0, end =0; end <= endDev ; ++end) {
            if(end == endDev || charArray[end]==' '){
                int endIdx = end == endDev ? end:  end -1;
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
