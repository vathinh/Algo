package com.tvt.code.ds.arrayMap;

import java.util.*;
import java.util.stream.IntStream;

public class CusAcc {
    public static void main(String[] args) {
        int[] cus = new int[]{1, 1, 2, 3, 3, 4, 5, 6, 6};
        int[] acc = new int[]{10, 11, 12, 10, 11, 13, 14, 15, 12};

        Map<Integer, List<Integer>> mapAcc = new HashMap<>();
        for(int i = 0; i < acc.length; i++) {
            if(mapAcc.containsKey(cus[i])){
                mapAcc.get(cus[i]).add(acc[i]);
            } else {
                mapAcc.put(cus[i], new ArrayList<>());
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry1 : mapAcc.entrySet()) {
            for (Map.Entry<Integer, List<Integer> >entry2 : mapAcc.entrySet()) {
                if (!entry1.equals(entry2) && entry1.getValue().size() == entry2.getValue().size()) {
                    // Compare elements in the lists
                    boolean elementsEqual = true;
                    for (int i = 0; i < entry1.getValue().size(); i++) {
                        if (!entry1.getValue().get(i).equals(entry2.getValue().get(i))) {
                            elementsEqual = false;
                            break;
                        }
                    }
                    // If all elements are equal, print the keyset
                    if (elementsEqual) {
                        System.out.println("Keyset for equal-sized lists with equal elements:");
                        System.out.println("Key 1: " + entry1.getKey());
                        System.out.println("Key 2: " + entry2.getKey());
                    }
                }
            }
        }


    }
}
