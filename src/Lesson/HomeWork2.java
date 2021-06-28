package Lesson;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(isSumNumber(0, 0));
        System.out.println(isSumNumber(-5, 0));
        System.out.println(isSumNumber(1, 4));
        System.out.println(isSumNumber(12, 8));
        System.out.println(isSumNumber(12, 55));
        printPositiveNumber(-5);
        printPositiveNumber(-0);
        printPositiveNumber(8);
        System.out.println(isNegativeNumber(-8));
        System.out.println(isNegativeNumber(-0));
        System.out.println(isNegativeNumber(7));
        printText("Java Java Java Java", 8);
        System.out.println(isLeapYear(1988));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1773));
        System.out.println(isLeapYear(2020));
    }


    /**
     * метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – возвращается true, в противном случае – false
     */
    public static boolean isSumNumber(int a, int b) {
        int c = a + b;
//        return c >= 0 && c <= 20;
        if (c >= 0 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом
     */
    private static void printPositiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число ");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    /**
     * Метод, которому в качестве параметра передается целое число.
     * Метод возвращает true, если число отрицательное,
     * и вернуть false если положительное.
     */

    private static boolean isNegativeNumber(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод, которому в качестве аргументов передается строку и число,
     * метод отпечатывает в консоль указанную строку, указанное количество раз;
     */
    private static void printText(String a, int k) {
        for (int j = 0; j < k; j++) {
            System.out.println(a);
        }
    }

    /**
     * метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    static boolean isLeapYear(int i) {
        if (!(i % 4 == 0) || ((i % 100 == 0) && !(i % 400 == 0))) {
            return false;
        } else {
            return true;
        }
    }
}