class Solution {
    public int singleNumber(int[] nums) {
        int ans= 0;
        for(int i = 0; i<32 ;i++){
            int count = 0;
            for (int j=0;j<nums.length;j++){
                if( (nums[j] &(1<<i))!=0){
                    count ++;
                }
            }
            count %=3;
            if(count !=0){
                ans |=  count<<i;      
            }
        }
        return ans ;
        
    }
}