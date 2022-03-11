package edabit_challenges;
import java.util.ArrayList;
import java.util.Collections;
public class HardLevel {
    public static boolean isFactoriaol(int n) {
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = factoriaol(i);
        }
        for (int i : a)
            if (i == n) {
                return true;
            }
        return false;
    }

    public static int factoriaol(int n) {
        int m = 1;
        while (n != 1) {
            m = n * m;
            n--;
        }
        return m;
    }

    public static void mathabs() {
        int max1 = Integer.MIN_VALUE;
        System.out.println(max1);
        int n = -10, m = 4;
        int res = Math.abs(n - m);
        System.out.println(res);
    }

    public static boolean isHarshad(int n) {
        int num = 75;
        int x = num, y, sum = 0;
        while (x > 0) {
            y = x % 10;
            sum = sum + y;
            x = x / 10;
        }

        if (num % sum == 0)
            return true;
        else
            return false;
    }

    public static void isHappyNum(int n) {
        int x = n, rem = 0, sum = 0;
        int res = 0;
        while (x > 0) {
            rem = x % 10;
            sum += (rem * rem);
            x /= 10;
        }
        if (sum != 1 && sum != 4) {
            System.out.println(n + " happy number");
        } else {
            System.out.println(n + " is not happy number");
        }
    }
    public static String[] sortingNames(String[] names) {
        ArrayList<String> arr = new ArrayList<String>();
        for (String string : names) {
            arr.add(string);
        }
        Collections.sort(arr);
        Object[] a = arr.toArray();
        String[] nSa = new String[names.length];
     for(int i =0 ;i<names.length;i++){
         nSa[i] = a[i].toString();
     }
     return nSa;
    }
    public static void main(String[] args) {
        String[] a = sortingNames(
                new String[] { "The Platters", "A Yard of Yarn", "The Everly Brothers", "A Monster Effect", "The Sex Maggots" });
        for (String string : a) {
            System.out.print(string+", ");
        }
    }
}
