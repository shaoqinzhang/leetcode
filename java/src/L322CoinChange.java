import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L322CoinChange {
    public int coinChange(int[] coins, int amount) {
        List<Integer> res = new ArrayList<>();
        int []dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i = 1;i<=amount;i++){
            for(int j = 0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]<amount+1? dp[amount]:-1;

    }
    public static void main(String[] args){
        int[] coin = {1, 2, 5};
        int target = 11;
        L322CoinChange solution = new L322CoinChange();
        System.out.println(solution.coinChange(coin,target));
    }
}
