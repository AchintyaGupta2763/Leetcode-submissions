class Solution {
    public int maxArea(int[] height) {
        int ptr1 = 0, ptr2 = height.length-1;
        int max = 0;
        while(ptr1<ptr2){
            int curr = (Math.min(height[ptr1],height[ptr2]))*(ptr2-ptr1);
            max = curr>max?curr:max;
            if(height[ptr1]<height[ptr2]) ptr1++;
            else ptr2--;
        }        
        return max;        
    }
}
