class Solution {
    public int findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int mindiff = Integer.MAX_VALUE; // Initialize mindiff to a large value
        
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = a.get(i + m - 1) - a.get(i);
            mindiff = Math.min(diff, mindiff);
        }
        
        return mindiff;
    }
}

