package ru.geekbrains.vtoroj_urok;

public class Main {

    public static void main(String[] args) {

        invertArray();

        zadanie2();

        zadanie3();

        zadanie4();
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 0;
                {
                    array[i] = 1;
                }
            }
            System.out.print(" " + array[i]);
        }
        {
            System.out.println(" ");
        }
    }

    //2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void zadanie2() {
        int[] arr = new int[8];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a * 3;
            System.out.print(" " + arr[a]);
        }
        {
            System.out.println(" ");
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void zadanie3() {
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int b = 0; b < arr1.length; b++) {
            if (arr1[b] < 6) {
                arr1[b] = arr1[b] * 2;
            }
            System.out.print(" " + arr1[b]);}
        {
            System.out.println(" ");
        }
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void zadanie4() {
        int[][] kvadr = new int[4][4];
        for (int a1 = 0; a1 < 4; a1++) {
            for (int j = 0; j < 4; j++){
                if (kvadr[a1]==kvadr[j]){
                kvadr[a1][j] = 1;}
                else if (kvadr[3-a1] == kvadr[j]){
                    kvadr[a1][j] = 1;}


                System.out.print(kvadr[a1][j] + " ");

            }
            System.out.println();}

            }

        }


