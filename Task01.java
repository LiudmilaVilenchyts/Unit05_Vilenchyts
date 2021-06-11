package lt.lhu.unit05.main;
// написать методы для нахождения НОД и НОК двух натуральных чисел

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int nod;
        int nok;
        System.out.println("введите первое число");
        x = readIntFromConsole(x);
        System.out.println("введите второе число");
        y = readIntFromConsole(y);
        nod = nodMethod(x, y);
        nok = nokMethod(x, y);
        System.out.println("НОД: " + nod);
        System.out.println("НОК: " + nok);
    }

    public static int readIntFromConsole(int a) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();

        } else {
            System.out.println("неверный ввод");

        }
        return a;
    }

    public static int nodMethod(int a, int b) {
        int res;
        while ((b != 0) & (a != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        res = a + b;
        return res;
    }

    public static int nokMethod(int a, int b) {
        int res;
        res = (a * b) / nodMethod(a, b);
        return res;
    }

}

