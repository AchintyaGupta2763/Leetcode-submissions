class Solution {
    public int largestRectangleArea(int[] heights) {

        int[] left = new int[heights.length];
        int[] right = new int[heights.length];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]) st.pop();
            left[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }

        st.clear();

        for(int i =  heights.length -1; i >=0 ; i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]) st.pop();
            right[i] = st.isEmpty()?heights.length:st.peek();
            st.push(i);
        }
        
        int ans = 0;

        for(int i = 0; i < heights.length; i++){
            int curr = heights[i] * (right[i]-left[i]-1);
            ans = ans>curr?ans:curr;
        }
        return ans;
        
    }
}
