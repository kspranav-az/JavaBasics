package Arrays;

public class BestBuySellStock {
    public static int MaxProf(int prices[]){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++){
            for (int j = i ;j<prices.length;j++){
                max = max>(prices[j]-prices[i])?max:prices[j]-prices[i];
            }
        }
        return (max > 0 ? max : 0);
    }

    public static int MaxProfOpt(int prices[]){
        int max = Integer.MIN_VALUE,BuyP = Integer.MAX_VALUE ;

        for (int price : prices) {
            if (BuyP < price) {
                max = Math.max(max, price - BuyP);
            } else {
                BuyP = price;
            }
        }
        return max;

    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(MaxProf(prices));
        System.out.println(MaxProfOpt(prices));
    }
}
