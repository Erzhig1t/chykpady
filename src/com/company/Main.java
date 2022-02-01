package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        getSan(new int[300]);
    }

    static int getSan(int[] array) {
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                return array[i];
            } else if (array[i] % 4 == 0) {
                return array[i];
            } else if (array[i] % 5 == 0) {
                return array[i];

            }
        }

    }

}


