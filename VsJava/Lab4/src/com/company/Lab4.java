
package com.company;
public class Lab4 {
    int x;
    int y;
    int length;
    static int number;
    public Lab4(){
        x=0;
        y=0;
        length=5;
        number++;
    }
    public Lab4(int x, int y){
        this.x = x;
        this.y = y;
            this.length = 5;
        number++;
    }
    public Lab4(int length){
        this.length = length;
        this.x = 0;
        this.y = 0;
        number++;
    }

    public String toString(){
        return this.x + " " + this.y;
    }
    public static int numberOfObj(){
        return number;
    }
}


