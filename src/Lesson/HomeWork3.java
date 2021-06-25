package Lesson;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    static Random random = new Random();

    public static void main(String[] args) {
        isArray();
        isArrayTwo(100);
        isArrayThree();
        isSquareArray(5);
        isArrayFive(5, 10);
        System.out.println("min is" + " " + isArraySixMin());
        System.out.println("max is" + " " + isArraySixMax());
        //     System.out.println(minInArray());
        //     System.out.println(maxInArray());
        System.out.println("Задание7" + " " + intArrFSix());
    }


    /**
     * метод, c целочисленныv массивом, состоящим из элементов 0 и 1.
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void isArray() {
        int[] intArr = {0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1};
        System.out.println("Задание1");
        System.out.println("befor" + Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 0)
                intArr[i] = 1;
            else intArr[i] = 0;
        }
        System.out.println("after" + Arrays.toString(intArr));
    }

    /**
     * метод, c пустым целочисленным массивом длиной 100. С помощью цикла заполнен значениями 1 2 3 4 5 6 7 8 … 100;
     */
    private static void isArrayTwo(int size) {
        int[] intArrTwo = new int[size];
        System.out.println("Задание2");
        System.out.println("befor" + Arrays.toString(intArrTwo));
        for (int i = 0; i < intArrTwo.length; i++) {
            intArrTwo[i] = i + 1;
        }
        System.out.println("after" + Arrays.toString(intArrTwo));
    }

    /**
     * метод, который задает массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] проходится по нему циклом, и числа меньшие 6 умножает на 2;;
     */
    private static void isArrayThree() {
        int[] intArrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание3");
        System.out.println("befor" + Arrays.toString(intArrThree));
        for (int i = 0; i < intArrThree.length; i++) {
            if (intArrThree[i] < 6)
                intArrThree[i] *= 2;
        }
        System.out.println("after" + Arrays.toString(intArrThree));
    }

    /**
     * Метод, создающий квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполняющий его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void isSquareArray(int size) {
        int[][] sqrArr = new int[size][size];
        System.out.println("Задание4");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArr[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
     */
    private static void isArrayFive(int len, int initialValue) {
        int[] intArrFive = new int[len];
        System.out.println("Задание5");
        for (int i = 0; i < len; i++) {
            intArrFive[i] = initialValue;
        }
        System.out.println(Arrays.toString(intArrFive));
    }

    /**
     * метод,который задает одномерный массив и находит в нем минимальный и максимальный элементы
     */
    private static int isArraySixMin() {
        System.out.println("Задание6");
        int[] intArrFSix = {0, 1, -25, 100, -99};
        System.out.println(Arrays.toString(intArrFSix));
        int min = intArrFSix[0];
        for (int i = 0; i < intArrFSix.length; i++) {
            if (min > intArrFSix[i])
                min = intArrFSix[i];
        }
        return min;
    }

    private static int isArraySixMax() {
        System.out.println("Задание6");
        int[] intArrFSix = {0, 8, -45, 700, 99};
        System.out.println(Arrays.toString(intArrFSix));
        int max = intArrFSix[0];
        for (int i = 0; i < intArrFSix.length; i++) {
            if (max < intArrFSix[i])
                max = intArrFSix[i];
        }
        return max;
    }

    /**
     * метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    public static boolean intArrFSix() {
        int[] array = {1, 2, 3, 1, 2, 3};
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += (j > i) ? array[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}