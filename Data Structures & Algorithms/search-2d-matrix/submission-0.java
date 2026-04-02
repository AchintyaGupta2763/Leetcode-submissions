class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int st = 0;
        int end = (m*n)-1;
        while(st<=end){
            int mid = st + (end-st)/2;
            int row = mid/n;
            int col = mid%n;
            if(target>matrix[row][col]){
                st = mid + 1;
            }
            else if(target<matrix[row][col]){
                end = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;        
    }
}
