package gr.aueb.cf.ch5;

public class StrBuilderApp {
    public static void main(String[] args) {
        String concatStr = " ";
        StringBuilder sb = new StringBuilder();

        long timeStart = 0L;
        long timeEnd = 0l;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<=100.000; i++) {
            concatStr += i;
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i<=50.000; i++) {
            sb.append(i);
        }

        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String Elapsed time: " + stringElapsedTime + " seconds");
        System.out.println("Stb Elapsed time: " + sbElapsedTime + " seconds");
    }
}
