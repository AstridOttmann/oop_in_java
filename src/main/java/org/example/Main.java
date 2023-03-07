package org.example;

import model.Student;
import model.StudentDB;
import model.StudentNew;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student javaDev = new Student(666777);

        javaDev.setFirstName("Anna");
        javaDev.setLastName("Learn");
        javaDev.setMobileNumber(98776543);

        System.out.println(javaDev.getFirstName());
        System.out.println(javaDev.getLastName());
        System.out.println(javaDev.getMobileNumber());
        System.out.println(javaDev.getRegistrationNumber());
        javaDev.setRegistrationNumber(344344);
        System.out.println(javaDev);

        Student webDev = new Student("Sara", "Muster", 12345);
        System.out.println(webDev);

        StudentNew alpha = new StudentNew("Anna Neu", 1);
        StudentNew beta = new StudentNew("Carla New", 2);
        StudentNew gamma = new StudentNew("Lisa Jung", 3);
        StudentNew delta = new StudentNew("Marie Young", 4);
        StudentNew a = new StudentNew("Hello World", 5);
        StudentNew b = new StudentNew("Hallo Welt", 6);
        StudentNew c = new StudentNew("Hello Wereld", 7);
        StudentNew d = new StudentNew("Bonjour monde", 8);

        StudentNew[] allStudents = {alpha, beta, gamma, delta};
        StudentNew[] otherStudents = {a, b, c, d};

        StudentDB studentArray1 = new StudentDB(allStudents);
        StudentDB studentArray2 = new StudentDB(otherStudents);
        System.out.println(Arrays.toString(studentArray2.getAllStudents()));
        System.out.println(Arrays.toString(studentArray1.getAllStudents()));
        System.out.println(studentArray1);
        System.out.println(studentArray2);
        System.out.println(studentArray1.randomStudent());
        System.out.println(studentArray2.randomStudent());

        StudentNew toAdd = new StudentNew("Added Student", 9);
        System.out.println(Arrays.toString(studentArray1.addStudent(toAdd)));
        System.out.println(Arrays.toString(studentArray2.addStudent(alpha)));
        System.out.println(Arrays.toString(studentArray1.removeStudent(alpha)));
        System.out.println(Arrays.toString(studentArray2.removeStudent(a)));

    }
}