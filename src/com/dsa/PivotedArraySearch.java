package com.dsa;

public class PivotedArraySearch {
    public int binarySearch(int[] arr,int left, int right, int target){
        int targetPos=-1;

        int mid = (left+right)/2;
        while(left<=right){
            if(arr[mid]==target) {
                targetPos = mid;
                break;
            }
            else if(arr[mid]>target) {
                right = mid - 1;
                mid = (left+right)/2;
            }
            else if(arr[mid]<target){
                left = mid+1;
                mid = (left+right)/2;
            }
        }
        return targetPos;
    }
    /*
    find where the array can be divided into two sorted sub array and then
    apply binary search.
    Time Complexity: binary search requires O(log N) and iterating is N so O(nlog n)
     */
    public int pivotedSearch(int[] arr, int target){
        int pos = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                if(target>=arr[0]) {
                    pos = binarySearch(arr, 0, i, target);
                }else{
                    pos = binarySearch(arr,i+1,arr.length-1,target);
                }
            }
            if(pos>-1)
                break;
        }
        return pos;
    }
}
