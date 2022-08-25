package ua.ithillel.homework_6;

public class Animal {
    public static int ANIMAL_COUNT = 0;

    String name;

    public Animal(String name) {
        this.name = name;
        ANIMAL_COUNT++;
    }

    void run(int obstacleLength) {
            System.out.println(name + " пробежал(а) " + obstacleLength + "м.");
    }

    void swim(int obstacleLength) {
         System.out.println(name + " проплыл(а) " + obstacleLength + "м.");
    }
}
