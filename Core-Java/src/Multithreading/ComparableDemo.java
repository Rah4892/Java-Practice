package Multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    private int studentId;
    private String studentName;
    private List<String> subjects;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Student(int studentId, String studentName, List<String> subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId - o.studentId;
        //return this.studentName - o.studentName; Gives error
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student obj1 = new Student(1, "Rahul" , Arrays.asList("Maths", "Science"));
        Student obj2 = new Student(15, "Abraham" , Arrays.asList("Geography", "Physics"));
        Student obj3 = new Student(10, "Sean" , Arrays.asList("Zoology", "Crypto"));
        studentList.add(obj1);
        studentList.add(obj2);
        studentList.add(obj3);

        Collections.sort(studentList);
        for(Student student: studentList) {
            System.out.println(student.getStudentId());
            System.out.println(student.getStudentName());
            System.out.println(student.getSubjects());
        }
    }
}
