package Monetary.Coin;

public class MonetaryCoinDriver {


    public static void main(String[] args) {
MonetaryCoin[] coins = new MonetaryCoin[7];
coins[0] = new MonetaryCoin(1);
coins[1] = new MonetaryCoin(5);
coins[2] = new MonetaryCoin(10);
coins[3] = new MonetaryCoin(25);
coins[4] = new MonetaryCoin(50);
coins[5] = new MonetaryCoin(100);
coins[6] = new MonetaryCoin(100);

        //flip all of the coin
        for (MonetaryCoin coin : coins) {
            coin.flip();
        }

        //Compute the total value of the coins
        int sum = 0;
        for (MonetaryCoin coin : coins){
        sum+= coin.getValue();
    }

        //Print the coint
        for (MonetaryCoin coin : coins) {
            // your code
            System.out.println(coin);
        }

//Total value of all the coins
System.out.println("\nTotal Value: "+sum);
    }
}
