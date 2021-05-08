package za.ac.cput.adpcollectionsassignment;

import java.util.Objects;

/**
 *
 * Small POJO that stores data of student.
 * @author Dylan Koevort 218088159
 *
 */

public class Student {

    private int studNumber;
    private String firstName, lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studNumber == student.studNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studNumber);
    }

    public Student(int studNumber, String firstName, String lastName) {
        this.studNumber = studNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudNumber() {
        return studNumber;
    }

    public void setStudNumber(int studNumber) {
        this.studNumber = studNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNumber=" + studNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
