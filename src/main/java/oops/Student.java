package oops;

public class Student {

    int marks;//10
    void addMarks(int marks){
        this.marks = this.marks + marks;
    }

    void addMarksRef(Student s){
        this.marks = s.marks + 100;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 50;
        s1.addMarksRef(s1);
        System.out.println(s1.marks);

    }

}
