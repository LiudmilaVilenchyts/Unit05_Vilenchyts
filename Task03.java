package lt.lhu.unit05.main;

// написать методы, определяющие в каком из данных двух чисел больше цифр
public class Task03 {
    public static void main(String[] args) {
        int x = 345;
        int y = 87654;
        compareNumbers(x, y);
    }

    public static int numberLength(int a) {
        String s = Integer.toString(a);
        int length = s.length();
        return length;
    }

    public static void compareNumbers(int a, int b) {
        if (numberLength(a) > numberLength(b)) {
            System.out.println("В числе " + a + " цифр больше, чем в числе " + b);
        } else {
            System.out.println("В числе " + b + " цифр больше, чем в числе " + a);
        }
    }
}
