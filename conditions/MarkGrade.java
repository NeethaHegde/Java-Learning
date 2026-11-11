package conditions;

public class MarkGrade{
    public static void main(String[] args) {
    String grade="A+";
    int marks = 90;
   
    if(marks >= 90){
       grade = "A+";
    }
    else if(marks>=80 && marks<90){
        grade = "A";
    }
    else if(marks>=70 && marks<80){
       grade = "B+";
    }
    else if(marks>=35 && marks<70){
        grade = "B";
    }
    else{
        System.out.println("Fail");
    }

    System.out.println(grade);
}

}
