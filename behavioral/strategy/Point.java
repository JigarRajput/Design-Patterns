package behavioral.strategy;

// Simple value object representing a coordinate on a 2D plane
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Useful for readable printing in logs/console
    @Override
    public String toString() {
        return "[ x: "+x +" y: "+y + " ]";
    }
}
