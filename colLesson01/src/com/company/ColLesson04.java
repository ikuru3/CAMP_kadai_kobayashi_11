package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class ColLesson04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Word w = new Word(
        );

        ArrayList<String> word = new ArrayList<>();
        ArrayList<String> meaning = new ArrayList<>();


        int total = 0;
        try {
            while (total < 10) {
                if (total == 0) {
                    System.out.println("分からなかった単語とその意味をスペースで区切って入力して下さい。");
                } else {
                    System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                }

                word.add(scanner.next());
                if (word.equals("e")) {
                    break;
                }
                meaning.add(scanner.next());

                total++;
//                w.AddWord(word,meaning)

            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
        }

        for (int i = 0; i < total; i++) {
            w.GetAmount();
        }
        System.out.println(total + "件、登録しました。");
    }
}

