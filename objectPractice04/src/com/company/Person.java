package com.company;

public class Person {

    private String name;
    private String origin;

    public Person(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }
        public void getSelfIntroduction () {
            System.out.println("私の名前は" + this.name + "です。" +
                    "出身地は" + this.origin + "です");

        }
}
