package com.example.siddhant.greninjas;

/**
 * Created by user on 7/26/2016.
 */
public class FAQTask {
    String Question;
    String Answer;

    public FAQTask(String question, String answer) {
        Question = question;
        Answer = answer;
    }

    public String getQuestion() {
        return Question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
