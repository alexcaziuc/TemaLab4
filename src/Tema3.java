import java.util.Scanner;

public class Tema3 {

    //3. Se se calculeze media aritmetica pana ce numarul citit este 0.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numar1, numar2;

        do {
            System.out.println("Primul nr: ");
            numar1 = scanner.nextDouble();

            System.out.println("Al doilea nr: ");
            numar2 = scanner.nextDouble();

            if (!(numar1 == 0 || numar2 == 0)) {
                double average = (numar1 + numar2) / 2;
                System.out.println("Media celor doua numere este: " + average);
            }
        } while (!(numar1 == 0 || numar2 == 0));
    }
}