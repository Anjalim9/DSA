import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int firstMax=Integer.MIN_VALUE;
    int secMax=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]>firstMax){
        secMax=firstMax;
        firstMax=arr[i];
      }else if(arr[i]>secMax && arr[i]!=firstMax){
        secMax=arr[i];
      }
    }
    if(secMax==Integer.MIN_VALUE){
        System.out.print("no such element");
    }else{
        System.out.print(secMax);
    }
  }
}  
