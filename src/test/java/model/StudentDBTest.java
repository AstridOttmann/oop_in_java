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
        StudentNew[] testStudents ={
            a, b, c, d
        } ;
        StudentDB studentDB = new StudentDB(testStudents);
        StudentNew[] actual = studentDB.getAllStudents();

        assertArrayEquals(testStudents, actual);
    }

}