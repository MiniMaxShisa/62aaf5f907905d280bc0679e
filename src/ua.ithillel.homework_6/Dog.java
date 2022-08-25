package ua.ithillel.homework_6;

public class Dog extends Animal {
    public static int DOG_COUNT = 0;

    public Dog(String name) {
        super(name);
        DOG_COUNT++;
    }

    @Override
    void run(int obstacleLength) {
        int runRestriction = 500;
        if (obstacleLength > runRestriction) {
            System.out.println(name + " может пробежать только " + runRestriction + "м.");
        } else {
            super.run(obstacleLength);
        }
    }

    @Override
    void swim(int obstacleLength) {
        int swimRestriction = 10;
        if (obstacleLength > swimRestriction) {
            System.out.println(name + " может проплыть только " + swimRestriction + "м.");
        } else {
            super.swim(obstacleLength);
        }
    }
}
