class Solution {
    public boolean hasDuplicate(int[] nums) {
        var map = new HashSet<Integer>();
        for(int num: nums){
            if(map.contains(num)) return true;
            map.add(num);
        }
        return false;
    }
}