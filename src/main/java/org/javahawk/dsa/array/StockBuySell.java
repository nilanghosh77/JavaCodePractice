package org.javahawk.dsa.array;

public class StockBuySell {
    static int maxProfit(int[] prices){
        // If no prices or only one day, no transaction possible
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0]; // Minimum price seen so far
        int maxProfit = 0; // Minimum price seen so far

        for(int i=1;i<prices.length;i++){
            int currentPrice = prices[i];
            // Calculate profit if sold today
            int profit = currentPrice - minPrice;
            // Update maxProfit if we found a better profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            // Update minPrice if we find a lower price
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
//        int[] stockPrices = {1,2,3,4,5,7};
        int result = maxProfit(stockPrices);
        System.out.println("Max profit earned out of a transaction (1 buy + 1 sell) : "+result);
    }

}
