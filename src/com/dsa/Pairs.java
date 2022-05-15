package com.dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Pairs {
    /*
    Given an array containing N integers, and an number S denoting
    a target sum. Find two distinct integers that can pair up to form
    target sum. There will be only one such pair.
     */

    // using hashmap
    public int[] sumPairHash(int[] arr, int sum){
        HashMap<Integer, Integer> pair = new HashMap<>();
        int[] result = new int[2];
        for (int j : arr) {
            if (pair.containsKey(j)) {
                result[0] = pair.get(j);
                result[1] = j;
                break;
            }

            int key = sum - j;
            pair.put(key, j);
        }
        return result;
    }


    //using set - more easier to code and understand
    public int[] sumPairSet(int[] arr, int sum){
        Set<Integer> s = new HashSet<>();
        int [] result = new int[2];

        for (int j : arr) {
            int comp = sum - j;
            if (s.contains(j)) {
                result[0] = comp;
                result[1] = j;
                break;
            }
            s.add(comp);
        }
        return result;
    }
}
