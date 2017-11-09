public class Tema12 {

    //  12. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si 20

    public static void main(String[] args) {

        int n = 20;
        int suma = 0;

        for (int i = 0; i <= 20; i++) {

            suma = suma + i;
        }
        System.out.println("Suma primelor n numere unde n = " + n + " este : " + suma);
    }
}
