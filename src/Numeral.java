import java.util.Scanner;

public class Numeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = scanner.nextInt();
        int sum = 0;
        int maxDigit;
        int minDigit;
        maxDigit = minDigit = (int) (num % 10);

        // Максимальная и минимальная цифра
        while (num > 0) {
            int curDigit = (int) (num % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            if (curDigit < minDigit)
                minDigit = curDigit;
            num /= 10;
        }

        System.out.println("Максимальная цифра: " + maxDigit + ", Минимальная цифра: " + minDigit);

        //Суммирование цифр числа
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);

        // Суммирование нечетных цифр числа
        while (num != 0) {
            if (num % 2 == 0) {
                sum += (num % 10);
                num /= 10;
            }
        }
        System.out.println("Сумма нечетных цифр числа = " + sum);
    }
}
