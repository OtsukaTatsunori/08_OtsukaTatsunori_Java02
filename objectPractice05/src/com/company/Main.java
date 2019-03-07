package com.company;
public class Main {

    public static void main(String[] args) {

        Person[] personArr = {new Person("森田","奈良"),
                              new Person("木村","埼玉"),
                              new Person("高山","東京"),
                              new Person("茂木","沖縄")};

        for (int i = 0; i < personArr.length; i++) {
            personArr[i].getSelfIntroduction();
        }
    }
}