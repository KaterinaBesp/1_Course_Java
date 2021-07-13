package Lesson7;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat("Myrka", 20), new Cat("Semka", 30), new Cat("Snejok", 15), new Cat("Marsik", 5), new Cat("Barsik")};
        Plate plate = new Plate(30);

        int i;
        for(i = 0; i < cats.length; ++i) {
            if (!cats[i].eat(plate)) {
                plate.addFood(20);
                cats[i].eat(plate);
            }
        }

        for(i = 0; i < cats.length; ++i) {
            System.out.println(cats[i]);
        }

    }

    public static void printNum(int x) {
        System.out.println(x);
    }

    public static void printNumInteger(Integer x) {
        System.out.println(x);
    }
}
