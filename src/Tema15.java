public class Tema15 {

//    15. Se dau doua numere a si n. Sa se afiseze numarul a la puterea n
//    de ex
//    a = 3
//    n = 5
//    se va calcula 3*3*3*3*3

    public static void main(String[] args) {

        int a = 3, n = 4;

        int calculPutere = 1;

        for(int i = 0; i < n; i++){

            calculPutere *= a;
        }

        System.out.println(a+ " la puterea " + n + " = " + calculPutere);



    }

}
