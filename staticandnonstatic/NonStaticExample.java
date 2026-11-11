package staticandnonstatic;

class Student{
    int id = 1;
    String name = "Neetha";
    int marks = 95 ;
    String sub = "Mathematics";
    static String clgname = "AIT";
    void showStudentDetails(){
        System.out.println("Student_Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Subject: "+sub);
    }
    static void showClgname(){
        System.out.println("College: "+clgname);
    }
}


public class NonStaticExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.showStudentDetails();
        Student.showClgname();

        System.out.println();

        Student s1 = new Student();
        s1.id = 2;
        s1.marks=90;
        s1.showStudentDetails();
        Student.clgname = "TNS";
        Student.showClgname();

        System.out.println();

        Student s3 = new Student();
        s3.showStudentDetails();
        Student.showClgname();
    }
}

