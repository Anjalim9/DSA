import java.util.* ;
public class Solution {
	public static int minimumParentheses(String pattern) {
		int open=0;
		int close=0;
		for(char ch : pattern.toCharArray()){
			if(ch=='('){
				open++;
			}else{
				if(open>0){
					open--;;
				}else{
					close++;
				}
			}
		}
		return open+close;
	}
}
