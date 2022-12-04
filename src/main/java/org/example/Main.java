package org.example;

import org.example.animals.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Котиков было: "+Cat.count);
        Cat Sema = new Cat("Sema", 3);
        /*System.out.println("Сам котик: "+Sema.ToString());*/
        Cat Rijik = new Cat("Rijik", 5);
        Rijik.setName("Orange Rijik");
        /*System.out.println("Сам котик: "+Rijik.ToString());*/
        Cat Ivashka;
        Ivashka = new Cat("Ivashka", 1);

        System.out.println("Котиков стало: "+Cat.count);

        boolean giveTrue = true;
        short st = 11111;
        int num = 1111111111;
        long lng = 1111111111111111111L;
        float fl = 8.18f;
        double dbl = 5.51;
        char ch = 'A';
        byte bb = 123;

        char[] name = new char[4];
        name[0] = 'S';
        name[1] = 'E';
        name[2] = 'M';
        name[3] = 'A';
        System.out.println(String.valueOf(name));

        List<String> stringList = new ArrayList<>();
        stringList.add("Kitty");
        stringList.add("Doggy");
        System.out.println(String.valueOf(stringList));

    }

}
