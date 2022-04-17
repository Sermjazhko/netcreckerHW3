package com.netcracker.chThree;

public class StudentTester {
    public static void main(String[] args) {

        Student student = new Student("Peter Parker");

        student.addQuiz(89);
        student.addQuiz(99);
        student.addQuiz(92);
        student.addQuiz(95);

        System.out.println(student.getName()+ ", total score: " + student.getTotalScore());
        System.out.println("Avrege score "+ student.getAverage());
    }
}
