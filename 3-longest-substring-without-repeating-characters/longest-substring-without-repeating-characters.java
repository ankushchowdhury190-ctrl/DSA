class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1, j = -1, finalLength = 0;

        while(true){
            boolean f1 = false;
            boolean f2 = false;

            //acquire
            while(i < s.length()-1){
                f1 = true;
                i++;  //increment the ith pointer for acquiring 
                char ch = s.charAt(i); // select the ith element
                map.put(ch, map.getOrDefault(ch, 0)+1); //

                if(map.get(ch) == 2){
                    break;
                }else{
                    int length = i - j;
                    if(length > finalLength){
                        finalLength = length;
                    }
                }
            }

            //release
            while(j < i){
                f2 = true;
                j++;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 1){
                    break;
                }
            }

            if(f1 == false && f2 == false){
                break;
            }
        }
        return finalLength;
    }
}