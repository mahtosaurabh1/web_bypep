import java.io.*;
import java.util.*;

public class rotatearray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

     public static void rotate(int[] a, int k){
    // write your code here
      k = k%a.length;
    if(k<0){
      k =k +a.length;
    }

    int temp[]=new int[a.length];
    int j=0;
    for(int i=a.length-k;i<a.length;i++){
         temp[j]=a[i];
         j++;
    }

    for(int i=0;i<a.length-k;i++){
         temp[j]=a[i];
         j++;
    }

     for(int i=0;i<a.length;i++){
       a[i]=temp[i];
     }
     

  }
    
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}

/*
public static void reverse(int[] a,int i,int j){
    // write your code here
  
    while(i<=j){
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      i++;
      j--;
    }

  }
  public static void rotate(int[] a, int k){
    // write your code here

    k= k%a.length;
    if(k<0){
      k = k+a.length;
    }

    reverse(a,0,a.length-1-k);
    reverse(a,a.length-k,a.length-1);
    reverse(a,0,a.length-1);

  }





*/