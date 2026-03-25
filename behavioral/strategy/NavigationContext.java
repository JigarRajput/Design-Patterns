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

    // Why Context is useful (typical real-world reasons)
    // Centralizes how the algorithm is used
    // If navigation requires common steps (validation, logging, metrics, timing, caching, error handling), context is the single place to keep that:
        // public void executeNavigation(Point a, Point b) {
        //     validate(a, b);
        //     strategy.navigate(a, b);
        //     audit(a, b);
        // }
    // or every caller would need to do these extra things wherever navigation strategy is used
}
