import java.util.Random;


public class LottoGame {

    public static void main(String[] args) {

        int[] agencyNumbers = uniqueRandomArray(6);
        int[] myNumbers = new int[6];

        int lucky = 0;
        int nrTickets = 0;

        final int NR = 4;

        //generez sirul agentiei
//        for (int j = 0; j < 6; j++) {
//
//           agencyNumbers[j] =  new Random().nextInt(49) + 1;
//        }

        // bucla while : atata timp cat nu am un bilet cu minim 4 numere ghicite
        while (lucky <= NR) {
            lucky = 0; // init because I play another ticket
            // generez sirul meu
            for (int j = 0; j < 6; j++) {
                //myNumbers[j] = new Random().nextInt(49) + 1;

                myNumbers = uniqueRandomArray(6);

            }
            // gasesc cate am ghicite
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (agencyNumbers[j] == myNumbers[k])
                        lucky++;
                }
            }
            // incrementez cu 1 numarul de bilete simple jucate
            nrTickets++;

        }
        // gata bucla atata timp

        System.out.println("\nAm ghicit " + NR + " numare dupa " + nrTickets + " bilete jucate");
        System.out.println("\nMy Numbers:");
        for (int j = 0; j < 6; j++) {
            System.out.print(myNumbers[j] + ":");
        }

        System.out.println("\nAgency Numbers:");
        for (int j = 0; j < 6; j++) {
            System.out.print(agencyNumbers[j] + ":");
        }
    }

    // Generez un Array random unic
    public static int[] uniqueRandomArray(int size) {

        int[] uniqueArray = new int[size];

        for (int i = 0; i < size; i++) {
            uniqueArray[i] = new Random().nextInt(49) + 1;

            for (int j = 0; j < i; j++) {
                if (uniqueArray[i] == uniqueArray[j]) {
                    i--;
                }
            }
        }

        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        System.out.println();
        return uniqueArray;
    }
}