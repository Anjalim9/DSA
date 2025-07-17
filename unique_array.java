import java.util.* ;
public class Solution {
	public static int minElementsToRemove(ArrayList<Integer> arr) {
		int n=arr.size();
		HashSet<Integer> freq=new HashSet<>();
		int count=0;
		for(int i:arr){
			if(freq.contains(i)){
				count++;
			}
			else{
				freq.add(i);
			}
		}
		return count;
	}
}
