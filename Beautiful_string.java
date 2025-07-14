import java.util.*;
public class Solution {
    public static int makeBeautiful(String str) {
        int count_for_0=0;
        int count_for_1=0;
        for(int i=0;i<str.length();i++){
            char expected_for_0=(i%2==0)?'0':'1';
            char expected_for_1=(i%2==0)?'1':'0';
            if(str.charAt(i)!=expected_for_0){
                count_for_0++;
            }
            if(str.charAt(i)!=expected_for_1){
                count_for_1++;
            }
        }
        return Math.min(count_for_0,count_for_1);
    }
}
