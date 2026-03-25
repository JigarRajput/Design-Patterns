// Jai Ganesh
package behavioral.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Context holds a reference to a Strategy and delegates work to it
        NavigationContext context = new NavigationContext();

        // Read user choice to decide which strategy to use at runtime
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Navigation Choice:");
        System.out.println("1. Cab \n2. Car\n3. Bike\n");

        int navigationChoice = scanner.nextInt();

        // Choose the algorithm (strategy) based on runtime input
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
            scanner.close();
            return;
        }

        scanner.close();

        // Execute navigation using whichever strategy was selected
        context.executeNavigation(new Point(0,0), new Point(1,1));
    }
}
