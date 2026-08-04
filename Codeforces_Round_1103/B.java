package Codeforces_Round_1103;

import java.util.Arrays;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            char[]arr=str.toCharArray();
            boolean flag = true;

            for(int start = 0; start < k; start++) {
                int count = 0;

                for(int i = start; i < n; i += k) {
                    if(arr[i] == '1') {
                        count++;
                    }
                }

                if(count % 2 != 0) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");

        }
        sc.close();

    }

}
