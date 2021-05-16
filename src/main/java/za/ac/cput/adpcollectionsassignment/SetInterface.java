package za.ac.cput.adpcollectionsassignment;

/**
 *  SetInterface.java
 *  Class that adds, removes and finds in a Set
 *  @author Dylan Koevort 218088159
 *
 */

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

    Student s1 = new Student(218088, "Dylan", "Koevort");
    Student s2 = new Student(219099, "Michael", "Williams");
    Student s3 = new Student(212022, "John", "Smith");
    Student s4 = new Student(214044, "John", "Smith");
    Student s5 = new Student(216066, "Chloe", "King");
    Student s6 = new Student(215055, "Sipho", "Jones");

    Set<Student> studentSet = new HashSet<>();

    public Set<Student> setInit() {
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);

        return studentSet;
    }

    public Set<Student> setAdd() {
        studentSet.add(s5);
        studentSet.add(s6);

        return studentSet;
    }

    public Set<Student> setRemove() {
        studentSet.remove(s1);

        return studentSet;
    }

    public boolean setFind() {
        return studentSet.contains(s1);
    }

}
