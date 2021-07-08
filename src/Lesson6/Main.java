package Lesson6;

public class Main {
    public static void main(String[] args) {
        Animals[] animals= {
                new Cats("Myrka",200,20),
                new Cats("Semka",180,20),
                new Cats("Snejok",0,10),
                new Dogs("Bobik",500,10),
                new Dogs("Reks",400,5),
                new Dogs("Laika",0,0)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(20);
            animals[i].swim(4);
        }

        System.out.println(Animals.getCount());
        System.out.println(Cats.getCount());
        System.out.println(Dogs.getCount());
    }
}
