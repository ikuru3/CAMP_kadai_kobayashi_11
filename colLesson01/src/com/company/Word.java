package com.company;


public class Word {

    public String word;
    public String meaning;

    public void AddWord(String word[],String meaning[]) {
        this.word = word[0];
        this.meaning = meaning[0];
    }


    public void GetAmount() {
                System.out.print("単語：" + word);
                System.out.println(" 意味：" + meaning);

        }
        }

