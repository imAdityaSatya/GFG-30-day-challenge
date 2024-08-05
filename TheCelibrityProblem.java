

// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int index = 0;
        int n = mat.length;
        // int cnt = 0;
        for(int i=1; i<n; i++) {
            if(mat[index][i] == 1) {
                index = i;
            }
        }
        for(int i=0; i<n; i++) {
            if(i != index) {
                if(mat[index][i]==1 || mat[i][index]==0) {
                    return -1;
                }
            }
        }
        return index;
    }
}
