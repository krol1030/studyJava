package org.example.animals;

public class Cat implements CatPrint {
    public static int count;
    private String name;
    private int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        count++;
        System.out.println("Котик №"+count+" родился! :) " + this.ToString());
    }

    @Override
    public String ToString(){
        String catString = "Имя: "+name+", Возраст: "+age;
        return catString;
    }

    public String GetName() {
      return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
