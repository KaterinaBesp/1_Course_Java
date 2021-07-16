package Lesson7_1.Lesson7;

public class Cat {
    private String name;
    private boolean satiety;
    private int appetite    ;

    public Cat(String name) {
        this.name = name;
        this.appetite = 10;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate plate) {
        if (plate.decrease(this.appetite)) {
            System.out.println(this.name + " eat...");
            this.satiety = true;
            return true;
        } else {
            System.out.println(this.name + " can't eat...");
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Cat{name='" + this.name + '\'' + ", satiety=" + this.satiety + ", appetite=" + this.appetite + '}';
    }
}
