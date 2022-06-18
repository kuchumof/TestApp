package testbook;

import java.util.Locale;

public class Answer {
    private String answerName;
    private boolean isRights;
    private double score;

    /**
     * @param answerName название вопроса
     * @param isRights проверка правильного ответа
     * @param score      кол-во баллов для ответа
     */
    public Answer(String answerName, boolean isRights, double score) {
        this.answerName = answerName;
        this.isRights = isRights;
        this.score = score;
    }

    public Answer(String answerName, boolean isRights) {
        this.answerName = answerName;
        this.isRights = isRights;
    }

    public String getAnswerName() {
        return answerName;
    }
    public String getAnswerNameLowerCase() {
        return answerName.toLowerCase();
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public boolean isRights() {
        return isRights;
    }

    public void setRights(boolean rights) {
        isRights = rights;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
