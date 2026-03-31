class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        List<Integer> keys = new ArrayList<>();
        for(int key:map.keySet()){
            keys.add(key);
        }
        Collections.sort(keys, (a,b) -> map.get(b)-map.get(a));

        int result[] = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = keys.get(i);
        }
        return result;
    }
}
