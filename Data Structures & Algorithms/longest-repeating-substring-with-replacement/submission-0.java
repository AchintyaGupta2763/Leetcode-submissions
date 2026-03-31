class Solution {
    public int characterReplacement(String s, int k) {
        var map = new HashMap<Character, Integer>();
        int max = 0, pointer = 0, freq = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
            freq=freq>map.get(c)?freq:map.get(c);

            while((i-pointer+1)-freq > k){
                char leftchar = s.charAt(pointer);
                map.put(leftchar, map.get(leftchar)-1);
                pointer++;
            }

            max = max>(i-pointer+1)?max:(i-pointer+1);
        }
        return max;
    }
}

