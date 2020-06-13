package stupidity;

public class NumberFun {

    public static boolean isNiven(int n) {

        int nw = n, s = 0, d = 0;

        while (nw > 0) {

            d = nw % 10;
            s += d;
            nw /= 10;

        }

        if (n % s == 0)
            return true;
        else
            return false;

    }

    public static boolean isDuck(int n) {

        int nw = n, d = 0, f = 0, r = 0, dr = 0, c = 0;

        while (nw > 0) {

            dr = nw % 10;
            r = r * 10 + dr;
            nw /= 10;

        }

        nw = r;

        while (nw > 0) {

            d = nw % 10;
            c++;
            if (c == 1 && d == 0)
                break;
            if (d == 0 && c > 1) {

                f = 1;
                break;

            }

            nw = nw / 10;

        }
        if (f == 1)
            return true;
        else
            return false;

    }

    public static boolean isPronic(int n) {

        int i, p, f = 0;

        for (i = 1; i <= n; i++) {

            p = i * (i + 1);
            if (p == n) {

                f = 1;
                break;

            }

        }
        if (f == 1)
            return true;
        else
            return false;

    }

    public static boolean isTwistedPrime(int n) {

        int nw = n, d = 0, r = 0, c1 = 0, c2 = 0, i;
        while (nw > 0) {
            d = nw % 10;
            r = r * 10 + d;
            nw /= 10;
        }
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                c1++;
        }
        for (i = 1; i <= r; i++) {
            if (r % i == 0)
                c2++;
        }
        if (c1 == 2 && c2 == 2)
            return true;
        else
            return false;

    }

    public static boolean areTwinPrime(int n, int m) {

        int d, i, c1 = 0, c2 = 0, j;
        d = Math.abs(n - m);
        if (d == 2) {
            for (i = 1; i <= n; i++) {

                if (n % i == 0)
                    c1++;

            }
            for (j = 1; j <= m; j++) {

                if (m % j == 0)
                    c2++;

            }
        }
        if (c1 == 2 && c2 == 2)
            return true;
        else
            return false;

    }

    public static boolean isMagic(int n) {

        int s = n, d = 0, nw = 0;
        while (s > 9) {
            nw = s;
            s = 0;
            while (nw > 0) {

                d = nw % 10;
                s = s + d;
                nw /= 10;

            }
        }
        if (s == 1)
            return true;
        else
            return false;

    }

    public static boolean isHappy(int n) {

        int s = n, d = 0, nw = 0;
        while (s > 9) {
            nw = s;
            s = 0;
            while (nw > 0) {

                d = nw % 10;
                s = s + d * d;
                nw /= 10;

            }
        }
        if (s == 1)
            return true;
        else
            return false;

    }

    public static boolean isAbundant(int n) {

        int i, s = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0)
                s = s + i;
        }
        if (s > n)
            return true;
        else
            return false;

    }

    public static boolean isHoax(int n) {

        int nw = n, i, j, sn = 0, sp = 0, dn = 0, dp = 0, c = 0, k = 0, p = 0;
        while (nw > 0) {

            dn = nw % 10;
            sn = sn + dn;
            nw /= 10;

        }
        for (i = 2; i < n; i++) {

            if (n % i == 0) {

                c = 0;
                p = 0;
                k = i;

                for (j = 1; j <= k; j++) {

                    if (k % j == 0)
                        c++;

                }
                if (c == 2) {

                    p = j - 1;

                    while (p > 0) {

                        dp = p % 10;
                        sp = sp + dp;
                        p /= 10;

                    }
                }
            }
        }
        if (sn == sp)
            return true;
        else
            return false;

    }

    public static boolean isDisarium(int n) {

        int nw = n, r = 0, dr = 0, d = 0, c = 0, s = 0;

        while (nw > 0) {

            dr = nw % 10;
            r = r * 10 + dr;
            nw /= 10;

        }
        while (r > 0) {

            d = r % 10;
            c++;
            s = s + (int) Math.pow(d, c);
            r /= 10;

        }

        if (s == n)
            return true;
        else
            return false;

    }

    public static boolean isEvil(int n) {

        int nw = n, d, i, l, c = 0;
        String b = "";
        char ch;

        while (nw > 0) {

            d = nw % 2;
            b = Integer.toString(d) + b;
            nw = nw / 2;

        }

        l = b.length();

        for (i = 0; i < l; i++) {

            ch = b.charAt(i);
            if (ch == '1')
                c++;

        }
        if (c % 2 == 0)
            return true;
        else
            return false;

    }

    public static boolean isKeith(int n) {

        int i, j, c = 0, s = 0, f = 0, k = 0, d = 0, r = 0;
        int nw = n;

        while (nw > 0) {

            d = nw % 10;
            r = r * 10 + d;
            nw /= 10;

        }

        nw = r;

        while (nw > 0) {

            c++;
            nw /= 10;

        }

        nw = r;

        int a[] = new int[c];

        for (i = 0; i < c; i++) {

            a[i] = nw % 10;
            nw /= 10;

        }

        nw = r;

        while (true) {

            for (i = 0; i < c; i++) {

                s = s + a[i];

            }
            for (i = 0; i < c; i++) {

                if (i == c - 1)
                    a[i] = s;
                else
                    a[i] = a[i + 1];

            }
            if (s == n) {

                k = 1;
                break;

            }
            if (s > n)
                break;

            s = 0;
        }

        if (k == 1)
            return true;
        else
            return false;

    }

    public static boolean isArmstrong(int n) {

        int nw = n, s = 0, d = 0;

        while (nw > 0) {

            d = nw % 10;
            s += d * d * d;
            nw /= 10;

        }

        if (s == n)
            return true;
        else
            return false;

    }

    public static boolean isBuzz(int n) {

        int nw = n;

        if (nw % 7 == 0 || nw % 10 == 7)
            return true;
        else
            return false;

    }

    public static boolean isSpecial(int n) {

        int nw = n, i = 0, d = 0, f = 1, s = 0;

        while (nw > 0) {

            d = nw % 10;

            for (i = 1; i <= d; i++)
                f = f * i;

            s += f;
            f = 1;
            nw /= 10;

        }

        if (s == n)
            return true;
        else
            return false;

    }

    public static boolean isPerfect(int n) {

        int s = 0, i = 0;

        for (i = 1; i < n; i++) {

            if (n % i == 0)
                s += i;

        }

        if (s == n)
            return true;
        else
            return false;

    }

    public static boolean isTriangle(int n) {

        int nw = n, s = 0, i = 0, f = 0;

        for (i = 0; i < n; i++) {

            s += i;
            if (s == n) {
                f = 1;
                break;
            }
        }
        if (f == 1)
            return true;
        else
            return false;

    }

    public static int getFactorial(int n) {

        int factorial = 1;

        for (int j = 1; j <= n; j++) {

            factorial = factorial * j;

        }

        return factorial;

    }

}
