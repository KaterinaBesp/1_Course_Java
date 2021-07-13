package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return this.food;
    }

    public boolean addFood(int amount) {
        if (amount < 0) {
            return false;
        } else {
            this.food += amount;
            return true;
        }
    }

    public boolean decrease(int amount) {
        if (amount >= 0 && amount <= this.food) {
            this.food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Plate{food=" + this.food + '}';
    }
}
