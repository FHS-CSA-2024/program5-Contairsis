//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[] args){
        int miles = 0;
        int gallons = 0;
        double royMPG = 0;
        double koopMPG = 0;
        double pipeMPG = 0;
        double badMPG = 0;
        miles = 286;
        gallons = 9;
        royMPG = (double) miles / gallons;
        miles = 412;
        gallons = 40;
        koopMPG = (double) miles / gallons; 
        miles = 361;
        gallons = 18;
        pipeMPG = (double) miles / gallons;
        miles = 161;
        gallons = 11;
        badMPG = (double) miles / gallons;
        royMPG = (int)((royMPG + 0.5) * 10) / 10.0;
        koopMPG = (int)((koopMPG + 0.5) * 10) / 10.0;
        pipeMPG = (int)((pipeMPG + 0.5) * 10) / 10.0;
        badMPG = (int)((badMPG + 0.5) * 10) / 10.0;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n");
        System.out.println("Royale averaged " + royMPG + "\n");
        System.out.println("Koopa King averaged " + koopMPG + "\n");
        System.out.println("Pipe Frame averaged " + pipeMPG + "\n");
        System.out.print("Badwagon averaged " + badMPG);
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 32.2

Koopa King averaged 10.8

Pipe Frame averaged 20.5

Badwagon averaged 15.1
*/
