package com.example.myapplication;

public abstract class Shape {
    private Integer x;
    private Integer y;
    private String color="blue";
    protected Shape(Integer x, Integer y, String color) {
        this.x = x;
        this.y = y;
        this.color=color;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

}
