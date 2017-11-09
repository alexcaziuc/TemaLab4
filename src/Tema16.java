import java.util.Scanner;

public class Tema16 {

//    16. Sa se calculeze factorialul unui numar a .
//    factorialul este definit asa:
//    factorial  = 1*2*3*4….*a
//    de ex pentru a = 4, factorialul este 1*2*3*4

    public static void main(String[] args) {

        int factarial = 0;
        int produs = 1;
        int i = 1;
        int numar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numarul pentru care se calculeaza factorialul este: ");
        numar = scanner.nextInt();

        for(i = 1; i <= numar; i++){

            produs = produs * i;
        }

        System.out.println("Factorialul nr " + numar + " este = " + produs);
    }
}
