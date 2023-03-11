import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        StringFirstLevel firstLevel = new StringFirstLevel();
        StringSecondLevel secondLevel = new StringSecondLevel();
        StringThirdLevel thirdLevel = new StringThirdLevel();
        RecursionFirstLevel recursionFirstLevel = new RecursionFirstLevel();

        System.out.println("Метод helloName");
        System.out.println(firstLevel.helloName("Bob"));

        System.out.println();

        System.out.println("Метод makeAbba");
        System.out.println(firstLevel.makeAbba("Hi", "Bye"));

        System.out.println();

        System.out.println("Метод makeTags");
        System.out.println(firstLevel.makeTags("i", "Yay"));

        System.out.println();

        System.out.println("Метод makeOutWord");
        System.out.println(firstLevel.makeOutWord("<<>>", "Yay"));

        System.out.println();

        System.out.println("Метод extraEnd");
        System.out.println(firstLevel.extraEnd("Hello"));

        System.out.println();

        System.out.println("Метод firstTwo");
        System.out.println(firstLevel.firstTwo("Hello"));

        System.out.println();

        System.out.println("Метод firstHalf");
        System.out.println(firstLevel.firstHalf("WooHoo"));

        System.out.println();

        System.out.println("Метод withoutEnd");
        System.out.println(firstLevel.withoutEnd("Hello"));

        System.out.println();

        System.out.println("Метод comboString");
        System.out.println(firstLevel.comboString("Hello", "hi"));

        System.out.println();

        System.out.println("Метод nonStart");
        System.out.println(firstLevel.nonStart("Hello", "There"));

        System.out.println();
        System.out.println("String-2");
        System.out.println();

        System.out.println("Метод doubleChar");
        System.out.println(secondLevel.doubleChar("The"));

        System.out.println();

        System.out.println("Метод countHi");
        System.out.println(secondLevel.countHi("abc hi ho"));

        System.out.println();

        System.out.println("Метод catDog");
        System.out.println(secondLevel.catDog("catdog"));

        System.out.println();

        System.out.println("Метод countCode");
        System.out.println(secondLevel.countCode("aaacodebbb"));

        System.out.println();

        System.out.println("Метод endOther");
        System.out.println(secondLevel.endOther("Hiabc", "abc"));

        System.out.println();
        System.out.println("String-3");
        System.out.println();

        System.out.println("Метод countYZ");
        System.out.println(thirdLevel.countYZ("fez day"));

        System.out.println();

        System.out.println("Метод equalIsNot");
        System.out.println(thirdLevel.equalIsNot("This is not"));

        System.out.println();
        System.out.println("Recursion-1");
        System.out.println();

        System.out.println("Метод factorial");
        System.out.println(recursionFirstLevel.factorial(2));

        System.out.println();

        System.out.println("Метод bunnyEars");
        System.out.println(recursionFirstLevel.bunnyEars(2));

        System.out.println();

        System.out.println("Метод fibonacci");
        System.out.println(recursionFirstLevel.fibonacci(4));

        System.out.println();

        System.out.println("Метод bunnyEars2");
        System.out.println(recursionFirstLevel.bunnyEars(2));

        System.out.println();

        System.out.println("Метод triangle");
        System.out.println(recursionFirstLevel.triangle(3));

        System.out.println();

        System.out.println("Метод sumDigits");
        System.out.println(recursionFirstLevel.sumDigits(126));

        System.out.println("Метод count7");
        System.out.println(recursionFirstLevel.count7(717));

        System.out.println();

        System.out.println("Метод count8");
        System.out.println(recursionFirstLevel.count8(818));

        System.out.println();

        System.out.println("Метод powerN");
        System.out.println(recursionFirstLevel.powerN(3, 3));

        System.out.println();

        System.out.println("Метод countX");
        System.out.println(recursionFirstLevel.countX("xhixhix"));
    }
}
