package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        public setField(int newx, int newy, int newweight, int newheight) {
            Scanner console = new Scanner(System.in);
            System.out.println("please imput the the x coordinate of the ractangle: ");
            newx = console.nextInt();
            System.out.println("please imput the the y coordinate of the ractangle: ");
            newy = console.nextInt();
            System.out.println("please imput the the width of the ractangle: ");
            newweight = console.nextInt();
            System.out.println("please imput the the Height of the ractangle: ");
            newheight = console.nextInt();
            System.out.println("x = " + newx + "y = " + newy + "weigth = " + newweight + "Height = " + newheight);
        }
    }
}
