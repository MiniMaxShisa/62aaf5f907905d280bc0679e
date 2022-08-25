package ua.ithillel.homework_6;

public class Cat extends Animal {
    public static int CAT_COUNT = 0;

    public Cat(String name) {
        super(name);
        CAT_COUNT++;
    }

    @Override
    void run(int obstacleLength) {
        int runRestriction = 200;
        if (obstacleLength > runRestriction) {
            System.out.println(name + " может пробежать только " + runRestriction + "м.");
        } else {
            super.run(obstacleLength);
        }
    }

    @Override
    void swim(int obstacleLength) {
        System.out.println("Коты не умеют плавать.");
    }
}
