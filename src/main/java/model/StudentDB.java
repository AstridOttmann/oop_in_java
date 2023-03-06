package model;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private StudentNew[] allStudents;

    public StudentNew[] getAllStudents() {
        return allStudents;
    }

    public StudentDB(StudentNew[] allStudents) {
        this.allStudents = allStudents;
    }

    @Override
    public String toString() {
        String studentString = "";

        for (StudentNew student: this.getAllStudents()) {
            studentString += "Id: " + student.getId() + '\t'
                    + "Name: " + student.getName() + '\n';
        }
        return studentString;
    }

    public StudentNew randomStudent(){
        Random generator = new Random();
        int randomIndex = generator.nextInt(getAllStudents().length);
        return getAllStudents()[randomIndex];
    }
}
