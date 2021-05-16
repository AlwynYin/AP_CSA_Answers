package APCS_2016;

import java.util.ArrayList;

public class SystemLog {
    private ArrayList<LogMessage> messageList;

    public SystemLog(ArrayList<LogMessage> messageList) {
        this.messageList = messageList;
    }

    public ArrayList<LogMessage> removeMessages(String keyword) {
        ArrayList<LogMessage> removed = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            if (!messageList.get(i).containsWord(keyword)) {
                removed.add(messageList.remove(i));
                i--;
            }
        }
        return removed;
    }

}
