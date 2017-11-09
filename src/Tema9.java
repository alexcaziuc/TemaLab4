public class Tema9 {

//    Ion lives in Cluj and Florica lives in Floresti and you know
//    the distance between Cluj and Floresti is k kilometres.
//    They plan to meet somewhere between the two cities
//    so they start driving on the same road in the same moment.
//    Assuming you know the speed of their car vIon and vFlorinca
//    and this is kept constant pls calculate after how much time
//    they meet (in minutes)
//    and at what distance from Cluj.

    public static void main(String[] args) {

        double distanceClujToFlorestiK = 12;
        double speedvIon = 50;
        double speedvFlorinca = 30;

        double timpH, timpM;
        double distantaDeCj = 0;

        timpH = distanceClujToFlorestiK / (speedvIon + speedvFlorinca);
        timpM = timpH * 60;

        distantaDeCj = timpH * speedvIon;

        System.out.println("Ion and Florinca se intalnesc in " + timpM + " minute la " + distantaDeCj + " Km" + " distanta de CLuj.");
    }
}
