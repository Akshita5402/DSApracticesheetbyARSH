   class Solution {
        public void setZeroes(int[][] matrix) {

            //COL0 is true becoz agar us column me koi 0 aya to full column zero krdenge
            //rows hmari no of rows h
            //cols hmare no of column in 1st row h


            int rows=matrix.length, cols=matrix[0].length;
            boolean col=true;

            // hm 1st row or 1st column m change krnge
            for(int i=0;i<rows;i++){
                // i row traverse krega and j columns

                if(matrix[i][0]==0){ //1st column
                    col=false; //ye pata lagane ki poore 1st column m 0 hai ki ni
                    // agar nahi hai to true hi rhega or end me change nhi krna pdega
                    // or agar h to end me poore 1st column ko 0 krdenge
                }

                //ye wala loop 1st row and 1st column m 0 assign krega
                //jiske basis pr baaki kr and c 0 hunge

                for(int j=1;j<cols;j++){ //2nd column se start hoke last column tk
                    //ONLY TRAVERSAL NO CHANGE
                    if(matrix[i][j]==0){
                        matrix[i][0]=matrix[0][j]=0; //CHANGE
                    }

                }

            }

            //MAIN KAAM
            //last element s shuru hoga
            for(int i=rows-1;i>=0;i--){
                for(int j=cols-1;j>=1;j--){
                    if(matrix[i][0]==0||matrix[0][j]==0){
                        matrix[i][j]=0;
                    }

                }
                if ( col == false ){
                    matrix[i][0]=0;
                }
            }













        }
    }

