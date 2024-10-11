import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        String correctPassword = "Sochi2024!";
        String inputPassword = "";
        int countAttempts = 0;
        boolean findPassword = false;
        while (!findPassword && countAttempts < 5) {
            System.out.println("Введите пароль: ");
            inputPassword = new Scanner(System.in).nextLine();
            if (inputPassword.equals(correctPassword)) {
                findPassword = true;
            } else {
                System.out.println("Ответ не верный!");
                countAttempts++;
            }
        }
        if (findPassword) {
            System.out.print("Это правильный ответ!");
        } else {
            System.out.print("Это безнадёжно");
        }
    }
}
