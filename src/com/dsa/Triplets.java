package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class Triplets {
    /*
    Given an array containing N integers, and an number S denoting
    a target sum. Find all distinct integers that can add up to form
    target sum. The numbers in ach triplet should be ordered
    in ascending order, and triplets should be ordered too.
    Return empty array if no such triplet exists.

    solution:
    Iterate over the sorted array and then use two pointer approach
    for every single element till N-3.

    */

    public ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int sum){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;

        for(int i=0; i<n-3; i++){
            int val = sum-arr[i];
            int j = i+1;
            int k = n-1;

            while(j < k){
                if(arr[j]+arr[k]==val){
                    ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));
                    result.add(temp);
                    j++;
                    k--;
                }
                else if(arr[j]+arr[k]>val)
                    k--;
                else
                    j++;

            }
        }
        return result;
    }

}