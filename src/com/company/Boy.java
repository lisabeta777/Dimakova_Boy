package com.company;

import java.util.ArrayList;

public class Boy {
    private String name;
    private int age;

    final ArrayList<Boy> boys = new ArrayList<>(10);

    Boy(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

}
