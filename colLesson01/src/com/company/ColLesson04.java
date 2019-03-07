package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {

    public static void main(String[] args) {

        ArrayList<Word> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("分からなかった単語とその意味をスペースで区切って入力して下さい。");
        String input = scanner.nextLine();

        int index = 0;
        while (!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            try {
                words.add(wd);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }
            index++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            input = scanner.nextLine();

        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println("単語：" + words.get(i).word + "日本語：" + words.get(i).meaning);
        }
        System.out.println(words.size() + "件、登録しました。");


    }
}
