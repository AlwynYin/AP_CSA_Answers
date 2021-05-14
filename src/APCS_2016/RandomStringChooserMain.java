package APCS_2016;

public class RandomStringChooserMain {
    public static void main(String[] args) {
        String[] arr = {"Wheels", "on", "the", "Bus"};
        RandomStringChooser st1 = new RandomStringChooser(arr);
        for (int j = 0; j < 6; j++) {
            System.out.print(st1.getNext() + " ");
        }
    }
}
