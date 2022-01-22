package com.company;

import java.awt.*;
import java.util.RandomAccess;

public class ClientClass {

    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.x = 12;
        R.y = 6;
        R.width = 12;
        R.height = 14;

        System.out.println(R.toString());
    }
}
