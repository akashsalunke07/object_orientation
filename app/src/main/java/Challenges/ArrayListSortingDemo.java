
// Challenge 1  :   Find all students above 8 years and print their names
//challenge 2 : find all students in class 6
//challenge 3 : sort student by age,name,class


package Challenges;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class ArrayListSortingDemo {

    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        System.out.println(students);



        ArrayListSortingDemo a1 = new ArrayListSortingDemo();



        //_______________________________Student's name who are above 8_______________________________
        System.out.println("\n\nStudent's name who are above 8");
        a1.studentsAbove8(students).forEach(i -> System.out.println(i.name));

        //_______________________________Students In Class 6_______________________________
        System.out.println("\n\nStudents In Class 6");
        a1.studentsInClass6(students).forEach(i -> System.out.println(i));

      //  students.forEach(System.out::println);


        //_______________________________Sorted by Name_______________________________
        System.out.println(a1.sortByName(students));

        //_______________________________Sorted by Age_______________________________
        System.out.println(a1.sortByAge(students));

       //_______________________________Sorted by Class_______________________________
        System.out.println(a1.sortByClass(students));


    }



    //_____________________Students Above 8 years will be return by this method________________
    public List<Student> studentsAbove8(List<Student> students){
        List<Student> aboveEight = new ArrayList<>();
        for (int i=0;i< students.size();i++) {
            if(students.get(i).age>8)
                aboveEight.add(students.get(i));
        }
        return aboveEight;
    }


    //______________Students In Class 6 will be return by this method____________
    public List<Student> studentsInClass6(List<Student> students){
        List<Student> inClass6 = new ArrayList<>();
        for (int i=0;i< students.size();i++) {
            if(students.get(i).classNo == 6)
                inClass6.add(students.get(i));
        }
        return inClass6;
    }



    //_______________________________Sorted by Name_______________________________
    public List<Student> sortByName(List<Student> students){
        System.out.println("\n\n\n_______________________________Sorted by Name_______________________________\n");
        //Sort By name
         Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
         return students;
    }



    //_______________________________Sorted by Age_______________________________
    public List<Student> sortByAge(List<Student> students){
        System.out.println("\n\n\n_______________________________Sorted by Age_______________________________\n");
        //Sort By Age
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Integer e1 = o1.age;
                Integer e2 = o2.age;

                return e1.compareTo(e2);
            }
        });
        return students;
    }


    //_______________________________Sorted by Class_______________________________
    public List<Student> sortByClass(List<Student> students){
        System.out.println("\n\n\n_______________________________Sorted by Class_______________________________\n");
        //Sort By Class
        Collections.sort(students,(o1,o2) -> {
            Integer c1 = o1.classNo;
            Integer c2 = o2.classNo;

            return c1.compareTo(c2);
        });
        return students;
    }









    private static class Student{
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}';
        }
    }
}
