class Solution {
    public int countGoodNumbers(long n) {
        long MOD = 1000_000_007;
        long even = (n+1)/2;
        long odd = n/2;
        long res = power(5,even) * power(4,odd)%MOD;
        return (int) res ;
        }
    public long power(long x, long n){
        long res =1;
        while(n>0){
            if(n%2!=0){
                res= res*x%1000_000_007;
            }
            x=x*x%1000_000_007;
            n=n/2;

        }
        return res;
    }

}