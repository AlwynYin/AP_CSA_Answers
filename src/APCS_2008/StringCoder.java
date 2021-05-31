package APCS_2008;

import java.util.ArrayList;

public class StringCoder {
    private String masterString;
    // I still haven't figure out a way to write fintPart, so this is not checked.
    public StringCoder(String master) {
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts) {
        String decoded = "";
        for (StringPart part: parts) {
            decoded += masterString.substring(part.getStart(), part.getStart()+part.getLength());
        }
        return decoded;
    }

    private StringPart findPart(String str) {

        return new StringPart(0, 0);
    }

    public ArrayList<StringPart> encodeString(String word) {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        while (word.length() > 0) {
            StringPart part = findPart(word);
            parts.add(part);
            word = word.substring(part.getLength());
        }
        return parts;
    }
}
