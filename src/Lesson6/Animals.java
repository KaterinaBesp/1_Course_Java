package Lesson6;

import java.sql.SQLOutput;

public class Animals {
    String name;
    String type;
    private static int count;
    int maxRunDistance;
    int maxSwimDistance;


    public Animals(String name, String type, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public void run(int distance) {
        if (maxRunDistance == 0) {
            System.out.printf("%s %s can't run,\n", type, name);
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.printf("%s %s run %d\n", type, name, distance);
        } else {
            System.out.printf("%s %s didn't run %d meters\n", type, name, distance);
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.printf("%s %s can't swim\n", type, name);
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.printf("%s %s swim %d meters\n", type, name, distance);
        } else {
            System.out.printf(" %s %s didn't swim %d meters\n", type, name, distance);
        }
    }

    public static int getCount() {
        return count;
    }
}