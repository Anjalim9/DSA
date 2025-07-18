import java.util.* ;
public class Solution {
    public static void setZeros(int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean first_r=false;
        boolean first_c=false;
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                first_c=true;
            }
        }
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                first_r=true;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(first_r){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(first_c){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}
