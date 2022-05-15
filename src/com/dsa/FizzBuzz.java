package com.dsa;


import java.util.ArrayList;

public class FizzBuzz {
    public ArrayList fizzBuzz(int n){
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%3==0 && i%5==0)
                result.add("fizzbuzz");
            else if(i%3==0)
                result.add("fizz");
            else if(i%5==0)
                result.add("buzz");
            else
                result.add(Integer.toString(i));
        }
        return result;
    }
}
