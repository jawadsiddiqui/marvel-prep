package org.example;

import java.util.*;

public class ChangeCalculator {

    // Mapping denominations to their string equivalents
    private static final Map<Double, String> denominationMap = new TreeMap<>(Collections.reverseOrder());

    static {
        denominationMap.put(100.0, "One Hundred");
        denominationMap.put(50.0, "Fifty");
        denominationMap.put(20.0, "Twenty");
        denominationMap.put(10.0, "Ten");
        denominationMap.put(5.0, "Five");
        denominationMap.put(2.0, "Two");
        denominationMap.put(1.0, "One");
        denominationMap.put(0.5, "Fifty Cents");
        denominationMap.put(0.25, "Twenty Five Cents");
        denominationMap.put(0.1, "Ten Cents");
        denominationMap.put(0.05, "Five Cents");
        denominationMap.put(0.01, "One Cent");
    }


    public static void main(String[] args) {
        double cash = 500;
        double price = 125.5;

        double change = cash - price;

        if(cash < price){
            System.out.println("Insufficient cash");
            return;
        }

        List<String> changeList = new ArrayList<>();


        for(Map.Entry<Double, String> entry : denominationMap.entrySet()){
            while(change >= entry.getKey()) {
                changeList.add(entry.getValue());
                change -= entry.getKey();
               // System.out.println(entry.getValue());
            }
        }

        Collections.sort(changeList);
        System.out.println(""+ String.join(",", changeList));
    }
}
