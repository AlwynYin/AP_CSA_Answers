package APCS_2017;

public class MultPractice implements StudyPractice{
    private int firstNum;
    private int secondNum;
    public MultPractice(int a, int b) {
        firstNum = a; secondNum = b;
    }

    @Override
    public String getProblem() {
        return firstNum + " TIMES " + secondNum;
    }

    @Override
    public void nextProblem() {
        secondNum += 1;
    }
}
