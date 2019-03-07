package com.company;

public class CoinCase {

    private int count_500;
    private int count_100;
    private int count_50;
    private int count_10;
    private int count_5;
    private int count_1;

    public void AddCoins(int type, int count) {
        if (type == 500) {
            this.count_500 = this.count_500 + count;
        } else if (type == 100) {
            this.count_100 = this.count_100 + count;
        } else if (type == 50) {
            this.count_50 = this.count_50 + count;
        } else if (type == 10) {
            this.count_10 = this.count_10 + count;
        } else if (type == 5) {
            this.count_5 = this.count_5 + count;
        } else {
            this.count_1 = this.count_1 + count;
        }
    }

    public int GetCount(int type) {
        if (type == 500) {
            return this.count_500;
        } else if (type == 100) {
            return this.count_100;
        } else if (type == 50) {
            return this.count_50;
        } else if (type == 10) {
            return this.count_10;
        } else if (type == 5) {
            return this.count_5;
        } else {
            return this.count_10;
        }

    }

    public int GetAmount() {
        return 500 * count_500 + 100 * count_100 + 50 * count_50 +
                10 * count_10 + 5 * count_5 + 1 * count_1;
    }
}