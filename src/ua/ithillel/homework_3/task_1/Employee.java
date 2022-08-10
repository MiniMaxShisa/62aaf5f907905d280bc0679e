package ua.ithillel.homework_3.task_1;

public class Employee {
    private String fullName;
    private String job;
    private String email;
    private long phoneNumber;
    private int age;

    public Employee(String fullName, String job, String email, long phoneNumber, int age) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                '}';
    }
}
