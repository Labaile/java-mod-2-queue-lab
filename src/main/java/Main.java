import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        while(true) {
            System.out.println("\nWould you like to check someone in or check someone out?");
            System.out.println("Select 1 for check in");
            System.out.println("Select 2 for check out");
            System.out.println("Select 3 to view restaurant details");
            System.out.print("Option: ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                if (restaurant.tableIsAvailable()) {
                    System.out.print("Enter name for reservation: ");
                    String name = scanner.nextLine();
                    restaurant.checkIn(name);
                } else {
                    System.out.print("Enter name for reservation: ");
                    String name = scanner.nextLine();
                    restaurant.addToWaitList(name);
                }
            } else if (input.equals("2")) {
                System.out.print("Enter name to check out: ");
                String name = scanner.nextLine();
                restaurant.checkOut(name);
            } else if (input.equals("3")) {
                System.out.println(restaurant);
            }
        }
    }
}
