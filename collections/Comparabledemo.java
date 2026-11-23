package collections;

// import java.util.ArrayList;

import java.util.*;

class Student implements Comparable<Student>{

    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks){
        super();
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    // @Override
    // public int compareTo(Student o){
    //     return this.marks-o.marks;
    // }

    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }


    @Override
    public String toString(){
        return "Student [id = "+ id +", name "+ name +", marks "+ marks +"]";
    }
}


public class Comparabledemo {
    public static void main(String [] args){
        ArrayList<Student> s = new ArrayList<Student>();
        s.add(new Student(102, "Ravi", 45));
        s.add(new Student(103, "Kishan", 90));
        s.add(new Student(105, "Kavitha", 56));
        s.add(new Student(104, "Priya", 34));
        
        Collections.sort(s);
        System.out.println("after sorting by marks: ");
        for(Student g:s){
            System.out.println(g);
        }
    }
    
}
