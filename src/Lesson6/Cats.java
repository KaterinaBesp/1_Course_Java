package Lesson6;

public class Cats extends Animals {
    private static int count;
    private  boolean wellFed;

    public Cats(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, "Cat", maxRunDistance, maxSwimDistance);
        count++;
    }

    public Cats(String name) {
        super(name, "Cat", 200, 0);
        count++;
    }
    public static int getCount() {
        return count;
    }
}