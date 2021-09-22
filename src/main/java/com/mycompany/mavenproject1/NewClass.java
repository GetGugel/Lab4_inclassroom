package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) throws FileNotFoundException {

        int cube = 10;
        int prime = 10;
        int read = 0;

        Utils a = new Utils();
        System.out.println("The cube is " + a.getCube(cube));
        System.out.println("The 5 is prime " + a.isPrime(prime));
        System.out.println("Rad file name " + a.getIntFromFile("c://F//C.txt"));

    }

}
