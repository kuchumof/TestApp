package testbook;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Answer> answers;

    public Question(String question, ArrayList<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestionName() {
        String result = question + "\n";
        for (int i = 0; i < answers.size(); i++) {
            result += i + 1 + ") " + answers.get(i).getAnswerName() + "\n";
        }
        return result;
    }
}
