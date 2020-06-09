import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        System.out.println("----------1----------");
        String[] emails = new String[]{"ilnar0806@mail.ru", "ilnar.mirkhaev@gmail.com",
                "st076505@student.spbu.ru", "a@s..ru", "a3.@mail.org",
                "a.3@gmail.com", "a.3-@gmail.com", "adam-_._-scott@gmail.com",
                "a@b-c.ru", "a@b_c.ru"};
        for(String email : emails) {
            System.out.printf("%s - %b\n", email, emailMatch(email));
        }

        System.out.println("----------2----------");
        String s = "Это строка      , у которой зачем-то написаны два пробела перед запятой";
        System.out.println(s);
        System.out.println(replaceSpacesBeforeCommas(s));

        System.out.println("----------3----------");
        String s1 = "Какая-то сине-зеленовая трава";
        System.out.println(s1);
        System.out.println(swapHyphenParts(s1));

        System.out.println("----------4----------");
        System.out.println(countMatchesCustom("В доме, в котором живет усатый кот, " +
                "готовят котлеты! Кот КОТКОТКОТ.", "кот", 0));
        System.out.println(countMatchesCustom("В доме, в котором живет усатый кот, " +
                "готовят котлеты! Кот КОТКОТКОТ?", "КОт", 1));

        System.out.println("----------5----------");

    }

    private static boolean emailMatch(String email) {
        String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
//        String regex = "\\w+([\\._-]\\w+)*@([\\w-]+\\.)+\\w{2,4}";
        return email.matches(regex);
    }

    private static String replaceSpacesBeforeCommas(String s) {
        String regex = "\\s+(,)";
        return s.replaceAll(regex, "$1");
    }

    private static String swapHyphenParts(String s) {
        String regex = "([\\wа-яА-Я]+)-([\\wа-яА-Я]+)";
        return s.replaceAll(regex, "$2-$1");
    }

    private static int countMatchesCustom(String s, String regex, int mode) {
        int count = 0;

        if (mode != 0) {
            regex = "(^|\\s|\\p{Punct})" + regex + "(\\p{Punct}|\\s|$)";
        }

        Pattern p = Pattern.compile(
                regex,
                Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE
        );
        Matcher m = p.matcher(s);
        while (m.find()) {
            count++;
        }

        return count;
    }
}
