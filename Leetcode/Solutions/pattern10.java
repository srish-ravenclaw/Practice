// * 
// * * 
// * * * 
// * * * * 
// * * * * *
// * * * *
// * * *
// * *
// *

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0 ; i<(2*n - 1) ; i++) {
            int numberOfStars;
            if(i<n) {
                numberOfStars = i + 1;
            } else {
                numberOfStars = 2*n - i - 1;
            }
            for(int j=0 ; j<numberOfStars ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
