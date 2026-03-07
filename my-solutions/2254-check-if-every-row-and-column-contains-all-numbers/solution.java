import java.util.HashSet;
class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer> h1=new HashSet<>();
            HashSet<Integer> h2=new HashSet<>();
            for(int j=0;j<matrix[0].length;j++){
                if(!h1.add(matrix[i][j])) return false;
                if(!h2.add(matrix[j][i])) return false; 
            }
        }
        return true;
    }

}
