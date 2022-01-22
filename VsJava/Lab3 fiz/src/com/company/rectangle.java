package com.company;

public class rectangle {
    int x;
    int y;
    int width;
    int height;

    public void setField(int x, int y, int width, int height){
        this.x =x;
        this.y =y;
        this.width = width;
        this.height = height;
    }



    public void setX(){
        this.x = x;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public String toString(){
        return "[x = " + x + "y = " + y + "width = " + width + "height = " + height + "]";


    }
}
