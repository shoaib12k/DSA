package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestBand {
    /*
    Given an array containing N integers, find length of longest
    band.
    A band is defined as a subsequence which can be re-ordered in
    such a manner all elements appear consecutive. (ie with absolute
    difference of 1 between neighbouring elements)
     */

//    using sorting
    public int longest(int[] arr){
        int len=1;
        Arrays.sort(arr);
        int tempLen = 1;
        for(int i=1; i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                tempLen++;
            }
            if(arr[i]-arr[i-1]!=1 || i==arr.length-1){
                len = Math.max(len,tempLen);
                tempLen=1;
            }

        }
        return len;
    }
//    using set and hashmap



}
