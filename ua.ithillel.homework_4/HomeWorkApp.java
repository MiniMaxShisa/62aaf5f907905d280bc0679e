package ua.ithillel.homework_4;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isTenToTwenty(15, 5));
        identifyNumber(0);
        System.out.println(isPositive(-1));
        printString(3, "Hello");
        System.out.println(isLeap(2022));
    }

    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -2;

        if ((a + b) <= -1) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isTenToTwenty(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void identifyNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isPositive(int a) {
        return a < 0;
    }

    public static void printString(int amount, String str) {
        System.out.println(str.repeat(amount));
    }

    public static boolean isLeap(int year) {
        return year %4 == 0 && year %100 != 0 || year %400 == 0;
    }
}