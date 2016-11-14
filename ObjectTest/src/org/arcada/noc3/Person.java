package org.arcada.noc3;

public class Person {
    static int timesConstructedWithNameAndAge = 0;
    static int timesConstructedWithAgeAndName = 0;

    private String mName;
    private int mAge;

    public Person() {}

    public Person(String name, int age) {
        mName = name;
        mAge = age;
        timesConstructedWithNameAndAge++;
    }

    public Person(int age, String name) {
        mName = name;
        mAge = age;
        timesConstructedWithAgeAndName++;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }
}
