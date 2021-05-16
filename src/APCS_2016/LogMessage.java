package APCS_2016;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        for (int i = 0; i < message.length() - 3 + 1; i++) {
            if (!message.substring(i, i+1).equals(" ") && message.substring(i+1, i+2).equals(":") && !message.substring(i+2, i+3).equals(" ")) {
                machineId = message.substring(0, i + 1);
                description = message.substring(i + 2);
            }
        }
    }

    public boolean containsWord(String keyword) {
        // beginning
        if (description.equals(keyword))
            return true;
        if (description.indexOf(keyword + " ") == 0)
            return true;
        if (description.indexOf(" " + keyword + " ") != -1)
            return true;
        if (description.length() > keyword.length())
        {
            if (description.substring(description.length() - keyword.length() -1).equals(" " + keyword))
                return true;
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
