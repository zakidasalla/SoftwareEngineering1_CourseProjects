package facadePattern;

import commandPattern.*;

import java.util.Scanner;

public class HotelApp {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        FrontDesk frontDesk = new FrontDesk();

        printHeader();
        while(true){
            System.out.println("Select a service: ");
            System.out.println("1: Valet Service.");
            System.out.println("2: Housekeeping Service.");
            System.out.println("3: Request Luggage Cart(s).");
            System.out.println("4: Exit");
            System.out.print("Enter your preferred Service: ");
            int userChoice = sc.nextInt();
            if(userChoice==4){
                printFooter();
                break;
            }
            switch(userChoice){
                case 1:
                    System.out.println("\nWelcome to our Valet Service\n");
                    System.out.print("Enter the Plate Number of your vehicle: ");
                    sc.nextLine();
                    String plateNumber = sc.nextLine();
                    HotelService valet = new Valet(plateNumber);
                    frontDesk.service(valet);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nWelcome to our Housekeeping Service\n");
                    System.out.print("Enter your Room Number: ");
                    sc.nextLine();
                    String roomNumber = sc.nextLine();
                    System.out.println();
                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    frontDesk.service(houseKeeping);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nWelcome to our Luggage Cart Service\n");
                    System.out.print("Enter the number of cart(s): ");
                    sc.nextLine();
                    int numberOfCarts = sc.nextInt();
                    System.out.println();
                    HotelService cart = new Cart(numberOfCarts);
                    frontDesk.service(cart);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Choice. Please enter [1-4]");
            }
        }
    }

    private static void printHeader() {
        System.out.println("[]------------  Welcome to EZHotel's HaManS  -----------[]");
        System.out.println("[]--  The Hotel's Management App for all your needs!  --[]");
    }

    private static void printFooter() {
        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--by Emmanuel Zaki Dasalla--[]");
        System.out.println("[]----------3-BSCS-2----------[]");
    }
}
