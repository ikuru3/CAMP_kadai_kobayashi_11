package com.company;

public class Person {

    public String name;
    public String from;


    public Person(String input_name, String input_from) {
        name = input_name;
        from = input_from;
    }

        public void getSelfIntroduction () {
            System.out.println("私の名前は" + name + "です。" + from + "出身です。");

        }
    }
