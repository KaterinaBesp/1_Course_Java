package Lesson6;

public class Dogs extends Animals {
    private static int count;

    public Dogs(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, "Dog", maxRunDistance, maxSwimDistance);
        count++;
    }

    public Dogs(String name) {
        super(name, "Dog", 500, 10);
        count++;
    }

    public static int getCount() {
        return count;
    }
}