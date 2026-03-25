package behavioral.strategy;

public class CabNavigationStrategy implements NavigationStrategy {

    @Override
    public void navigate(Point a, Point b) {
        System.out.println(" Moving from point " + a + " to point " + b + " via cab");
    }
    
}
