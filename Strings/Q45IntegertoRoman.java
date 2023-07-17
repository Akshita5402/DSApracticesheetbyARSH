class Solution {
    public String intToRoman(int num) {
        String[] M={"","M","MM","MMM"}; //1000-3000
        String[] C={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};//100-900
        String[] X= {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};//10-90
        String[] I= {"", "I","II","III","IV","V","VI","VII","VIII","IX"};//1-9

        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[(num%10)];//for every place of the no i.e--> ones, tense, hundreds, thousands etc.
        
    }
}
