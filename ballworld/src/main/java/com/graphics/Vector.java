package com.graphics;

public class Vector {
    int dx = 0;
    int dy = 0;
    int x;
    int y;
    
    public Vector(){
        dx = 0;
        dy = 0;
    }
    public Vector(int dx, int dy){
        this.dx = dx;
        this.dy = dy;
    }

    public int getDX(){
        return dx;
    }

    public int getDY(){
        return dy;
    }

    public void setDX(int dx){
        this.dx = dx;
    }

    public void setDY(int dy){
        this.dy = dy;
    }

    public void turnDX(){
        setDX(-getDX());
    }

    public void turnDY(){
        setDY(-getDY());
    }
    
    public void add(Vector other){
        setDX(getDX() + other.getDX());
        setDY(getDY() + other.getDY());
    }
    
    public void set(int dx, int dy){
        setDX(dx);
        setDY(dy); //직접 값을 쓰면 안좋기때문이다.
    }
    
    public void set(Vector other){
        setDX(getDX());
        setDY(getDY());
    }
  
    public void sub(Vector other){
        setDX(getDX() - other.getDX());
        setDY(getDY() - other.getDY());
    }
    
    @Override
    public boolean equals(Object other) {
        return (other instanceof Vector) && (((Vector) other).getDX() == getDX())
                && (((Vector) other).getDY() == getDY());
    }
}