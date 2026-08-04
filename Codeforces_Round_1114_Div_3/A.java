package Codeforces_Round_1114_Div_3;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int arr[]=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0]){
                System.out.println(0);
            }else{
                System.out.println(Math.min(arr[2]-arr[1],arr[1]-arr[0]));
            }
        }
    }
}
