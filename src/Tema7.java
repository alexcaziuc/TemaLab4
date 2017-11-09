public class Tema7 {

    // The final price of a product is p RON. Calculate the VAT if this is 19%.

    public static void main(String[] args) {

        double price = 275.0;
        double VAT, finalPrice;

        VAT = price * 0.19;
        finalPrice = price + VAT;

        System.out.println("The VAT is: " + VAT);
        System.out.println("The final price is: " + finalPrice);

    }

}
