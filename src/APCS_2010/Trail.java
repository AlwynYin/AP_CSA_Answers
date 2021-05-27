package APCS_2010;

public class Trail {
    private int[] markers;

    public Trail(int[] newMarkers) {
        markers = newMarkers;
    }

    public boolean isLevelTrailSegment(int start, int end) {
        // find the lowest
        int lowest = markers[start];
        for (int i = start + 1; i <= end; i++) {
            if (lowest > markers[i]) {
                lowest = markers[i];
            }
        }

        // find the highest
        int highest = markers[start];
        for (int i = start + 1; i <= end; i++) {
            if (highest < markers[i]) {
                highest = markers[i];
            }
        }

        return highest - lowest <= 10;
    }

    public boolean isDifficult() {
        int count = 0;
        for (int i = 0; i < markers.length - 1; i++) {
            if (Math.abs(markers[i+1] - markers[i]) >= 30) {
                count++;
            }
        }
        return count >= 3;
    }
}
