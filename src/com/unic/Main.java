// Java program to find unic number
package com.unic;

// Main class
public class Main {

    public static int findUnicNumber(int [] arr){

        // Creating temporal variable
        int res = arr[0];

        // Creating cycle for taking each array value for comparing
        for(int i = 1; i < arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {

        int arr[] = {3, 5, 4, 5, 6, 6, 8, 3, 4};
        System.out.println(findUnicNumber(arr));

        // How it works
        // System.out.println(3 ^ 5 ^ 4 ^ 5 ^ 6 ^ 6 ^ 8 ^ 3 ^ 4);
    }
}

// This code is contributed by Julia Msrushchenko