package org.javahawk.dsa.array;

import java.util.Arrays;

public class ProductExceptSelf {
    /**
     * Given an array arr[] of n integers, construct a product array res[] (of the same size)
     * such that res[i] is equal to the product of all the elements of arr[] except arr[i].
     *
     * @param arr
     * @return
     */

    static int[] method_1(int[] arr) {
        int n = arr.length;
        int[] res = new int[n]; // create the array as equal length of input arr
        Arrays.fill(res, 1); // initialize the result array with 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    res[i] *= arr[j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = method_1(arr);
        System.out.print("res = [");
        for (int val : res) {
            System.out.print(val + ",");
        }
        System.out.print("]");
    }

}
