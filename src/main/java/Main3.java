import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int limit = 1000;
        int sumWeight = 0;
        while (sumWeight <= limit) {
            System.out.println("Здравствуйте, введите свой вес в кг: ");
            int currentWeight = new Scanner(System.in).nextInt();
            sumWeight += currentWeight;
            if (sumWeight > limit) {
                System.out.println("Вес в кг превышен на " + (sumWeight - limit));
            }
        }
    }
}
