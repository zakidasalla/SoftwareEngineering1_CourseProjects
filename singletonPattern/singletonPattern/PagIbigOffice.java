package singletonPattern;

import java.util.*;

public class PagIbigOffice {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        QueueSys queueSys = QueueSys.getInstance();
        int loop = 0;

        printHeader();

        while(loop == 0) {
            System.out.println("1: Get Queue Number");
            System.out.println("2: Desk LogIn");
            System.out.println("0: Turn Off");
            System.out.print("Select an option: ");
            int option = enter.nextInt();

            switch (option) {
                case 1:
                    queueSys.addNumberToQueue();
                    break;
                case 2:
                    System.out.print("Desk Login: ");
                    String desk = enter.next();
                    queueSys.loginDesk(desk);
                    while (queueSys.isDeskStation()) {
                        System.out.println("Desk Controls");
                        System.out.println("1: Add Number to Queue");
                        System.out.println("2: Remove Number to Queue");
                        System.out.println("3: Display Current Queue Numbers");
                        System.out.println("4: Next In Queue");
                        System.out.println("5: Clear Queue");
                        System.out.println("0: Logout");
                        System.out.print("Enter command: ");
                        int deskCommand = enter.nextInt();
                        switch(deskCommand) {
                            case 1:
                                queueSys.addNumberToQueue();
                                break;
                            case 2:
                                System.out.print("Remove Number: ");
                                int num = enter.nextInt();
                                queueSys.removeNumberFromQueue(num);
                                break;
                            case 3:
                                queueSys.displayQueue();
                                break;
                            case 4:
                                queueSys.nextInQueue();
                                break;
                            case 5:
                                queueSys.clearQueue();
                                break;
                            case 0:
                                queueSys.logoutDesk();
                                break;
                            default:
                                System.out.println("Invalid option!\n");
                                break;
                        }
                    }
                    break;
                case 0:
                    printFooter();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private static void printHeader() {
        System.out.println("[]--  Welcome to Pag-Ibig Office!  --[]");
        System.out.println("[]--  To get started, get your queue Number  --[]\n");
    }

    private static void printFooter() {
        System.out.println("\n[]---------Turning Off.---------[]");
        System.out.println("[]--by Emmanuel Zaki Dasalla--[]");
        System.out.println("[]----------3-BSCS-2----------[]");
    }
}
