package Codeforces_Round_1114_Div_3;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int count = 1;
            for (int i = 0; i < n - 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    count++;
                }
            }

            int ans = count;

            for (int i = 1; i < n - 1; i++) {
                char left = str.charAt(i - 1);
                char mid = str.charAt(i);
                char right = str.charAt(i + 1);

                if (left == right && mid != left) {
                    ans = Math.min(ans, count - 2);
                } else if (mid != left && mid != right) {
                    ans = Math.min(ans, count - 1);
                }
            }

            System.out.println(ans);
        }
    }
}
