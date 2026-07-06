package com.dsa.practice.sample;

import java.util.HashMap;

public class Sample {

    //Given 2 arrays, create a function that let's a user know (true/false) whether these two arrays contain any common items
    //For Example:
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'i'];
//should return false.
//-----------
//const array1 = ['a', 'b', 'c', 'x'];//const array2 = ['z', 'y', 'x'];
//should return true.

// 2 parameters - arrays - no size limit
// return true or false

    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'q', 'w', 'j', 'c'};
        boolean b = new Sample().checkCommonItems2(array1, array2);
        System.out.println("The Result is : " + b);
    }


    public boolean checkCommonItems(char[] array1, char[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCommonItems2(char[] array1, char[] array2) {

        HashMap arrayMap = new HashMap();
        for (int i = 0; i < array1.length; i++) {
            if (!arrayMap.containsKey(array1[i])) {
                arrayMap.put(array1[i], true);
            }
        }

        for (int j = 0; j < array2.length; j++) {
            if (arrayMap.containsKey(array2[j])) {
                return true;
            }
        }
        return false;
    }

}
