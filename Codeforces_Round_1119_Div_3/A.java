package Codeforces_Round_1119_Div_3;

import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int count=0;
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            for(int i=0;i<n;i=i+k){
                String s=str.substring(i,i+k);
                boolean flag=true;
                for(int j=0;j<k;j++){
                    if(s.charAt(j)=='0'){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
