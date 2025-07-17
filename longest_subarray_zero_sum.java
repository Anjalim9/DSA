import java.util.* ;
public class Solution {
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int n=arr.size();
		int sum=0,max=0;
		for(int i=0;i<n;i++){
			sum+=arr.get(i);
			if(sum==0){
				max=i + 1;
			}
			if(map.containsKey(sum)){
				int index=map.get(sum);
				max=Math.max(max,i - index);
			}else{
				map.put(sum,i);
			}
		}
		return max;
	}
}
