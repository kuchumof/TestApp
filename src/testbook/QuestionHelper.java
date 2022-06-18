package testbook;

import java.util.ArrayList;

public class QuestionHelper {
    public static ArrayList<Question> createQuestions() {
        ArrayList<String> qv1 = new ArrayList<>();
        qv1.add("1");
        qv1.add("2");
        qv1.add("4");
        qv1.add("7");
        ArrayList<String> qv2 = new ArrayList<>();
        qv2.add("Пермь");
        qv2.add("Москва");
        qv2.add("Томск");
        qv2.add("Санкт-Петербург");
        Question q1 = new Question("Сколько будет 2х2 ? ", qv1, 2);
        Question q2 = new Question("Столица России ? ", qv2, 1);

        ArrayList<Question> result = new ArrayList<>();
        result.add(q1);
        result.add(q2);

        return result;
    }

    public static boolean checkQuestion(int answerNumber, Question question) {
        return answerNumber-1 == question.getTrueAnswer();

    }
}
