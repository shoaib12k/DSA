package com.dsa;


public class Main {

    public static void main(String[] args) {

        ChocoDistribution m = new ChocoDistribution();
        int[] arr = {1,1,1,9,3,0,18,5,2,4,10,7,15,6};
        System.out.println(m.choco(arr,3));

    }
}
