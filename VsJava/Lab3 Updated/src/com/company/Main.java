package com.company;

public class Lab3 {
    int x;
    int y;
    int newHeight;
    int newWidth;


    public static void main(String[] args) {
        Lab3 n = new Number();
        n.setX = 12;
        n.SetY = 14;
        n.SetNewHeight = 20;
        n.SetNewWidth = 18;
        System.out.println(n.getX() + n.getY() + n.getNewHight() + n.getNewWeidth());

    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void SetNewHeight(int newHeight){
        this.newHeight = SetNewHeight();
    }
    public void SetNewWidth(int newHeight){
        this.newWidth = SetNewWidth();
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

