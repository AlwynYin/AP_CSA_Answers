package APCS_2013;

public class DownloadInfo {
    private String myTitle;
    private int myTimesDownloaded;

    public DownloadInfo(String title) {
        myTitle = title;
        myTimesDownloaded = 0;
    }

    public DownloadInfo(String title, int times) {
        myTitle = title;
        myTimesDownloaded = times;
    }

    public String getTitle() {
        return myTitle;
    }

    public void incrementTimesDownloaded() {
        myTimesDownloaded++;
    }

    public String toString() {
        return myTitle + ", " + myTimesDownloaded;
    }
}
