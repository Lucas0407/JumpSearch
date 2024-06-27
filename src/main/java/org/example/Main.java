package org.example;


public class Main {
    public static void main(String[] args) {
        Integer salto = 4;
        Integer numeroEsperado = 55;
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        for (int i = 0; i < array.length; i+=salto){
            if(array[i] > numeroEsperado){
                salto = 1;
                i = i-4;
            }
            if(array[i] == numeroEsperado){
                System.out.println("O número esperado se encontra no Index: " + i);
                return;
            }
        }
    }
}