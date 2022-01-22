package com.company;

import java.util.Scanner;

public class Main {
    // reverse method
        public static void reverse(int array1[], int start, int end) {
            if (start >= end)
                return;

            //int temp;

            int temp = array1[start];
            array1[start] = array1[end]; // this is for the swap of the first and last element of the array.
            array1[end] = temp;
            reverse(array1, start + 1, end - 1);
        }

        public static void main(String[] args){
            Scanner console = new Scanner(System.in);
            // To read the Array size
            System.out.println("please imput the array size");
            int size =  console.nextInt();

            // To read the array values
            int[] array1 = new  int[size];
            System.out.println("please enter your values: ");
            for(int i = 0; i < array1.length; i++){
                array1[i] = console.nextInt();
            }

            // reverse the array
            reverse(array1, 0, size-1);
            System.out.println("The reverse of the array is: ");


            for(int i = 0; i < size; i++){
                System.out.print(array1[i] + ", ");
            }
            reverse(array1, 0, size-1);

            // largest value in array
            int largest = array1[0];
            for(int i = 0; i < array1.length; i++){
                if(array1[i] > largest) largest = array1[i];
            }
            System.out.println("The largest value in the Array is " + largest);

            int doubleArray = 0;
            System.out.println("The array with 2 time the number is:");
            for(int i = 0; i < array1.length; i++){
                doubleArray = array1[i] *2;
                System.out.print(doubleArray + " ");
            }



        }

}
