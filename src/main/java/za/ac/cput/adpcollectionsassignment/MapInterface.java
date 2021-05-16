package za.ac.cput.adpcollectionsassignment;

/**
 *  MapInterface.java
 *  Class that adds, removes and find in a Map
 *  @author Dylan Koevort 218088159
 *
 */

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

    Student s1 = new Student(218088, "Dylan", "Koevort");
    Student s2 = new Student(219099, "Michael", "Williams");
    Student s3 = new Student(212022, "John", "Smith");
    Student s4 = new Student(214044, "John", "Smith");
    Student s5 = new Student(216066, "Chloe", "King");
    Student s6 = new Student(215055, "Sipho", "Jones");

    Map<Integer, Student> studentMap = new HashMap<>();

    public Map<Integer, Student> mapInit() {
        studentMap.put(s1.getStudNumber(), s1);
        studentMap.put(s2.getStudNumber(), s2);
        studentMap.put(s3.getStudNumber(), s3);
        studentMap.put(s4.getStudNumber(), s4);

        return studentMap;
    }

    public Map<Integer, Student> mapAdd() {
        studentMap.put(s5.getStudNumber(), s5);
        studentMap.put(s6.getStudNumber(), s6);

        return studentMap;
    }
    public Map<Integer, Student> mapRemove() {
        studentMap.remove(219099);

        return studentMap;
    }

    public boolean mapFind() {
        return studentMap.containsValue(s1);
    }

}
