package org.example;

public class UtopiaCoins {

    public int minCoins1(int N) {
        if (N == 0) {
            return 0;
        }

        if(N < 0){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        if (N >= 1) {
            min = Math.min(min, minCoins1(N - 1) + 1);
        }
        if (N >= 7) {
            min = Math.min(min, minCoins1(N - 7) + 1);
        }
        if (N >= 10) {
            min = Math.min(min, minCoins1(N - 10) + 1);
        }
        if (N >= 22) {
            min = Math.min(min, minCoins1(N - 22) + 1);
        }
        return min;
    }

    public int minCoins2(int N){
        if(N == 0){
            return 0;
        }

        if(N < 0){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int coins[] = {1,7,10,22};
        for(int i = 0; i < coins.length; i++){
            if(N >= coins[i]){
                min = Math.min(min, minCoins2(N - coins[i]) + 1);
            }
        }
        return min;
    }

    public int minCoinsTable(int N){
        if(N == 0){
            return 0;
        }

        if(N < 0){
            return -1;
        }

        int[] coins = {1,7,10,22};
        int[] table = new int[N+1];

        for(int i = 1; i <= N; i++){
            table[i] = N;
        }

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < 4; j++){
                if(i >= coins[j]){
                    table[i] = Math.min(table[i], table[i - coins[j]] + 1);
                }
            }
        }
        return table[N];
    }

}
