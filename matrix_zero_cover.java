import java.util.* ;
public class Solution {
	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		int sum=0;
		int r=mat.size();
		int c=mat.get(0).size();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				int count=0;
				if(mat.get(i).get(j)==0){
					if(i>0 && mat.get(i - 1).get(j)==1) count++;
					if(i<r - 1 && mat.get(i + 1).get(j)==1) count++;
					if(j>0 && mat.get(i).get(j - 1)==1) count++;
					if(j<c - 1 && mat.get(i).get(j + 1)==1) count++;
					sum+=count;
				}
			}
		}
		return sum;
	}
}
