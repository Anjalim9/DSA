import java.util.* ;
public class Solution {
	public static void inplaceRotate(int[][] arr, int n) {
		n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=i + 1;j<n;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int j=0;j<n;j++){
			int top=0,bottom=n - 1;
			while(top<bottom){
				int temp=arr[top][j];
				arr[top][j]=arr[bottom][j];
				arr[bottom][j]=temp;
				top++;
				bottom--;
			}
		}
	}
}
