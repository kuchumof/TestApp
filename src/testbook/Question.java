package testbook;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> answers;
    private int trueAnswer;

    public Question(String question, ArrayList<String> answers, int trueAnswer) {
        this.question = question;
        this.answers = answers;
        this.trueAnswer = trueAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public String getQuestionName() {
        String result = question + "\n";
        for (int i = 0; i < answers.size(); i++) {
            result += i+1+") "+answers.get(i)+ "\n";
        }
        return result;
    }
}
