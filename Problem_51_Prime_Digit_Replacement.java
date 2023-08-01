import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem_51_Prime_Digit_Replacement {

    private static final boolean DEBUG = true;
    private static final int MAX = 10000000;
    private static final boolean[] SIEVE = new boolean[MAX + 1];
    private static final TreeSet<Integer> PRIMES = new TreeSet<Integer>();
    private static final ArrayList<Integer> PRIMES_CANDIDATE = new ArrayList<Integer>();
    private static final ArrayList<Integer> ANSWER = new ArrayList<Integer>();

    public static void main(String[] args) {
        generateData();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int start = (int) (Math.pow(10, N - 1));
        int end = (int) (Math.pow(10, N) - 1);
        for (int i : PRIMES) {
            if (i < start) {
                continue;
            } else if (i > end) {
                break;
            }
            PRIMES_CANDIDATE.add(i);
        }
        if (DEBUG) {
            System.out.println("start:" + start + " end:" + end);
            System.out.println("size:" + PRIMES_CANDIDATE.size());
        }
        int K = scanner.nextInt();
        int L = scanner.nextInt();
        switch (L) {
            case 1:
                ANSWER.add(PRIMES_CANDIDATE.get(0));
                break;
            case 2:
                getAnswerFor2(N, K);
                break;
            case 3:
                getAnswerFor3(N, K);
                break;
            case 4:
                getAnswerFor4(N, K);
                break;
            case 5:
                getAnswerFor5(N, K);
                break;
            case 6:
                getAnswerFor6(N, K);
                break;
            case 7:
                getAnswerFor7(N, K);
                break;
            case 8:
                getAnswerFor8(N, K);
                break;
        }
        scanner.close();
        for (int i : ANSWER) {
            System.out.print(i + " ");
        }
    }

    private static void getAnswerFor2(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (isSameFamily(n, k)) {
                    return;
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void getAnswerFor3(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (!isSameFamily(n, k)) {
                    ANSWER.remove(PRIMES_CANDIDATE.get(i2));
                    continue;
                }
                for (int i3 = i2 + 1; i3 < PRIMES_CANDIDATE.size(); i3++) {
                    ANSWER.add(PRIMES_CANDIDATE.get(i3));
                    if (isSameFamily(n, k)) {
                        return;
                    }
                    ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void getAnswerFor4(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (!isSameFamily(n, k)) {
                    ANSWER.remove(PRIMES_CANDIDATE.get(i2));
                    continue;
                }
                for (int i3 = i2 + 1; i3 < PRIMES_CANDIDATE.size(); i3++) {
                    ANSWER.add(PRIMES_CANDIDATE.get(i3));
                    if (!isSameFamily(n, k)) {
                        ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                        continue;
                    }
                    for (int i4 = i3 + 1; i4 < PRIMES_CANDIDATE.size(); i4++) {
                        ANSWER.add(PRIMES_CANDIDATE.get(i4));
                        if (isSameFamily(n, k)) {
                            return;
                        }
                        ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                    }
                    ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void getAnswerFor5(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (!isSameFamily(n, k)) {
                    ANSWER.remove(PRIMES_CANDIDATE.get(i2));
                    continue;
                }
                for (int i3 = i2 + 1; i3 < PRIMES_CANDIDATE.size(); i3++) {
                    ANSWER.add(PRIMES_CANDIDATE.get(i3));
                    if (!isSameFamily(n, k)) {
                        ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                        continue;
                    }
                    for (int i4 = i3 + 1; i4 < PRIMES_CANDIDATE.size(); i4++) {
                        ANSWER.add(PRIMES_CANDIDATE.get(i4));
                        if (!isSameFamily(n, k)) {
                            ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                            continue;
                        }
                        for (int i5 = i4 + 1; i5 < PRIMES_CANDIDATE.size(); i5++) {
                            ANSWER.add(PRIMES_CANDIDATE.get(i5));
                            if (isSameFamily(n, k)) {
                                return;
                            }
                            ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                        }
                        ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                    }
                    ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void getAnswerFor6(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (!isSameFamily(n, k)) {
                    ANSWER.remove(PRIMES_CANDIDATE.get(i2));
                    continue;
                }
                for (int i3 = i2 + 1; i3 < PRIMES_CANDIDATE.size(); i3++) {
                    ANSWER.add(PRIMES_CANDIDATE.get(i3));
                    if (!isSameFamily(n, k)) {
                        ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                        continue;
                    }
                    for (int i4 = i3 + 1; i4 < PRIMES_CANDIDATE.size(); i4++) {
                        ANSWER.add(PRIMES_CANDIDATE.get(i4));
                        if (!isSameFamily(n, k)) {
                            ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                            continue;
                        }
                        for (int i5 = i4 + 1; i5 < PRIMES_CANDIDATE.size(); i5++) {
                            ANSWER.add(PRIMES_CANDIDATE.get(i5));
                            if (!isSameFamily(n, k)) {
                                ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                                continue;
                            }
                            for (int i6 = i5 + 1; i6 < PRIMES_CANDIDATE.size(); i6++) {
                                ANSWER.add(PRIMES_CANDIDATE.get(i6));
                                if (isSameFamily(n, k)) {
                                    return;
                                }
                                ANSWER.remove(PRIMES_CANDIDATE.get(i6));
                            }
                            ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                        }
                        ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                    }
                    ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void getAnswerFor7(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (!isSameFamily(n, k)) {
                    ANSWER.remove(PRIMES_CANDIDATE.get(i2));
                    continue;
                }
                for (int i3 = i2 + 1; i3 < PRIMES_CANDIDATE.size(); i3++) {
                    ANSWER.add(PRIMES_CANDIDATE.get(i3));
                    if (!isSameFamily(n, k)) {
                        ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                        continue;
                    }
                    for (int i4 = i3 + 1; i4 < PRIMES_CANDIDATE.size(); i4++) {
                        ANSWER.add(PRIMES_CANDIDATE.get(i4));
                        if (!isSameFamily(n, k)) {
                            ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                            continue;
                        }
                        for (int i5 = i4 + 1; i5 < PRIMES_CANDIDATE.size(); i5++) {
                            ANSWER.add(PRIMES_CANDIDATE.get(i5));
                            if (!isSameFamily(n, k)) {
                                ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                                continue;
                            }
                            for (int i6 = i5 + 1; i6 < PRIMES_CANDIDATE.size(); i6++) {
                                ANSWER.add(PRIMES_CANDIDATE.get(i6));
                                if (!isSameFamily(n, k)) {
                                    ANSWER.remove(PRIMES_CANDIDATE.get(i6));
                                    continue;
                                }
                                for (int i7 = i6 + 1; i7 < PRIMES_CANDIDATE.size(); i7++) {
                                    ANSWER.add(PRIMES_CANDIDATE.get(i7));
                                    if (isSameFamily(n, k)) {
                                        for (int i : ANSWER) {
                                            System.out.print(i + " ");
                                        }
                                        System.out.println();
                                    }
                                    ANSWER.remove(PRIMES_CANDIDATE.get(i7));
                                }
                                ANSWER.remove(PRIMES_CANDIDATE.get(i6));
                            }
                            ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                        }
                        ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                    }
                    ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void getAnswerFor8(int n, int k) {
        for (int i1 = 0; i1 < PRIMES_CANDIDATE.size(); i1++) {
            ANSWER.add(PRIMES_CANDIDATE.get(i1));
            for (int i2 = i1 + 1; i2 < PRIMES_CANDIDATE.size(); i2++) {
                ANSWER.add(PRIMES_CANDIDATE.get(i2));
                if (!isSameFamily(n, k)) {
                    ANSWER.remove(PRIMES_CANDIDATE.get(i2));
                    continue;
                }
                for (int i3 = i2 + 1; i3 < PRIMES_CANDIDATE.size(); i3++) {
                    ANSWER.add(PRIMES_CANDIDATE.get(i3));
                    if (!isSameFamily(n, k)) {
                        ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                        continue;
                    }
                    for (int i4 = i3 + 1; i4 < PRIMES_CANDIDATE.size(); i4++) {
                        ANSWER.add(PRIMES_CANDIDATE.get(i4));
                        if (!isSameFamily(n, k)) {
                            ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                            continue;
                        }
                        for (int i5 = i4 + 1; i5 < PRIMES_CANDIDATE.size(); i5++) {
                            ANSWER.add(PRIMES_CANDIDATE.get(i5));
                            if (!isSameFamily(n, k)) {
                                ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                                continue;
                            }
                            for (int i6 = i5 + 1; i6 < PRIMES_CANDIDATE.size(); i6++) {
                                ANSWER.add(PRIMES_CANDIDATE.get(i6));
                                if (!isSameFamily(n, k)) {
                                    ANSWER.remove(PRIMES_CANDIDATE.get(i6));
                                    continue;
                                }
                                for (int i7 = i6 + 1; i7 < PRIMES_CANDIDATE.size(); i7++) {
                                    ANSWER.add(PRIMES_CANDIDATE.get(i7));
                                    if (!isSameFamily(n, k)) {
                                        ANSWER.remove(PRIMES_CANDIDATE.get(i7));
                                        continue;
                                    }
                                    for (int i8 = i7 + 1; i8 < PRIMES_CANDIDATE.size(); i8++) {
                                        ANSWER.add(PRIMES_CANDIDATE.get(i8));
                                        if (isSameFamily(n, k)) {
                                            return;
                                        }
                                        ANSWER.remove(PRIMES_CANDIDATE.get(i8));
                                    }
                                    ANSWER.remove(PRIMES_CANDIDATE.get(i7));
                                }
                                ANSWER.remove(PRIMES_CANDIDATE.get(i6));
                            }
                            ANSWER.remove(PRIMES_CANDIDATE.get(i5));
                        }
                        ANSWER.remove(PRIMES_CANDIDATE.get(i4));
                    }
                    ANSWER.remove(PRIMES_CANDIDATE.get(i3));
                }
                ANSWER.remove(PRIMES_CANDIDATE.get(i2));
            }
            ANSWER.remove(PRIMES_CANDIDATE.get(i1));
        }
    }

    private static void generateData() {
        SIEVE[0] = false;
        SIEVE[1] = false;
        for (int i = 2; i <= MAX; i++) {
            SIEVE[i] = true;
        }
        for (int i = 4; i <= MAX; i += 2) {
            SIEVE[i] = false;
        }
        for (int i = 3; i * i <= MAX; i++) {
            if (!SIEVE[i]) {
                continue;
            }
            if (isPrime(i)) {
                for (int j = i * 2; j < MAX; j += i) {
                    SIEVE[j] = false;
                }
            }
        }
        for (int i = 0; i < MAX; i++) {
            if (SIEVE[i]) {
                PRIMES.add(i);
            }
        }
    }

    private static boolean isPrime(long i) {
        if (i < 2) {
            return false;
        } else if (i == 2 || i == 3) {
            return true;
        } else if ((i & 1) != 1) {
            return false;
        }
        long j = 3;
        while (j <= Math.sqrt(i)) {
            if (i % j == 0) {
                return false;
            }
            j += 2;
        }
        return true;
    }

    private static boolean isSameFamily(int n, int k) {
        int count = 0;
        int pow = 0;
        int divisor = 1;
        int prev;
        Set<Integer> digits = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            boolean isSame = true;
            prev = (ANSWER.get(0) / divisor) % 10;
            for (int i2 = 1; i2 < ANSWER.size(); i2++) {
                int p = ANSWER.get(i2);
                int digit = (p / divisor) % 10;
                if (prev != digit) {
                    digits.add(pow);
                    isSame = false;
                    break;
                }
            }
            pow++;
            divisor = (int) Math.pow(10, pow);
            if (isSame) {
                count++;
            }
        }
        if (count != (n - k)) {
            return false;
        }
        for (int i = 0; i < ANSWER.size(); i++) {
            int defaultValue = -1;
            for (int d : digits) {
                divisor = (int) Math.pow(10, d);
                int digit = (ANSWER.get(i) / divisor) % 10;
                if (defaultValue == -1) {
                    defaultValue = digit;
                } else if (defaultValue != digit) {
                    return false;
                }
            }
        }

        return true;
    }

}