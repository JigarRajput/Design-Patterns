package behavioral.strategy;

public class NavigationContext {
    // The currently selected strategy (algorithm).
    // Context delegates the navigation behavior to this object.
    NavigationStrategy strategy;

    public NavigationContext(NavigationStrategy strategy) {}
    public NavigationContext() {}

    // Allows changing the algorithm at runtime
    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.strategy = navigationStrategy;
    }

    // Delegates the navigation work to the chosen strategy
    public void executeNavigation(Point a, Point b) {
        strategy.navigate(a, b);
    }
}
