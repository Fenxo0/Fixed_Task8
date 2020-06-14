package com.company;

public class Solution {
    public static int[][] process(int[][] arr) {
        int k = 0, znack = 0, k1 = 0, znack1 = 0;
        int[][] mas1 = new int[arr.length][arr.length];
        /*mas [0][0] = 5;
        mas [0][1] = 5;
        mas [0][2] = 5;
        mas [1][0] = 7;
        mas [1][1] = 6;
        mas [1][2] = 8;
        mas [2][0] = 5;
        mas [2][1] = 5;
        mas [2][2] = 5;

         */
	    /*for (int i = 0; i < n; i++)
	        for (int j = 0; j < n; j++){
	            mas[i][j] = rnd.nextInt(9) + 1;
            }*/
        for (int g = 0; g < arr.length; g++) {
            System.out.println();
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[g][j]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            znack1 = arr[i][0];
            znack = arr[i][0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > znack) {
                    znack = arr[i][j];
                    k = j;
                }
                if (znack1 > arr[i][j]) {
                    znack1 = arr[i][j];
                    k1 = j;
                }
            }
            Sedl1(arr, znack, k, arr.length, i, mas1);
            Sedl(arr, znack1, k1, arr.length, i, mas1);
        }
        return mas1;
    }

    static int[][] Sedl1(int[][] mas, int znack, int k, int n, int i, int[][] mas1) {
        boolean flag = true;
        for (int g = 0; g < n; g++) {
            flag = znack < mas[g][k];
        }
        if (flag) {

            for (int j = 0; j < n; j++) {
                if (j == k) mas1[i][j] = 1;
            }
        }
        return mas1;
    }

    static int[][] Sedl(int[][] mas, int znack, int k1, int n, int i, int[][] mas1) {
        boolean flag = true;
        for (int g = 0; g < n; g++) {
            flag = znack > mas[g][k1];
        }
        if (flag) {
            mas1[i][k1] = 1;
        }
        return mas1;
    }
}

