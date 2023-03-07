package model;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private StudentNew[] allStudents;

    // getter
    public StudentNew[] getAllStudents() {
        return allStudents;
    }

    // constructor
    public StudentDB(StudentNew[] allStudents) {
        this.allStudents = allStudents;
    }

    @Override
    public String toString() {
        String studentString = "";

        for (StudentNew student : this.getAllStudents()) {
            studentString += "Id: " + student.getId() + '\t'
                    + "Name: " + student.getName() + '\n';
        }
        return studentString;
    }

    public StudentNew randomStudent() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(getAllStudents().length);
        return getAllStudents()[randomIndex];
    }

    public StudentNew[] addStudent(StudentNew studentToAdd) {
        StudentNew[] newStudentArray = new StudentNew[allStudents.length + 1];
        int index = 0;
        for (int i = 0; i < allStudents.length; i++) {
            newStudentArray[i] = allStudents[i];
        }
        newStudentArray[newStudentArray.length - 1] = studentToAdd;
        allStudents = newStudentArray;
        return allStudents;
    }

    public StudentNew[] removeStudent(StudentNew toRemove) {
        StudentNew[] newStudentArray = new StudentNew[allStudents.length - 1];
        int index = 0;
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] != toRemove) {
                newStudentArray[index] = allStudents[i];
                index++;
            }
        }
        allStudents = newStudentArray;
        return allStudents;
    }
}
   /* int[] arr = new int[]{1,2,3,4,5};
    int[] arr_new = new int[arr.length-1];
    int j=3;
        for(int i=0, k=0;i<arr.length;i++){
        if(i!=j){
            arr_new[k]=arr[i];
            k++;
        }*/

