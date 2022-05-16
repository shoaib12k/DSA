package com.dsa;


public class Main {

    public static void main(String[] args) {

        Mountain m = new Mountain();
        int[] arr = {5,6,2,1,0,1,2,3,4,5,6,7,8,7,4,3,2,1,0};
        System.out.println(m.findBiggestMountain(arr));

    }
}
