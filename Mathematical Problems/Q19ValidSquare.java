class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set= new HashSet();

        // calculating all thedistances

       int d1= distance(p1,p2);
       int d2= distance(p1,p3);
       int d3= distance(p1,p4);
       int d4= distance(p2,p3);
       int d5= distance(p2,p4);
       int d6= distance(p3,p4);
       
       //adding all the distances to the set

        set.add(d1);
        set.add(d2);
        set.add(d3);
        set.add(d4);
        set.add(d5);
        set.add(d6);

        if(!set.contains(0) && set.size()==2){
            //only 2 unique elements can be there=> diagnol & sides
            return true;
        }

    return false;

    }
        public static int distance(int x[],int y[]){
        int distance=(x[0]-y[0])*(x[0]-y[0])+(x[1]-y[1])*(x[1]-y[1]);
        return distance;
}
}
