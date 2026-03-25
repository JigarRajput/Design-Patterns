// Jai Ganesh
package behavioral.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NavigationContext context = new NavigationContext();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Navigation Choice:");
        System.out.println("1. Cab \n2. Car\n3. Bike\n");

        int navigationChoice = scanner.nextInt();

        if(navigationChoice == 1) {
            context.setNavigationStrategy(new CabNavigationStrategy());
        }
        else if(navigationChoice == 2) {
            context.setNavigationStrategy(new CarNavigationStrategy());
        }
        else if(navigationChoice == 3) {
            context.setNavigationStrategy(new BikeNavigationStrategy());
        }
        else {
            System.out.println("Invalid choice");
        }

        scanner.close();

        context.executeNavigation(new Point(0,0), new Point(1,1));
    }
}
