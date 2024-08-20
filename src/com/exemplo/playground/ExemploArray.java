package com.exemplo.playground;

public class ExemploArray {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[5];
        arrayNumeros[0] = 100;
        arrayNumeros[1] = 200;
        arrayNumeros[2] = 300;
        arrayNumeros[3] = 400;
        arrayNumeros[4] = 500;
        System.out.println(arrayNumeros.length);

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println(arrayNumeros[i] + ";");
        }

        int[][] arrayMatriz = new int[5][5];
        int[][][] arrayMatriz3Posicoes = new int[5][5][5];

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayMatriz.length; j++) {
                System.out.println(arrayNumeros[i] + "; " + arrayMatriz[j]);
                System.out.print("--");
            }
        }
    }
}
