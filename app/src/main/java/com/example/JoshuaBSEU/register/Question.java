package com.example.JoshuaBSEU.register;

public class Question {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int answer_number; //store the correct value in form of an array value (0, 1, 2, 3)

    public Question(){} //empty constructor to pull values from database

    public Question(String question, String option1, String option2, String option3, String option4, int answer_number) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer_number = answer_number;
    } // closing public question = Auto-Generated Constructer to Parse Variables

    // ##### Auto-Generated Getter and Setter in order to get values from database and display them
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnswer_number() {
        return answer_number;
    }

    public void setAnswer_number(int answer_number) {
        this.answer_number = answer_number;
    }
    // end of Auto-Generated Getter and Setter

} //close public class Question
