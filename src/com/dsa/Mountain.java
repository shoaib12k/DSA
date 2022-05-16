package com.dsa;

public class Mountain {
    /*
    Write a function that takes input an array of distinct integers
    and returns the length of highest mountain.
    ->A mountain is defined as adjacent integers that are strictly
    increasing until they reach a pak, at which the become strictly
    decreasing.
    -> At least 3 numbers are required to form a mountain.

    sol: start with index 1 till N-1 and look for peaks
    if peak is found then calculate length and update with higher one
     */
    public int findBiggestMountain(int[] arr){
        int len = 0;
        int n = arr.length;

        for(int i=1; i<n-1; i++){
            int current=0;
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                int j = i;
                current+=1;

                while(j>=1 && arr[j]>arr[j-1]){
                    current++;
                    j--;
                }
                while(i<n-1 && arr[i]>arr[i+1]){
                    current++;
                    i++;
                }

            }

            if(current>len)
                len = current;
        }

        return len;
    }
}
