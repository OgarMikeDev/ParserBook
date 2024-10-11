import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите сумму первичного вклада: ");
        int start = new Scanner(System.in).nextInt();
        System.out.println("Введите сумму, кот-ю хотите получить: ");
        int end = new Scanner(System.in).nextInt();
        int percent = 10;
        int years = 0;

        while (start < end) {
            start += (start * percent) / 100;
            years++;
        }

        System.out.print("За период, равный " + years + " годам мы накопим " + start + " руб.");
    }
}
