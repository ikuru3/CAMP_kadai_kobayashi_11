package com.company;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Word w = new Word(
        );

        String word[] = new String[10];
        String meaning[] = new String[10];

        int total = 0;
        while (total < 10) {
            if (total == 0) {
                System.out.println("分からなかった単語とその意味をスペースで区切って入力して下さい。");
            } else {
                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            }
            word[total] = scanner.next();
            if (word[total].equals("e")) {
                break;
            }
            meaning[total] = scanner.next();

            total++;
            w.AddWord(word,meaning);
        }
        for (int i = 0; i < total; i++) {
            w.GetAmount();
        }
            System.out.println(total + "件、登録しました。");
    }
}
