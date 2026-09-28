class Solution {
    public int eraseOverlapIntervals(int[][] interval) {
        Arrays.sort(interval, (a,b) -> a[1] - b[1]);
        int count = 0;
        int end = interval[0][1];
        for (int i = 1; i< interval.length; i++){
            if(interval[i][0] < end ){
                count ++;

            }
            else{
                end = interval[i][1];
            }
        }
        return count;
        
        
        
    }
}