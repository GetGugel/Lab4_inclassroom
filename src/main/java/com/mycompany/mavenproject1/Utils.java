/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author soblab
 */
class Utils {

    public int getCube(int cube) {
        return (cube * cube * cube);
    }

    public static boolean isPrime(int prime) {
        int user = prime;
        for (int i = 2; i < user; i++) {
            if (user % i == 0) {
                return false;
            }

        }
        return true;

    }

    public int getIntFromFile(String f1Name) throws FileNotFoundException {
        int num;
        Scanner sc = new Scanner(new File(f1Name));
        num = sc.nextInt();
        return num;

    }

}
