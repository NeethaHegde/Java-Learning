package Polymorphism;


class Learning{
    public void course(){
        System.out.println("Only Recorded Video");
    }
}

    class LearningV2 extends Learning{
        public void course(){
            super.course();
            System.out.println("also live sessions");
        }
    }

public class Overriding {
    public static void main(String[] args) {
        LearningV2 v2 = new LearningV2();
        v2.course();
    }
}