

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimeInRange {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;

        for (int i = 0; i < primes.size() - 1; i++) {
            int first = primes.get(i);
            int second = primes.get(i + 1);
            int diff = second - first;

            if (diff < minDiff) {
                minDiff = diff;
                num1 = first;
                num2 = second;
            }
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 19;

        int[] ans = closestPrimes(left, right);
        System.out.println(Arrays.toString(ans));
    }
}