class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st= new HashSet<>();
        for(int i : nums){
            st.add(i);

        }
        int val=k;
        while(st.contains(val)){
            val +=k;
        }
        return val;

        
    }
}