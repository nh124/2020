package com.company;
public class Lab3pdated{
    int x;
    int y;
    int newHeight;
    int newWidth;


    public static void main(String[] args) {
        Lab3pdated n = new Lab3pdated();
        n.setX (12);
        n.setY (14);
        n.SetNewHeight(20);
        n.SetNewWidth(18);
        System.out.println("x: " + n.getX() +"\ny: " + n.getY() +"\nHeight: " + n.getNewHeight() + "\nWidth: " + n.getNewWidth());

    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void SetNewHeight(int newHeight){
        this.newHeight = newHeight;
    }
    public void SetNewWidth(int newWidth){
        this.newWidth = newWidth;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getNewHeight(){
        return this.newHeight;
    }
    public int getNewWidth(){
        return this.newWidth;
    }


}

