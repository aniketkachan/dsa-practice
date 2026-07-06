package com.dsa.practice.sample;

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        String inputStr = "My Name is Aniket Kachan";
        String s = new ReverseString().reverseString(inputStr);
        System.out.println("Reverse String - " + s);

        int[] firstArray = {0, 3, 4, 31};
        int[] secondArray = {4, 5, 6, 9, 30};
        new ReverseString().mergeSortedArray(firstArray, secondArray);

        //new ReverseString().mergeSortedArrays(firstArray, secondArray);
    }

    void mergeSortedArray(int[] firstArray, int[] secondArray) {

        List mergedList = new ArrayList();
        int firstItem = firstArray[0];
        int secondItem = secondArray[0];
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        boolean isFirstItemExist = true;
        boolean isSecondItemExist = false;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstArray.length && j < secondArray.length) {
            System.out.println(firstArray[i] + " " + secondArray[j]);

            if (firstArray[i] <= secondArray[j]) {
                mergedArray[k++] = firstArray[i++];
            } else {
                mergedArray[k++] = secondArray[j++];
            }
        }

        while (i < firstArray.length) {
            mergedArray[k++] = firstArray[i++];
        }
        while (j < secondArray.length) {
            mergedArray[k++] = secondArray[j++];
        }

        System.out.println("Output");
        Arrays.stream(mergedArray).forEach(System.out::println);


    }

    String reverseString(String inputStr) {
        char[] charArray = inputStr.toCharArray();

        String output = "";
        for (int i = charArray.length - 1; i >= 0; i--) {

            output = output + charArray[i];
        }
        return output;
    }


    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and pick the smaller element
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Append remaining elements from arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Append remaining elements from arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        Arrays.stream(merged).forEach(System.out::println);
        return merged;
    }
}
