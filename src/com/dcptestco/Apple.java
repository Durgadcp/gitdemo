package com.dcptestco;

public class Apple {

    private String color;
    private int weigh;

    Apple(String color,int weigh)
    {
        this.color=color;
        this.weigh=weigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
}
