class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1char = new int[26];
        int[] window = new int[26];
        for(char s : s1.toCharArray()){
            s1char[s-'a']++;
        }
        int left = 0;
        int k = s1.length();
        for(int right = 0; right<s2.length(); right++){
            window[s2.charAt(right)-'a']++;
            if(right>=k){
                window[s2.charAt(right-k)-'a']--;
            }

            if(Arrays.equals(s1char, window)) return true;
        }
        return false;
    }
}
