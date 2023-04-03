package com.jetbrains.marco;

public class SimpleJava {

    public static void main(String[] args) {
        //Loop in Java

        for (int i=0;i<10;i++) {
            System.out.println(printName("Jhon"));
        }

        Kucing myKucing = new Kucing();
        myKucing.dingDong();

        myKucing.name = "Fred";

    }


    private static String printName(String name) {
        if (name = "Jhon") {
            return "My name is " + name;
        }
    }
}
