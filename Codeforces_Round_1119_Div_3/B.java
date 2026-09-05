package Codeforces_Round_1119_Div_3;
import java.util.*;
public class B {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int odd = 0;
                int mod0 = 0;
                int mod2 = 0;

                for (int i = 0; i < n; i++) {

                    int x = sc.nextInt();

                    if (x % 2 == 1) {
                        odd++;
                    }
                    else if (x % 4 == 0) {
                        mod0++;
                    }
                    else {
                        mod2++;
                    }
                }

                System.out.println(Math.max(odd, Math.max(mod0, mod2)));
            }

            sc.close();
        }
    }

