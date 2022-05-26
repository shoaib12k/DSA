package com.dsa;

import java.util.Arrays;

public class ChocoDistribution {
    /*Given an array of n integers where each value represents the
    number of chocolates in a packet. Each packet can
    have a variable number of chocolates. There are m
    students, the task is to distribute chocolate packets such that:
        1.Each student gets one packet.
        2.The difference between the number of chocolates in the packet with
        maximum chocolates and packet with minimum chocolates given to the students is minimum.
     */

    /*
    sort the array and traverse with arr.length-children
    time complexity : O(nlog(n)) because of sorting
     */
    public int choco(int[] arr, int children){
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i = 0; i<arr.length-children;i++){
            ans = Math.min(ans, arr[i+children-1]-arr[i]);
        }

        return ans;
    }
}
