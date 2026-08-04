package educational_round_191;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();


            long withoutAI = (n + (x + y) - 1) / (x + y);


            long finishDuringSetup = (n + x - 1) / x;

            long withAI;

            if (finishDuringSetup <= z) {
                withAI = finishDuringSetup;
            } else {
                long completed = x * z;
                long remaining = n - completed;

                long extraHours =
                        (remaining + (x + 10 * y) - 1) / (x + 10 * y);

                withAI = z + extraHours;
            }

            System.out.println(Math.min(withoutAI, withAI));
        }

        sc.close();
    }
}