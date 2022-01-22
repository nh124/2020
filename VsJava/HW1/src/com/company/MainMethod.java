/* The purpose of this code is to take inputs from the console(the coordinates, and the dimensions)
 and print out the the location in the form of coordinates, dimensions of the rectangle and compute the area.
 it will also run and see if the dimension the user has entered result in the object to be a square*/
package com.company;
import java.util.*;

//client class
public class MainMethod {
    public static void main(String[] args){
        //scanner
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the x value");
        int x = console.nextInt();
        System.out.println("Please enter the y value");
        int y = console.nextInt();
        System.out.println("Please enter the length value");
        int length = console.nextInt();
        System.out.println("Please enter the width value");
        int width = console.nextInt();

        // main constructor
        Main numbers = new Main(x,y,width,length);

        System.out.println(("Rectangle location is: (" + numbers.xCalc() + "," + numbers.yCalc()) + ")" +
                (" With dimensions: " + numbers.widthCalc() + " x " + numbers.heightCalc()) +
                (" and area is: " + numbers.getArea()) + " " + numbers.insSquare());
    }
}

