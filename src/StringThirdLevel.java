import java.util.Objects;

public class StringThirdLevel {

    public int countYZ(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                if (i <  str.length() - 1 && !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                } else if ( i == str.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean equalIsNot(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                isCount++;
            }
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
                notCount++;
            }
        }

        if (isCount == notCount) {
            return true;
        } else {
            return false;
        }
    }
}
