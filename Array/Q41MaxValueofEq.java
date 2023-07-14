class Solution {
    public int findMaxValueOfEquation(int[][] p, int k) {
        
        int max=Integer.MIN_VALUE;
       int rows=p.length;
       int flag=1;

       if(rows==2){
           int j=1;
           
            int xi=p[0][0];
            int xj=p[1][0];

           int yi=p[0][1];
            int yj=p[1][1];

           int absdiff=Math.abs(xi-xj);
           

            if(absdiff<=k){
                int tempmax=yi+yj+absdiff;
                max=Math.max(max,tempmax);
            }

       }
        for(int i=0;i<rows-1;i++){
            if(flag<i+1){
                flag=i+1;
            }
            for(int j=flag;j<rows;j++){
                if(p[j][0]>(p[i][0]+k))
					break;
            //int j=1+i;
           int xi=p[i][0];
            int xj=p[j][0];

           int yi=p[i][1];
            int yj=p[j][1];

           int absdiff=Math.abs(xi-xj);

            if((p[i][1]+p[j][1]+p[j][0]-p[i][0])>max){
                    max=p[i][1]+p[j][1]+p[j][0]-p[i][0];
                flag=j-1;
            }
            }
            

        }

        return max;
    }
}


/*DRY RUN FOR
int[][] p= new int[][] {{-17,-6},{-4,0},{-2,-16},{-1,2},{0,11},{6,18}};
 int k=13; 


6
0
flag: 1 i:0 j:1
true
max:7
true
1
flag: 2 i:1 j:2
false
flag: 2 i:1 j:3
false
flag: 2 i:1 j:4
true
max:15
flag: 3 i:1 j:5
true
max:28
2
flag: 4 i:2 j:4
false
flag: 4 i:2 j:5
false
3
flag: 4 i:3 j:4
false
flag: 4 i:3 j:5
false
4
flag: 5 i:4 j:5
true
max:35
35

 
 */
