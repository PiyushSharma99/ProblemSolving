package org.example.twoSum;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int ans[];
        int arr[] = {2,7,9,8,5,6};
        int n = arr.length;
        int x = 9;

        ans = findTwoSum(arr,n,x);

        for(Integer element: ans){
            System.out.println("Answer : " + element);
        }
//        System.out.println("Answer : " + ans.toString());
    }

    private static int[] findTwoSum(int[] arr, int n, int x) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<n; i++){

            if(map.containsKey(x-arr[i]))
            {
                ans[0] = map.get(x-arr[i]);
                ans[1] = i;
                break;
            }
            map.put(arr[i],i );
        }
        return ans;

    }
}
