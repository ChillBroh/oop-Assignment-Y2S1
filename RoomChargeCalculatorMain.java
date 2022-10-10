import java.util.Scanner;

public class RoomChargeCalculatorMain {
    //main method
    public static void main(String args[]) {

        String balcony, parking, tv, kitchen, wifi, garden, ac; //declare variables to store the user selection
        boolean confirmBalcony, confirmParking, confirmTv, confirmKitchen, confirmWifi, confirmGarden, confirmac;
        int charge,total_charge;
        String addService;

        Scanner val = new Scanner(System.in);
        RoomChargeCalculator cal= new RoomChargeCalculator();

        System.out.println("***Room Charge Calculator**\n");
        System.out.println("---Please Choose a room that you want to pay for----");
        System.out.println("1.Delux Double Room");
        System.out.println("2.Standard Family Room");
        System.out.println("3.Standard Single Room");
        System.out.println("4.Quit");
        System.out.print("Please Enter Number (1-4): ");
        int number = val.nextInt();

        //user chosen option check

    }
}


