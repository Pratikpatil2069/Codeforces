package Codeforces_Round_1116_Div_2;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String str = sc.next();

            int even = countWays(str, 0);
            int odd = countWays(str, 1);

            System.out.println(even * odd);
        }
    }

    static int countWays(String str, int start) {

        int ways = 0;

        for (int first = 0; first <= 1; first++) {

            int expected = first;
            boolean valid = true;

            for (int i = start; i < str.length(); i += 2) {

                if (str.charAt(i) != '?' &&
                        str.charAt(i) - '0' != expected) {

                    valid = false;
                    break;
                }

                expected ^= 1;
            }

            if (valid) {
                ways++;
            }
        }

        return ways;
    }
}