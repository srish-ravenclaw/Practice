// * * * * *
// * * * * 
// * * * 
// * *  
// *

class Solution {

    void printTriangle(int n) {
        // code here
        int temp = n;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<temp ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            temp--;
        }
    }
}
