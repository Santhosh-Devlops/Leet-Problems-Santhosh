import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if (Arrays.deepEquals(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++)
            for(int j=i+1; j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        for(int[] row:mat)
            for(int j=0;j<n/2;j++){
                int temp=row[j];
                row[j]=row[n-1-j];
                row[n-1-j]=temp;
            }
    }
}

