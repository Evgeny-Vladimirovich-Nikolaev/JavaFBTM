import java.util.ArrayList;
import java.util.Random;

public class LicenseGenerator {
    private static ArrayList<String> licensesList = new ArrayList<>();
    Random random = new Random();

    public String getNewLicense() {
        String newLicense;
        boolean isUnique;
        do {
            newLicense = generate();
            isUnique = true;
            for (String s : licensesList) {
                if (newLicense.equals(s)) {
                    isUnique = false;
                    break;
                }
            }
        } while (!isUnique);
        return newLicense;
    }

    private String generate() {
        StringBuilder license = new StringBuilder();
        license.append(getSymbol());
        license.append(' ');
        for (int i = 0; i < 3; i++) {
            license.append(getDigit());
        }
        license.append(' ');
        license.append(getSymbol());
        license.append(getSymbol());
        return license.toString();
    }

    private char getSymbol() {
        return (char) (random.nextInt(26) + 1040);
    }

    private int getDigit() {
        return random.nextInt(10);
    }
}
