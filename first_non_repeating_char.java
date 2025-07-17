import java.util.* ;
public class Solution {
	public static char firstNonRepeatingCharacter(String str) {
		HashMap<Character, Integer> map=new HashMap<>();
		for(char ch:str.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0) + 1);
		}
		for(char ch:str.toCharArray()){
			if(map.get(ch)==1){
				return ch;
			}
		}
		return str.charAt(0);
	}
}
