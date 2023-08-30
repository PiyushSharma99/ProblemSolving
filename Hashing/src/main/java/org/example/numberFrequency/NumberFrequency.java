package org.example.numberFrequency;

import java.util.HashMap;

public class NumberFrequency {


    public static void main(String[] args) {
        int arr[] = {1,2,2,8,9,3,4,3,4,6,2,7,1,7,3,3,8};
        int n = arr.length;
        int x = 2;
        HashMap<Integer, Integer> ans = new HashMap<>();

        ans = findFrequency(arr, n,x);

        System.out.println("Answer : " + ans);

    }

    private static HashMap findFrequency(int[] arr, int n, int x) {

        HashMap<Integer, Integer> mapp = new HashMap<>();

        for (Integer element:arr) {
            mapp.put(element, mapp.getOrDefault(element,0)+1);
        }
        return mapp;
    }
}
