package com.dsa.practice.sample;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        FirstRecurringCharacter firstRecurringCharacter = new FirstRecurringCharacter();
        int[] inputArray = {2, 5, 1, 8, 3, 4, 6};
        System.out.println(" First Recurring Number :- " + firstRecurringCharacter.find(inputArray));
        ;

    }

    public Integer find(int[] input) {
        Map map = new HashMap<Integer, Integer>();

        for (int i = 0; i < input.length; i++) {

            if (map.get(input[i]) == null) {
                map.put(input[i], 1);
            } else {

                int counter = (Integer) map.get(input[i]);
                map.put(input[i], counter + 1);
                return input[i];
            }
        }
        return null;
        //System.out.println(map);
    }
}
