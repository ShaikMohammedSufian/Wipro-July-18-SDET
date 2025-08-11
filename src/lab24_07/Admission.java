
package lab24_07;


abstract class Student {
    String name;
    int rollNo;

    // abstract method
    abstract void Grade();
}


class EngineeringStudent extends Student {
    int marks = 85;

    void Grade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}


class MedicalStudent extends Student {
    int marks = 92;

    void Grade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}


public class Admission {
    public static void main(String[] args) {
        EngineeringStudent obj = new EngineeringStudent();
        obj.name = "Rana";
        obj.rollNo = 68;
        System.out.println("Engineering Student: " + obj.name + ", Roll No: " + obj.rollNo);
        obj.Grade();
        
        MedicalStudent obj1 = new MedicalStudent();
        obj1.name = "Prabhas";
        obj1.rollNo = 92;
        System.out.println("Medical Student: " + obj1.name + ", Roll No: " + obj1.rollNo);
        obj1.Grade();
    }
}
