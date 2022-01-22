package com.company;

public class Main {
    int x;
    int y;
    int width;
    int height;
    int area;


    public Main(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // To set all the values
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setDimensions(int width, int height){
        this.width = width;
        this.height= height;
    }

    // To get all the values
    public int xCalc(){
        return this.x;
    }
    public int yCalc(){
        return this.y;
    }
    public int widthCalc(){
       return this.width;
    }
    public int heightCalc(){
        return this.height;
    }
    public int getArea(){
        area = this.width * this.height;
        return area;
    }

    //boolean method to check if the object is a square
    public boolean insSquare(){
        if(this.height == this.width){
            return true;
        }
        return false;
    }

}



