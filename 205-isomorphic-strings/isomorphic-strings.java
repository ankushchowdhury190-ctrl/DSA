class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sIndex = new HashMap<>();
        HashMap<Character, Integer> tIndex = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(!sIndex.containsKey(s.charAt(i))){
                sIndex.put(s.charAt(i),i);
            }

            if(!tIndex.containsKey(t.charAt(i))){
                tIndex.put(t.charAt(i),i);
            }

            if(!sIndex.get(s.charAt(i)).equals(tIndex.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}