import java.util.Scanner;

public class Tema5 {

    // 5.  Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y.
    // C = (F - 32) * 5 / 9

    public static void main(String[] args) {

        double nrFahrenheit , nrCelsius;

        int gradX = 80;
        int gradY = 100;

        for(int i = gradX; i <= gradY; i++) {

            System.out.println(i + " Fahrenheit --> " + convertToCelsius(i) + " Celsius");
        }
    }

        static  double convertToCelsius(double fahrenheit) {

        return fahrenheit = (fahrenheit - 32) * 5/9;
    }


}
