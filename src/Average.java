import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        int j = 100;
        int sum = 0;
        System.out.println(" введите начальное число, оно должно быть больше 1");
        i = scanner.nextInt();
        while (i < 2) {
            System.out.println("Введите число больше 1");
            i = scanner.nextInt();
        }
        System.out.println("введите конечное число");
        j = scanner.nextInt();
        double count = j - i + 1;

        // Цикл для среднего арифметического

        while (i <= j) {
            sum = sum + i;
            i++;
        }
        System.out.println("Среднее арифметическое = " + sum / count);

//        Цикл для натуральных чисел диапазона

        for (; i <= j; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                i++;
            }
        }
        System.out.println("Среднее арифметическое натуральных чисел = " + sum / count);

    }
}
