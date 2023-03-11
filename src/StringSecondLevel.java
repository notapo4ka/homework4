import java.util.Objects;

public class StringSecondLevel {

    public String doubleChar(String str) {
        Objects.requireNonNull(str, "string must not be null");
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.length() <= 1) {
                return result;
            }
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                result++;
            }
        }
        return result;
    }

    public boolean catDog(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() + 1; i++) {
            if(str.substring(i).startsWith("cat")) {
                countCat++;
            }

            if(str.substring(i).startsWith("dog")){
                countDog++;
            }
        }

        if(countCat == countDog) {
            return true;
        }
        return false;
    }

    public int countCode(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        Objects.requireNonNull(a, "string must not be null");
        Objects.requireNonNull(b, "string must not be null");
        boolean result = true;
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        for (int i = 0; i < lowerA.length(); i++) {
            for (int j = 0; j < lowerB.length(); j++) {
                if (lowerA.endsWith(lowerB)) {
                    return true;
                } else if (lowerB.endsWith(lowerA)) {
                    return true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
