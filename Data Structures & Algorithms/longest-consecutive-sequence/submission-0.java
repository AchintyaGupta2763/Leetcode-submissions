class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        var set  = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int max = 1;
        for(int s : set){
            if(set.contains(s-1)) continue;
            else{
                int currentNum = s;
                int count = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                max = max>count?max:count;
            }
        } 
        return max;        
    }
}
