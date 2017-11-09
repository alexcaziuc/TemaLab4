import java.util.Scanner;

// 2. Sa se calculeze media aritmetica a N numere.

public class Tema2 {

    public static void main(String[] args) {

        int nNumere;
        double average = 0;

        Scanner scanner = new Scanner(System.in);

        // de cate nr sa fie sirul
        System.out.println("De cate numere sa fie sirul ?");
        nNumere = scanner.nextInt();

        // se defineste un sir de n numere
        int sirNumereN[] = new int[nNumere];

        // se introduc de la tastatura n numere
        System.out.println("Enter " + nNumere + " numbers :");
        for (int i = 0; i < nNumere; i++)
            sirNumereN[i] = scanner.nextInt();

        // se calculeaza suma numerelor din array
        for (int i = 0; i < nNumere; i++)
            average = average + sirNumereN[i];

        System.out.println("Media = " + average / nNumere);
    }
}


