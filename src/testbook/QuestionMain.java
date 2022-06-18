package testbook;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionMain {
    public static void main(String[] args) {
        int count = 0;
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList <Question> questions = QuestionHelper.createQuestions();
        for (int i = 0; i<questions.size(); i++) {

            System.out.println(questions.get(i).getQuestionName());
            System.out.println("¬ведите вариант ответа: ");
            value = scanner.nextInt();
            if (QuestionHelper.checkQuestion(value, questions.get(i))) {
                count++;
            }

        }
        System.out.println();
        System.out.println(count);
    }
}
