import java.util.* ;
public class Solution {
	public static String encode(String message) {
		int count=1;
		int n=message.length();
		StringBuilder encoded=new StringBuilder();
		for(int i=1;i<n;i++){
			if(message.charAt(i)==message.charAt(i - 1)){
				count++;
			}else{
				encoded.append(message.charAt(i - 1)).append(count);
				count=1;
			}
		}
		encoded.append(message.charAt(n - 1)).append(count);
		return encoded.toString();
	}
}
