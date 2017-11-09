import java.util.Scanner;

public class Tema13 {

    // 13.Se citesc numere naturale pânã când se introduce numãrul 0.
    // Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numar, suma = 0;

        do {
            System.out.println("Introduceti numarul :");
            numar = scanner.nextInt();

            if (numar > 4 && numar < 11)
                suma += numar;

        } while (numar != 0);

        System.out.println("Suma numerelor >4 si <11 este : " + suma);
    }
}
