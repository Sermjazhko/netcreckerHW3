package com.netcracker.chThree;

/*Implement a class Student. For the purpose of this exercise, a student has a name
        and a total quiz score. Supply an appropriate constructor and methods getName(),
        addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the average,
        you also need to store the number of quizzes that the student took.
        Supply a StudentTester class that tests all methods.*/

public class Student {
    private String name;
    private double totalScore;
    private int numberOfQuizzes;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void addQuiz(int score){
        numberOfQuizzes++;
        totalScore+=score;
    }

    public double getAverage(){
        return totalScore/numberOfQuizzes;
    }


}
