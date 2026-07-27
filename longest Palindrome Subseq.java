class Solution {
    public int longestPalindromeSubseq(String s) {
        String a = new StringBuilder(s).reverse().toString();
        int[] dp=new int[s.length()];
        int m=0;
        for (char c : a.toCharArray()){
            int curr=0;
            for(int i=0;i<dp.length;i++){
                if(curr<dp[i]){
                    curr=dp[i];
                } else if (c==s.charAt(i)){
                    dp[i]=curr+1;
                    m=Math.max(curr+1,m);
                }
            }
        }
        return m;
    }
}