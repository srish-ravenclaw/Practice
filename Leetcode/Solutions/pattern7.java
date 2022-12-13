//     *
//    ***  
//   *****
//  *******
// *********

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0 ; i<n ; i++) {
            int numberOfStars = 2*i + 1;
            int numberOfSpaces = n - i - 1;
            for(int j=0 ; j<numberOfStars + numberOfSpaces ; j++) {
                if(j<numberOfSpaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
