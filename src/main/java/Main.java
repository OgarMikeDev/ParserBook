public class Main {
    public static void main(String[] args) {
        int sumSquare = 0;
        int sumKube = 0;
        for (int i = 10; i <= 25; i++) {
            if (i % 2 == 0) {
                sumSquare += Math.pow(i, 2);
            }
            if (i % 3 == 0) {
                sumKube += Math.pow(i, 3);
            }
        }
        System.out.println("Sum square: " + sumSquare);
        System.out.println("Sum kube: " + sumKube);
    }
}
