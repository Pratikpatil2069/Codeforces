package Codeforces_Round_1103;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<size;i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int num1=arr[0];
            int num2=arr[arr.length-1];
            int ans=num2-num1+1;
            System.out.println(ans);
        }
        sc.close();
    }


}
