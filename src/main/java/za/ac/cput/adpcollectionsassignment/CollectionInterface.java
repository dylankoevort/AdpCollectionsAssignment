package za.ac.cput.adpcollectionsassignment;

/**
 *  CollectionInterface.java
 *  Class that adds, removes and finds in a Collection HashSet
 *  @author Dylan Koevort 218088159
 *
 */

import java.util.Collection;
import java.util.HashSet;

public class CollectionInterface {

    Student s1 = new Student(218088, "Dylan", "Koevort");
    Student s2 = new Student(219099, "Michael", "Williams");
    Student s3 = new Student(212022, "John", "Smith");
    Student s4 = new Student(214044, "John", "Smith");
    Student s5 = new Student(216066, "Chloe", "King");
    Student s6 = new Student(215055, "Sipho", "Jones");

    Collection<Student> studentCollection = new HashSet<>();

    public Collection<Student> collectionInit() {
        studentCollection.add(s1);
        studentCollection.add(s2);
        studentCollection.add(s3);
        studentCollection.add(s4);

        return studentCollection;
    }

    public Collection<Student> collectionAdd() {
        studentCollection.add(s5);
        studentCollection.add(s6);

        return studentCollection;
    }

    public Collection<Student> collectionRemove() {
        studentCollection.remove(s1);

        return studentCollection;
    }
}
