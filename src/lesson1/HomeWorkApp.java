package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-3, 2);
        printColor(100);
        compareNumbers(10, 8);
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
            return;
        }

        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
            return;
        }

        System.out.println("Зеленый");
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
