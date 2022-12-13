//Diamond Shape

class Solution {

    void printDiamond(int n) {
        // Your code here
        for(int i=0; i<2*n ; i++) {
            int numberOfSpaces, numberOfStars;
            if(i<n) {
                numberOfSpaces = n-i-1;
                numberOfStars = i+1;
            } else {
                numberOfSpaces = i - n;
                numberOfStars = 2*n - i;
            }
            for(int j=0 ; j<(numberOfSpaces + numberOfStars) ; j++) {
                if(j<numberOfSpaces) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
