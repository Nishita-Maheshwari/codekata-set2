class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] ch=new int[amount+1];
        ch[0]=1;
        for(int coin:coins){
            for(int i=coin;i<amount+1;i++){
                ch[i]+=ch[i-coin];
            }
        }
        return ch[amount];
        
    }
}
