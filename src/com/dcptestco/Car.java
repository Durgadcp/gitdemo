package com.dcptestco;

public class Car extends Thread {

    @Override
    public void run() {
        System.out.println("in Car class extended Thread class");
    }

}
