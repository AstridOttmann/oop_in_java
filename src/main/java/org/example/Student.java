package org.example;

public class Student {
    private String firstName;
    private String lastName;
    private int mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }
    public void setFirstName(String newFirst){
        firstName = newFirst;
    }
    public void setLastName(String newLast){
        lastName = newLast;
    }
    public void setMobileNumber(int newNum){
        mobileNumber = newNum;
    }
}
