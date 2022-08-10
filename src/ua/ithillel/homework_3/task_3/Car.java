package ua.ithillel.homework_3.task_3;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("startElectricity");
    }

    private void startCommand() {
        System.out.println("startCommand");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
