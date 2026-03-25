package behavioral.strategy;

public class NavigationContext {
    NavigationStrategy strategy;

    public NavigationContext(NavigationStrategy strategy) {}
    public NavigationContext() {}

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.strategy = navigationStrategy;
    }

    public void executeNavigation(Point a, Point b) {
        strategy.navigate(a, b);
    }
}
