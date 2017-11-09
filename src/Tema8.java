public class Tema8 {

//    A turtle goes D km in H hours.
//    calculate the speed of the turtle expressed in meters/second

    public static void main(String[] args) {

        double distanceKmD = 270;
        double hoursH = 150;

        double distanceMetersD, secondsH, speedOfTurtle;

        distanceMetersD = distanceKmD * 1000;
        secondsH = hoursH * 60 * 60;

        speedOfTurtle = distanceMetersD / secondsH;

        System.out.println(distanceMetersD + " is the distance in meters.");
        System.out.println(secondsH + " is the time in seconds.");

        System.out.println("The speed of the turtle is: " + speedOfTurtle + " m/s");
    }

}
