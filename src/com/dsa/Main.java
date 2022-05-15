package com.dsa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(15));

        int[] arr = {1,2,3,4,5,6,7,8,9,15};
        int sum = 18;

        Pairs p = new Pairs();
        int[] hashPair = p.sumPairHash(arr,sum);
        int[] setPair = p.sumPairSet(arr,sum);
        System.out.println(hashPair[0]+","+hashPair[1]);
        System.out.println(setPair[0]+","+setPair[1]);

        Triplets t = new Triplets();
        ArrayList<ArrayList<Integer>> trips = t.findTriplets(arr,sum);
        System.out.println(trips);


    }
}
