class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean neg= (dividend<0) != (divisor<0);

        long a = Math.abs((long)dividend);
        long b = Math.abs((long) divisor);
        long count = 0;
        while(a>=b){
            long temp= b;
            long multiple= 1;
            while (a>= (temp<<1)){
                temp= temp<<1;
                multiple= multiple <<1;
            }
            a=a-temp;
            count += multiple;
        }
        if (neg){
            count =-count;
        }
        
        return (int)count;

        
        
    }
}