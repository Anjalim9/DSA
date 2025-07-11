import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    k=k%n;
    reverse(arr,0,n - 1);
    reverse(arr,0,k - 1);
    reverse(arr,k,n - 1);
    for(int num:arr){
        System.out.print(num+" ");
    }
  }
  static void reverse(int[] arr,int st,int end){
      while(st<end){
          int temp=arr[st];
          arr[st]=arr[end];
          arr[end]=temp;
          st++;
          end--;
      }
  }
}
