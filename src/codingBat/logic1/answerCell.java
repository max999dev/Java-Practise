package codingBat.logic1;

public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        return !isMorning && !isMom && !isAsleep || isMorning && isMom && !isAsleep || !isMorning && isMom && !isAsleep;
    }
}
