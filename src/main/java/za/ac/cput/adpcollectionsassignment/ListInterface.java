package za.ac.cput.adpcollectionsassignment;

/**
 *  ListInterface.java
 *  Class that adds, removes and finds in a List
 *  @author Dylan Koevort 218088159
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    Student s1 = new Student(218088, "Dylan", "Koevort");
    Student s2 = new Student(219099, "Michael", "Williams");
    Student s3 = new Student(212022, "John", "Smith");
    Student s4 = new Student(214044, "John", "Smith");
    Student s5 = new Student(216066, "Chloe", "King");
    Student s6 = new Student(215055, "Sipho", "Jones");

    List<Student> studentList = new ArrayList<>();

    public List<Student> listInit() {
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        return studentList;
    }

    public List<Student> listAdd() {
        studentList.add(s5);
        studentList.add(s6);

        return studentList;
    }

    public List<Student> listRemove() {
        studentList.remove(s2);

        return studentList;
    }

    public boolean listFind(){
        return studentList.contains(s1);
    }
}
