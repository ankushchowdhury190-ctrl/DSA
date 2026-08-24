class Solution {
    public int stoneGameVIII(int[] stone) {
        int n = stone.length;
        int[] prefix = stone.clone();
        for (int i=1; i<n;i++){
            prefix[i] += prefix[i-1];

        }
        int best = prefix[n-1];
        for (int i=n-2; i>=1;i--){
            best= Math.max(best, prefix[i] - best);
        }
        return best;

        
        
    }
}