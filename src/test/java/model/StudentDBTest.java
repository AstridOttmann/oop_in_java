package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void returnsArrayWithAllStudents() {
        StudentNew a = new StudentNew("Hello World", 5);
        StudentNew b = new StudentNew("Hallo Welt", 6);
        StudentNew c = new StudentNew("Hello Wereld", 7);
        StudentNew d = new StudentNew("Bonjour monde", 8);
        StudentNew[] testStudents = {
                a, b, c, d
        };
        StudentDB studentDB = new StudentDB(testStudents);
        StudentNew[] actual = studentDB.getAllStudents();

        assertArrayEquals(testStudents, actual);
    }

    @Test
    void addStudent() {
        StudentNew a = new StudentNew("Hello World", 5);
        StudentNew b = new StudentNew("Hallo Welt", 6);
        StudentNew toAdd = new StudentNew("Hey du", 10);
        StudentNew[] studentArray = {a, b};
        StudentDB studentDB = new StudentDB(studentArray);

        studentDB.addStudent(toAdd);
        StudentNew[] expected = {a, b, toAdd};
        assertArrayEquals(expected, studentDB.getAllStudents());
    }

    @Test
    void removeStudent(){
        StudentNew a = new StudentNew("Hello World", 5);
        StudentNew b = new StudentNew("Hallo Welt", 6);

        StudentNew[] studentArray = {a, b};
        StudentDB studentDB = new StudentDB(studentArray);
        studentDB.removeStudent(b);
        StudentNew[] expected = {a};
        assertArrayEquals(expected, studentDB.getAllStudents());
    }
}