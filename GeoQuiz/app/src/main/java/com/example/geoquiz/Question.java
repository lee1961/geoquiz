package com.example.geoquiz;

/**
 * Created by victorlee95 on 6/14/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean isAnswered;

    public Question(int textResId, boolean answerTrue) {
        this.mAnswerTrue = answerTrue;
        this.mTextResId = textResId;
        this.isAnswered = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setAnswered() {
        this.isAnswered = true;
    }
    public boolean getisAnswered() {
        return this.isAnswered;
    }
}
