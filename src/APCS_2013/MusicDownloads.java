package APCS_2013;

import java.util.ArrayList;

public class MusicDownloads {
    private ArrayList<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    public MusicDownloads(ArrayList<DownloadInfo> list) {
        downloadList = list;
    }

    public DownloadInfo getDownloadInfo(String title) {
        for (DownloadInfo info: downloadList) {
            if (info.getTitle().equals(title))
                return info;
        }
        return null;
    }

    public void updateDownloads(ArrayList<String> titles) {
        for (String each: titles) {
            if (getDownloadInfo(each) == null) {
                downloadList.add(new DownloadInfo(each));
            }
            else {
                getDownloadInfo(each).incrementTimesDownloaded();
            }
        }
    }

    public String toString() {
        String str = "";
        for (DownloadInfo each: downloadList)
            str += each + "\n";
        str += "\n";
        return str;
    }
}
