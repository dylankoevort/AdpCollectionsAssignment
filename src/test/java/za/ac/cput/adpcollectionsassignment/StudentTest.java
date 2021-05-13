package za.ac.cput.adpcollectionsassignment;

/**
 *
 *  IGNORE THIS FILE FOR ADP ASSIGNMENT
 *
 *
 *  Tests the Java Collections interface, List interface, Set interface and Map interface using JUnit 5.
 *  @author Dylan Koevort 218088159
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    Student s1 = new Student(218088, "Dylan", "Koevort");
    Student s2 = new Student(219099, "Michael", "Williams");
    Student s3 = new Student(212022, "John", "Smith");
    Student s4 = new Student(214044, "John", "Smith");
    Student s5 = new Student(216066, "Chloe", "King");
    Student s6 = new Student(215055, "Sipho", "Jones");

    //========================= COLLECTION TEST ================================================
    Collection<Student> studentCollection = new HashSet<>();

    @BeforeEach
    void collectionSetUp(){
        studentCollection.add(s1);
        studentCollection.add(s2);
        studentCollection.add(s3);
        studentCollection.add(s4);
    }

    @AfterEach
    void collectionClear(){
        studentCollection.clear();
    }

    @Test
    void testCollectionAdd() {
        studentCollection.add(s5);
        studentCollection.add(s6);

        assertEquals(6, studentCollection.size());
    }

    @Test
    void testCollectionRemove() {
        studentCollection.remove(s1);

        assertEquals(3, studentCollection.size());
    }

    @Test
    void testCollectionFind() {
    }

    //========================= MAP TEST =======================================================
    Map<Integer, Student> studentMap = new HashMap<>();

    @BeforeEach
    void mapSetUp(){
        studentMap.put(s1.getStudNumber(), s1);
        studentMap.put(s2.getStudNumber(), s2);
        studentMap.put(s3.getStudNumber(), s3);
        studentMap.put(s4.getStudNumber(), s4);
    }

    @AfterEach
    void mapClear(){
        studentMap.clear();
    }

    //Test Map Add
    @Test
    void testMapAdd() {
        studentMap.put(s5.getStudNumber(), s5);
        studentMap.put(s6.getStudNumber(), s6);

        assertEquals(6, studentMap.size());
    }

    //Test Map Remove
    @Test
    void testMapRemove(){
        studentMap.remove(219099);

        assertEquals(3, studentMap.size());
    }

    //========================= SET TEST =======================================================
    Set<Student> studentSet = new HashSet<>();

    @BeforeEach
    void setSetUp(){
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
    }

    @AfterEach
    void setClear(){
        studentSet.clear();
    }

    //Test Set Add
    @Test
    void testSetAdd() {
        studentSet.add(s5);
        studentSet.add(s6);

        assertEquals(6, studentSet.size());
    }

    //Test Set Remove
    @Test
    void testSetRemove(){
        studentSet.remove(s1);

        assertEquals(3, studentSet.size());
    }

    //========================= LIST TEST ======================================================
    List<Student> studentList = new ArrayList<>();

    @BeforeEach
    void listSetUp(){
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
    }

    @AfterEach
    void listClear(){
        studentList.clear();
    }

    //Test List Add
    @Test
    void testListAdd() {
        studentList.add(s5);
        studentList.add(s6);

        assertEquals(6, studentList.size());
    }

    //Test List Remove by Object
    @Test
    void testListObjectRemove() {
        studentList.remove(s1);

        assertEquals(3, studentList.size());
    }

    //Test Remove by Index
    @Test
    void testListIndexRemove() {
        studentList.remove(1);

        assertEquals(3, studentList.size());
    }

}