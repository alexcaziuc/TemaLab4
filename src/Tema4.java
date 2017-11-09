import java.util.Scanner;

public class Tema4 {

    //4. Se da un numar in grade Fahrenheit. Sa se converteasca in Celsius stiind formula.
    // C = (F - 32) * 5 / 9

    public static void main(String[] args) {

        double nrFahrenheit, nrCelsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        nrFahrenheit = scanner.nextDouble();

        nrCelsius = (nrFahrenheit -32) * 5/9;

        System.out.println(nrFahrenheit + " Fahrenheit in Celsius is: " + nrCelsius + " Celsius");

    }

}
