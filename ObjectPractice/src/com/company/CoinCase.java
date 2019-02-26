package com.company;

public class CoinCase {

    public int money500;
    public int money100;
    public int money50;
    public int money10;
    public int money5;
    public int money1;

    public void AddCoins(int kind, int count) {
        switch (kind) {
            case 500:
                money500 += count;
                break;
            case 100:
                money100 += count;
                break;
            case 50:
                money50 += count;
                break;
            case 10:
                money10 += count;
                break;
            case 5:
                money5 += count;
                break;
            case 1:
                money1 += count;
                break;
        }
    }

    public int GetCount(int kind) {
        switch (kind) {
            case 500:
                return money500;
            case 100:
                return money100;
            case 50:
                return money50;
            case 10:
                return money10;
            case 5:
                return money5;
            case 1:
                return money1;
        }
        return 0;
    }


    public int GetAmount() {
            return((500*money500) + (100*money100) + (50*money50) + (10*money10) + (5*money5) + money1);

}
}



//    public CoinCase(int imput_money, int imput_money1,int imput_money2,int imput_money3,int imput_money4,int imput_money5){
//        money = imput_money;
//        money1 = imput_money1;
//        money2 = imput_money2;
//        money3 = imput_money3;
//        money4 = imput_money4;
//        money5 = imput_money5;
//
//    }
//
//    public int money;
//    public int number;
//    public CoinCase(int input_money, int input_number) {
//
//        money = input_money;
//        number = input_number;
//
//    }
//
//        public int AddCoins(){
//            return (money);
//
//        }
//        public int Getcount(){
//            return (number);
//        }
//        public int GetAmount() {
//            return (money+number);
//        }





