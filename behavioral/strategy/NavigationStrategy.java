package behavioral.strategy;

// Strategy interface: defines a common contract for all navigation algorithms
public interface NavigationStrategy {
    // Each concrete strategy provides its own implementation
    void navigate(Point a, Point b);
}
