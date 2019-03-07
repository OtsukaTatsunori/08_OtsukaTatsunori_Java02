package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        CoinCase coinCase = new CoinCase();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.println("硬貨の種類を入力して下さい。");
            String type = scanner.nextLine();
            System.out.println("硬貨の枚数を入力して下さい。");
            String count = scanner.nextLine();
            coinCase.AddCoins(Integer.parseInt(type),Integer.parseInt(count));
        }

        System.out.println("500円は" + coinCase.GetCount(500) + "枚 100円は" +
                +coinCase.GetCount(100) + "枚 50円は"
                + coinCase.GetCount(50) + "枚 10円は"
                + coinCase.GetCount(10) + "枚 5円は"
                + coinCase.GetCount(5) + "枚 1円は"
                + coinCase.GetCount(5) + "枚");
        System.out.println("総額は" + coinCase.GetAmount() + "円です");
    }
}
