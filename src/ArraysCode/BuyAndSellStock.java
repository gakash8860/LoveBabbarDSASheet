package ArraysCode;

public class BuyAndSellStock {
    public static void main(String[] args) {
       int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfitSelf(prices));
    }
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int j=0;
        for (int i = 0; i < prices.length; i++){
            if (buy>prices[i]){
               buy =  prices[i];
                j = i;
               continue;
            }
        }
        for (int i = j; i < prices.length; i++){
            if (sell<prices[i]){
                sell =  prices[i];
            }
        }
//        System.out.println(sell);
//
//        System.out.println(buy);
        int max = sell - buy;
        return max;
    }
    public static int maxProfitBest(int[] prices)
    {
        int min = prices[0];
        int maxDiff = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min) {
                min = prices[i];
                System.out.println(min);
            }
            maxDiff = Math.max(prices[i]-min,maxDiff);
            System.out.println("max"+maxDiff);
        }
        return maxDiff;
    }

    public static int maxProfitSelf(int[] prices){
        int min = prices[0];
        int max = 0;
        for (int i=0; i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            max = Math.max(prices[i] - min,max);
        }
        return max;
    }

}
