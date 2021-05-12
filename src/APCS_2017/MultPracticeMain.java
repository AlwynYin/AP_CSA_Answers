package APCS_2017;

public class MultPracticeMain {
    public static void main(String[] args) {
        StudyPractice p1 = new MultPractice(7, 3);
        for (int i = 0; i < 114514; i++) {
            System.out.println(p1.getProblem());
            p1.nextProblem();
        }
    }
}
