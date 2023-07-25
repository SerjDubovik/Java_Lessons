package ru.pufr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, fgdlkjfg! erfgk ldfj  jaslkj test@gmail.com dsl kj ;lkjl;j  asdfjkglkj  ;se sldjlfkjslfg\n " +
                "lkdjfglkjdf lkj lkjlkjsdf ljopiuoiu d sfsdufoiu sodiuofu osiudofu " +
                ";lsdkf;k s;ldkf;k ;kpwehfjhkj kg kjhgjhgjsdg ";

        System.out.println(text);

        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}