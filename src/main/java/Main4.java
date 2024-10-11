import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int sum = 0;
        int currentNumber = 1;
        while (currentNumber != 0) {
            System.out.println("Введите натуральное число: ");
            currentNumber = new Scanner(System.in).nextInt();
            sum += currentNumber;
        }
        System.out.print("Сумма введённых Вами чисел равна: " + sum);
    }
}
