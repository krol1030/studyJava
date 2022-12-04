package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(21);
        integerList.add(30);
        integerList.add(45);
        integerList.add(39);
        integerList.add(94);
        System.out.println("size (" + integerList.size() + ")");

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(i + " - " + integerList.get(i));
        }

        for (Integer num:integerList){
            if (num%2>0){
                System.out.println("нечётное: " + num);
            } else if (num>40){
                System.out.println("чётное больше 40: " + num);
            } else {
                System.out.println("чётное меньше 40: " + num);
            }
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("steps");
        stringList.add("in");
        stringList.add("JAVA!");
        for (String text : stringList) {
            System.out.print(text + " ");
        }
        System.out.println();

        int count = 0;
        while (count<stringList.size()){
            System.out.println(stringList.get(count));
            count++;
        }

        count = 0;
        do {
            System.out.println(count + " - " + stringList.get(count));
            count++;
        } while(count<stringList.size());
    }
}
