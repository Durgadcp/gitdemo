package com.dcptestco;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main  {

    public static void main(String[] args) {
        System.out.println("Hi DCP !!");

        Thread anotherThread = new Car();
        anotherThread.start();

        new Thread()
        {
            @Override
            public void run() {
                System.out.println("in anonymus thrad");
            }
        }.start();


        new Thread(()-> System.out.println("in LE thrad")).start();

List<Apple> apple = Arrays.asList(new Apple("yello",123),
        new Apple("orange",190));

//













    }




}
