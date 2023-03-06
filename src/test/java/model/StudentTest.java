package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StudentTest {

    @Test
    void compareClass1ToClass2ReturnsTrue() {
        Student class1 = new Student(2233);
        Student class2 = new Student(2233);

       // boolean actual = Student.compareStudents(class1, class2);
       // assertEquals(true, actual);
        assertEquals(class1, class2);
    }
    @Test
    void compareClass1ToClass2ReturnsFalse() {
        Student class1 = new Student();
        class1.setFirstName("Anna");
        Student class2 = new Student();

       // boolean actual = Student.compareStudents(class1, class2);
        //assertEquals(false, actual);
        assertNotEquals(class1, class2);
    }

}
