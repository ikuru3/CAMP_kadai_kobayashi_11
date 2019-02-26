package com.company;

public class ObjectPractice05 {

    public static void main(String[] args) {
        Person person1 = new Person(
                "森田",
                "奈良"
        );
        Person person2 = new Person(
                "木村",
                "埼玉"
        );
        Person person3 = new Person(
                "高山",
                "東京"
        );
        Person person4 = new Person(
                "茂木",
                "沖縄"
        );

        person1.getSelfIntroduction();
        person2.getSelfIntroduction();
        person3.getSelfIntroduction();
        person4.getSelfIntroduction();




    }

}
