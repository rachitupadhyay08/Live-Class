package lec46;

public class Fibo {
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        System.out.println(FibTD(n, dp)); 
    }
    public static int FibTD(int n){
        int[] dp = new int [n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<dp.length; i++){
            dp[i] = dp[i-1] +  dp[i-2];
        } 
        return dp[n];
    }
    public static int FibTD(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if (dp[n] != 0){
            return dp[n];
        }
        int f1=FibTD(n-1,dp);
        int f2=FibTD(n-2,dp);
        return dp[n] = f1+f2;
    }
}
