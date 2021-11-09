import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BackToSchool {
    public static BufferedReader bufferedReader;

    public static void main(String[] args) {
        initReader();
        new DoubleTask();
        closeReader();
    }

    public static void initReader() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void closeReader() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
