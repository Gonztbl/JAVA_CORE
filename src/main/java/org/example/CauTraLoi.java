package org.example;

public class CauTraLoi {
    private int answerID;
    private String content;
    private int questionID;
    private Iscorrect isCorrect;

    public CauTraLoi(int answerID, String content, int questionID, Iscorrect isCorrect) {
        this.answerID = answerID;
        this.content = content;
        this.questionID = questionID;
        this.isCorrect = isCorrect;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public Iscorrect getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Iscorrect isCorrect) {
        this.isCorrect = isCorrect;
    }

    @Override
    public String toString() {
        return "CauTraLoi{" +
                "answerID=" + answerID +
                ", content='" + content + '\'' +
                ", questionID=" + questionID +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
