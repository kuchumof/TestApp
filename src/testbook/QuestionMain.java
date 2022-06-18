package testbook;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionMain {
    public static void main(String[] args) {
        String answerValue;
        double score = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questions = QuestionHelper.createQuestions();
        for (int i = 0; i < questions.size(); i++) {

            System.out.println(questions.get(i).getQuestionName());
            System.out.println("¬ведите вариант ответа: ");
            answerValue = scanner.nextLine();
            score += QuestionHelper.getScore(answerValue, questions.get(i));

        }
        System.out.println();
        System.out.println(score);

    }
}
