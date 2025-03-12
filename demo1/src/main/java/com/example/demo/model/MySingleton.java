package com.example.demo.model;


public class MySingleton {

    private int i = 100;
    private static MySingleton instance;
    // double lock. design pattern
    // creation patterns
    public static MySingleton getInstance() {
        if(instance == null) {
            synchronized(MySingleton.class) {
                if(instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private MySingleton() {

    }
}
