import java.util.*;
public class Main {
  public static int coinChange(int[] coins, int amount) {
    int max = amount + 1;
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, max);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i) {
          dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
        }
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }
  public static void main(String args[])
  {
    
    Scanner scn =new Scanner(System.in);
    int t=scn.nextInt();
    while(t!=0)
    {
    int amount = scn.nextInt();
    
    int [] coins ={1,5,7,10};
    int n =coinChange(coins, amount);
    System.out.println(n);
      t--;
  }
  }
}