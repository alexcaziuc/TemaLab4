public class Tema14 {


// 14. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.

    public static void main(String[] args) {

        int extremitateaStanga = 9;
        int extremitateaDreapta = 24;
        int numar = 17;

        boolean gasit = false;

        for(int i = extremitateaStanga; i<= extremitateaDreapta; i++) {

            if (i == numar)

                gasit = true;
            }
        System.out.println(gasit);
        }
    }

