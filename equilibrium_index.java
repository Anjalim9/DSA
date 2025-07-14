import java.util.* ;
import java.io.*; 
public class Solution {
	public static int arrayEquilibriumIndex(int[] arr){  
		int n=arr.length;
		int total=0,left=0;
		for(int num:arr){
			total+=num;
		}
		for(int i=0;i<n;i++){
			int right=total - left - arr[i];
			if(left==right){
				return i;
			}
			left+=arr[i];
		}
		return -1;
	}
}
