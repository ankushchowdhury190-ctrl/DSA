class Solution {
    public double myPow(double x, long e) {


        if(e==0)
            return 1;
        if(e<0)
            return 1/myPow(x,-e);
        if(e==1)
            return x;
        if(e%2==0)
            return myPow(x*x,e/2);
        else
            return x*myPow(x,e-1);
        



        
        
        

        
    }
}