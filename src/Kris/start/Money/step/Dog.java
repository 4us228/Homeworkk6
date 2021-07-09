package Kris.start.Money.step;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run(int x) {
        if (x <= 500 && x > 0) {
            System.out.println(name + " пробежал " + x + " метров");
        } else {
            System.out.println(name + " не может пробежать больше " + 500 + " метров ");
        }
    }

    public void swim(int s) {
        if (s <= 10 && s > 0) {
            System.out.println(name + " проплыл " + s + " метров ");
        } else {
            System.out.println(name + " не может проплыть больше " + 10 + " метров ");
        }
    }


}
