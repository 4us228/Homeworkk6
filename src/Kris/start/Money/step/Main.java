package Kris.start.Money.step;

public class Main {

    public static void main(String[] args) {
        int y = 190; //количество метров бега
        int g = 7; //количество метров плавания
        Cat cat = new Cat("Snezok", "White", 2);
        cat.run(y);
        cat.swim(g);

        Dog dog = new Dog("White Beam ", "white-black", 5);
        dog.run(y);
        dog.swim(g);
    }
}

