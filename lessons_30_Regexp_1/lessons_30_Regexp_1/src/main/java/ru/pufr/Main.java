package ru.pufr;

public class Main {
    public static void main(String[] args) {

        /*
            \\d - одна цифра
            \\w - одна буква, то же что и [a-zA-Z]

            +   - 1 или более
            *   - 0 или более
            ?   - 0 или 1 символов до

            (x|y|z) - одна строка из множества строк
            [a-zA-Z] - все буквы латиницы
            [^abc]  - мы хотим все символы, кроме указаных
            .   - любой символ

            {2} - 2 символа до (\\d{2})
            {2, }   - 2 или более символов (\\d{2,})
            {2, 4}  - от 2 до 4 символов (\\d{2,4})

            regexlib.com
         */

        String a = "-41241";
        String b = "41241";
        String c = "+41241";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "g13214";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String f = "1123123";
        System.out.println(f.matches("\\d{2,}"));

    }
}