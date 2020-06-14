package com.company;


import Utils.ArrayUtils;

import java.io.FileNotFoundException;

public class ConsoleUI {

    public void play(String outFile, int[][] array) throws FileNotFoundException {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + ints[j]);
            }
            System.out.println();
        }

        System.out.println(" Массив с седлыми точками:");
        array = Solution.process(array);

        System.out.println();
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                ArrayUtils.writeArrayToFile(outFile, array);
                System.out.print(" " + ints[j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Массив записан в файл " + outFile + " ");
        System.out.println();

    }

}
