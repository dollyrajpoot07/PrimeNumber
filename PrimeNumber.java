// Find number is prime or not.
//Input: 5
//Output: true

import java.util.*;

public class PrimeNumber {
    public static boolean primeNumber(int n) {
        int i = 2;
        boolean curCondition = false;
        // n>>1 : is used here for n/2
        // we use n<<1 for n*2
        while (i <= (n >> 1)) {
            if (n % i == 0) {
                curCondition = true;
                break;
            }
      ++i;
    }

        if(curCondition == false) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = primeNumber(n);
        System.out.println(result);
        sc.close();
    }
}