class Solution {
    public int lengthOfLongestSubstring(String s) {
        var set = new HashSet<Character>();
        int max = 0, pointer = 0;
        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(pointer));
                pointer++;    
            }
            set.add(s.charAt(i));
            max = max>(i-pointer+1)?max:(i-pointer+1);
        }
        return max;
        
    }
}
