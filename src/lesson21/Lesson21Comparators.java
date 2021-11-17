package lesson21;

import java.util.*;

public class Lesson21Comparators {

    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();

        Student student1 = new Student(1, "AAA");
        Student student2 = new Student(2, "ZZZ");
        Student student3 = new Student(3, "ASD");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);

    }

}

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // compare students by their second character in their name
    @Override
    public int compareTo(Student student) {

        // if second character is "larger"
        if (student.name.charAt(1) < this.name.charAt(1)) {
            return 1;
            // if second character is "smaller"
        } else if (student.name.charAt(1) > this.name.charAt(1)) {
            return -1;
            // if they're equal
        } else {
            return 0;
        }
    }



}
