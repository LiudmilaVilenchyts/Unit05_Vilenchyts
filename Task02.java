package lt.lhu.unit05.main;

//написать методы для нахождения суммы большего и меньшего из трех чисел
public class Task02 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = 1;
        int sum = sumNumbers(minNumber(x, y, z), maxNumber(x, y, z));
        System.out.println("Сумма большего и меньшего чисел равна " + sum);

    }

    public static int minNumber(int a, int b, int c) {
        int min = 0;
        if (a < b & b < c) {
            min = a;
        }
        if (a > b & b < c) {
            min = b;
        }
        if (a > b & b > c) {
            min = c;
        }
        return min;
    }

    public static int maxNumber(int a, int b, int c) {
        int max = 0;
        if (a < b & b < c) {
            max = c;
        }
        if (a < b & b > c) {
            max = b;
        }
        if (a > b & b > c) {
            max = a;
        }
        return max;
    }

    public static int sumNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
}