package Kris.start.Money.step;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public void run(int x) {
        if (x <= 200 && x > 0) {
            System.out.println(name + " пробежал " + x + " метров");
        } else {
            System.out.println(name + " не может пробежать больше " + 200 + " метров ");
        }
    }

    public void swim(int s) {
        System.out.println(name + " не умеет плавать ");

    }


}
