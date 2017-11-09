import java.util.Scanner;

public class Tema1 {

    // 1. Sa se calculeze media aritmetica a doua numere.

    public static void main(String[] args) {

        int nr1 = 0, nr2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primul numar: ");
        nr1 = scanner.nextInt();
        System.out.println("Al doilea numar: ");
        nr2 = scanner.nextInt();

        double average = (nr1 + nr2) / 2;
        System.out.println("Media celor doua numere este: " + average);

    }
}
