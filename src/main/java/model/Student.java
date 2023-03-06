package model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int mobileNumber;
    private int registrationNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setFirstName(String newFirst) {
        firstName = newFirst;
    }

    public void setLastName(String newLast) {
        lastName = newLast;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Student() {
    }

    public Student(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Student(String firstName, String lastName, int registrationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumber = registrationNumber;
    }

    /*public String toString() {
        return ("Name " + firstName + " " + lastName + ",\n" + mobileNumber + " " + registrationNumber);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mobileNumber == student.mobileNumber && registrationNumber == student.registrationNumber && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, mobileNumber, registrationNumber);
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", registrationNumber=" + registrationNumber +
                '}';
    }

    public static boolean compareStudents(Student s1, Student s2) {
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }
}
