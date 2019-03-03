package com.company;

import java.util.Scanner;

public class ColLesson03_A {

    public static void main(String[] args) {

        Word_A[] words = new Word_A[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("分からなかった単語とその意味をスペースで区切って入力して下さい。");
        String input = scanner.nextLine();

        int index = 0;
        while(!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word_A wd = new Word_A(tmp[0],tmp[1]);
            try {
                words[index] = wd;
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }
            index++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            input = scanner.nextLine();

        }
        for (int i = 0 ; i < index; i++) {
            System.out.println("単語：" + words[i].word + "日本語：" + words[i].meaning);
        }
        System.out.println(index +"件、登録しました。");


    }



}
