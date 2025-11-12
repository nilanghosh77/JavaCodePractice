package org.javahawk.dsa.array;

import java.util.Arrays;

public class GFG {

    public static boolean twoSum_1(int[] arr, int target){
        int arr_len = arr.length;
        // For each element arr[i], check every
        // other element arr[j] that comes after it
        for(int i=0;i<arr_len;i++){
            for(int j=i+1; j<arr_len;j++){
                // Check if the sum of the current pair
                // equals the target
                if(arr[i]+arr[j] == target){
                    return true;
                }
            }
        }
        // If no pair is found after checking
        // all possibilities
        return false;
    }

    static boolean twoSum_2(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int sum = arr[left]+arr[right];
        while(left<right){
            if(sum == target)
                return true;
            else if (sum< target)
                left++;
            else
                right++;
        }
        return false;
    }

    public static void main(String[] args) {
        // If no pair is found after checking
        // all possibilities
        int[] arr1 = { 0, -1, 2, -3, 1 };
        int[] arr2= { 1, -2, 1, 0, 5};
        int target1 = -2;
        int target2 = 0;

        if (twoSum_1(arr1, target1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
