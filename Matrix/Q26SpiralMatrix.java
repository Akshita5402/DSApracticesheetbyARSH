class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int right=matrix[0].length-1;
        int left=0;
        int top=0;
        int bottom=matrix.length-1;
        List<Integer> result=new ArrayList<Integer>();

        while(left<=right && top<=bottom){
//Traversing Left--->Right
            for(int i=left;i<=right;i++){
                result.add(matrix[left][i]);

            }
            top++; 
//Traversing down          
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--; // last column is traversed 
            if(top<=bottom){ //traversing right to left of bottom row
                for (int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }          
            }
            bottom--; //last row is traversed
            if(left<=right){ //traversing up
                for (int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]); // left is where we have to traverse 
                }
            }
            left++;// 1st column is traversed
        }

    return result;
    }
}
