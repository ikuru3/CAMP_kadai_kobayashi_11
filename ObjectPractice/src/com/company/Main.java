package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoinCase coincase = new CoinCase();

        for (int i=0; i < 6; i++) {
            System.out.println("硬貨の種類を入力して下さい");
            String syurui = scanner.next();
            int kind = Integer.parseInt(syurui);
            System.out.println("硬貨の枚数を入力して下さい");
            String maisuu = scanner.next();
            int count = Integer.parseInt(maisuu);

            coincase.AddCoins(kind, count);
        }

        System.out.print("500円は"+coincase.GetCount(500)+"枚 ");
        System.out.print("100円は"+coincase.GetCount(100)+"枚 ");
        System.out.print("50円は"+coincase.GetCount(50)+"枚 ");
        System.out.print("10円は"+coincase.GetCount(10)+"枚 ");
        System.out.print("5円は"+coincase.GetCount(5)+"枚 ");
        System.out.println("1円は"+coincase.GetCount(1)+"枚 ");

        System.out.println("総額は"+coincase.GetAmount()+"円です。");


    }

}

