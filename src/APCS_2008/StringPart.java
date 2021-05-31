package APCS_2008;

public class StringPart {
    private int start;
    private int length;

    public StringPart(int start, int length) {
        this.length = length;
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public int getStart() {
        return start;
    }
}
