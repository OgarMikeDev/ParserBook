import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int endNum = new Scanner(System.in).nextInt();
        int step = 0; //шаг, показывающий кол-во повторений цикла
        int num1 = 0, num2 = 1;
        int sum = 0;
        System.out.println("Числа Фибоначчи до введенного числа " + endNum + ":");
        while(sum <= endNum){
            System.out.println(num1);
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            step++;
        }
        System.out.println("За " + step + " шагов программа нашла и распечатала ряде чисел Фибоначчи!");
    }
}
