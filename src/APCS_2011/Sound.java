package APCS_2011;

public class Sound {
    private int[] samples;

    public Sound(int[] newSamples) {
        samples = newSamples;
    }

    public int limitAmplitude(int limit) {
        int count = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                count++;
            }
            else if (samples[i] < -limit) {
                samples[i] = -limit;
                count++;
            }
        }
        return count;
    }

    public void trimSilenceFromBeginning() {
        // find the first non-zero int
        // i = index of first non-zero int, also length of the zeros
        int i = 0;
        while (samples[i] == 0) {
            i++;
        }
        int[] trimmed = new int[samples.length - i];
        // copy the values
        int temp = 0;
        for (int j = i; j < samples.length; j++) {
            trimmed[temp] = samples[j];
            temp++;
        }
        samples = trimmed;
    }

    public String toString() {
        String str = "";
        for (int i: samples) {
            str += i + " ";
        }
        return str;
    }
}
