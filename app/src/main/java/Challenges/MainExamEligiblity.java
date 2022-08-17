package Challenges;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainExamEligiblity {
    public static void main(String[] args) {
        Comparator<Student> stud = (s1,s2)-> {
            return s1.getMarks().compareTo(s2.getMarks()) ;
        };


        TreeSet<Student> studentSet = new TreeSet<>(stud);
        studentSet.add(new Student("Akash",89));
        studentSet.add(new Student("Shadab",67));
        studentSet.add(new Student("Kishan",88));
        studentSet.add(new Student("AkashK",66));
        studentSet.add(new Student("Gullu",98));
        studentSet.add(new Student("Jeet",34));

       // SortedSet<Student> s = studentSet.tailSet(new Student(35));

        studentSet.forEach(i -> {
            if(i.getMarks()>35)
                System.out.println(i.getName());
        });


    }



}

class Student{
    private String name;
    private Integer marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(Integer marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
