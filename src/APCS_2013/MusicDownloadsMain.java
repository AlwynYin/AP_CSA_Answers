package APCS_2013;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicDownloadsMain {
    public static void main(String[] args) {
        ArrayList<DownloadInfo> arrayList = new ArrayList<DownloadInfo>();
        arrayList.add(new DownloadInfo("Hey Jude", 5));
        arrayList.add(new DownloadInfo("Soul Sister", 3));
        arrayList.add(new DownloadInfo("Aqualung", 10));
        MusicDownloads downloads = new MusicDownloads(arrayList);
        System.out.println(downloads);
        String[] newDownloads = {"Lights", "Aqualung", "Soul Sister", "Go Now", "Lights", "Soul Sister"};
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.addAll(Arrays.asList(newDownloads));
        downloads.updateDownloads(arrayList1);
        System.out.println(downloads);
    }
}
