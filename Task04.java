package lt.lhu.unit05.main;

import java.util.Random;

//составить методы для вычисления суммы трех последовательно расположенных элементов массива с номерами от К до М
public class Task04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillInArray(arr);
        sumEachThreeElements(arr);
    }

    public static void fillInArray(int[] a) {
        Random rand = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
            System.out.printf("[%2d]", a[i]);
        }
        System.out.println();
    }

    public static void sumEachThreeElements(int[] a) {
        int sum = 0;
        int count = 0;
        int j=0;
        int[] b = new int[a.length];
        System.out.println("Массив с суммами элементов:");
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            count++;
            if (count == 3) {
                b[j] = sum;
                System.out.printf("[%2d]", b[j]);
                count = 0;
                sum = 0;
                j++;
                }
            }
        }
    }


