import java.util.Objects;

public class StringFirstLevel {

    public String helloName(String name) {
        Objects.requireNonNull(name, "string must not be null");
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        Objects.requireNonNull(a, "string must not be null");
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        Objects.requireNonNull(word, "string must not be null");
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        Objects.requireNonNull(word, "string must not be null");
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        Objects.requireNonNull(str, "string must not be null");
        String s = str.substring(str.length() - 2, str.length());
        return s + s + s;
    }

    public String firstTwo(String str) {
        Objects.requireNonNull(str, "string must not be null");

        if (str.length() == 0) {
            return "";
        } else if (str.length() < 2) {
            return str;
        }
        String s = str.substring(0, 2);
        return s;
    }

    public String firstHalf(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int length = str.length() / 2;
        return str.substring(0, length);
    }

    public String withoutEnd(String str) {
        Objects.requireNonNull(str, "string must not be null");
        int length = str.length();
        return str.substring(1, length - 1);
    }

    public String comboString(String a, String b) {
        Objects.requireNonNull(a, "string must not be null");

        if (a.length() > b.length()) {
            return b + a + b;
        } else if (b.length() > a.length()) {
            return a + b + a;
        }
        return null;
    }

    public String nonStart(String a, String b) {
        Objects.requireNonNull(a, "string must not be null");
        Objects.requireNonNull(b, "string must not be null");
        String readyToConcatA = a.substring(1, a.length());
        String readyToConcatB = b.substring(1, b.length());
        return readyToConcatA.concat(readyToConcatB);
    }
}
