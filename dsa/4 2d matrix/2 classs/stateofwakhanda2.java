import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int gap=0;gap<n;gap++){
            for(int i=0;i<n-gap;i++){
                int j=i+gap;
                System.out.println(arr[i][j]);
            }
        }
    }

}