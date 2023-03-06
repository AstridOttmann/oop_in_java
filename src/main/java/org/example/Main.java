package org.example;

public class Main {
    public static void main(String[] args) {
        Student javaDev = new Student();

        javaDev.setFirstName("Anna");
        javaDev.setLastName("Learn");
        javaDev.setMobileNumber(98776543);

        System.out.println(javaDev.getFirstName());
        System.out.println(javaDev.getLastName());
        System.out.println(javaDev.getMobileNumber());

        Student webDev = new Student();
    }
}