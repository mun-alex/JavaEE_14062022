package kz.bitlab.javaee.models;

import java.util.ArrayList;
import java.util.List;

public class Translation {
    public static List<List<String>> translation = new ArrayList<>();

    static {
        List<String> russian = new ArrayList<>();
        List<String> english = new ArrayList<>();

        russian.add("Имя");
        russian.add("Фамилия");
        russian.add("Дата рождения");
        russian.add("Город");

        english.add("Name");
        english.add("Surname");
        english.add("Birhtdate");
        english.add("City");

        translation.add(russian);
        translation.add(english);
    }
}
