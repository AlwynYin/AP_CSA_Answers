package APCS_2016;

import java.util.ArrayList;

public class SystemLogMain {
    public static void main(String[] args) {
        ArrayList<LogMessage> logs = new ArrayList<LogMessage>();
        logs.add(new LogMessage("CLIENT3:security alert - repeated login failures"));
        logs.add((new LogMessage("Webserver:disk offline")));
        logs.add(new LogMessage("SERVER1:file not found"));
        logs.add(new LogMessage("SERVER2:read error on disk DSK1"));
        logs.add(new LogMessage("SERVER1:write error on disk DSK2"));
        logs.add(new LogMessage("Webserver:error on /dev/disk"));
        SystemLog log = new SystemLog(logs);
        ArrayList<LogMessage> removed = log.removeMessages("disk");
        for (LogMessage each:
             removed) {
            System.out.println(each.getMachineId() + ":" + each.getDescription());
        }
    }
}
