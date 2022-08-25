package ua.ithillel.homework_6;

public class Main {
    public static void main(String[] args) {
        Cat lisa = new Cat("Лиса");
        Dog rex = new Dog("Рекс");

        lisa.run(150);
        lisa.swim(10);
        rex.run(450);
        rex.swim(15);
    }
}
