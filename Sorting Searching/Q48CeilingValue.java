/* Online Java Compiler and Editor */
public class HelloWorld {

    public static void main(String []args) {
        int[] n= {1,3,5,7,8};
        int x=8;
        int l=0;
        int h=n.length;

        while (true) {
            int mid=(l+h)/2;
            if (x<n[mid]) {
                for(int i=0; i<mid; i++) {
                    if (x>n[i] && x<n[i+1]) {
                        System.out.println( n[i+1]);
                        break;
                    }
                }
            } 
             else if (x==n[mid]) {
                  System.out.println( n[mid+1]);
                 
             }
             else if (x==n[h-1]) {
                  System.out.println( n[h-1]);
                 
             }
            
            
            else {
                for(int i=mid; i<n.length; i++) {
                    if (x>n[i] && x<n[i+1]) {
                        System.out.println( n[i+1]);
                        break;
                    }
                }
            }
            break;

        }

    }
}
