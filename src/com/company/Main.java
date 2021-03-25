package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(final String[] args) {

        final ArrayList<Boy> boys = new ArrayList<>() {{
            add(new Boy("Николай", 68));
            add(new Boy("Пётр", 53));
            add(new Boy("Василий", 25));
            add(new Boy("Михаил", 19));
            add(new Boy("Алексей", 6));
            add(new Boy("Николай", 86));
            add(new Boy("Пётр", 35));
            add(new Boy("Михаил", 111));
            add(new Boy("Алексей", 22));
            add(new Boy("Михаил", 1));
            add(new Boy("Яков", 30));
        }};
        Map<String, Long> map = boys.stream()
                .filter(x -> (x.getAge() > 17))
                .map(Boy::getName)
                .distinct()
                .sorted()
                .limit(4)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println(map);
    }
}
