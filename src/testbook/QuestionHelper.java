package testbook;

import java.util.ArrayList;
import java.util.Locale;

public class QuestionHelper {
    public static ArrayList<Question> createQuestions() {
        ArrayList<Answer> qv1 = new ArrayList<>();
        qv1.add(new Answer("1", false));
        qv1.add(new Answer("2", false));
        qv1.add(new Answer("4", true, 10));
        qv1.add(new Answer("8", false));

        ArrayList<Answer> qv2 = new ArrayList<>();
        qv2.add(new Answer("Пермь", false));
        qv2.add(new Answer("Екатеринбург", false));
        qv2.add(new Answer("Москва", true, 10));
        qv2.add(new Answer("Санкт-Петербург", false));

        Question q1 = new Question("Сколько будет 2х2 ? ", qv1);
        Question q2 = new Question("Столица России ? ", qv2);

        ArrayList<Question> result = new ArrayList<>();
        result.add(q1);
        result.add(q2);
        return result;
    }

    public static double getScore(String answer, Question question) {
        Answer answerValue;
        double score = 0;
        for (int i = 0; i < question.getAnswers().size(); i++) {
            answerValue = question.getAnswers().get(i);
            if (answer.trim().toLowerCase().equals(answerValue.getAnswerNameLowerCase())
                    && answerValue.isRights()) {
                score += answerValue.getScore();
            }
        }
        return score;
    }

}
