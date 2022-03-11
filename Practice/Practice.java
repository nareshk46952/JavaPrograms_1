package Practice;
import java.util.Arrays;

public class Practice {
    public static String swapNames() {
        String name = "kuruva Padamavathi";
        int space = name.indexOf(" ");
        int fChIndex = space + 1;
        String firstName = name.substring(fChIndex);
        String lastName = name.substring(0, space);
        String finalName = firstName + name.charAt(space) + lastName;
        return finalName;
    }

    public static String stuttering(String s) throws StringIndexOutOfBoundsException {
        String sLower = s.toLowerCase();
        String dotsWithSpace = "... ";
        String charcters = sLower.substring(sLower.indexOf(sLower.charAt(0)), sLower.indexOf(sLower.charAt(2)));
        String chsDotsWithSpace = charcters + dotsWithSpace;
        String finalStr = "" + chsDotsWithSpace + chsDotsWithSpace + sLower + "?";
        if (sLower.equals("accountable")) {
            finalStr = "" + sLower.charAt(0) + sLower.charAt(1) + dotsWithSpace + sLower.charAt(0) + sLower.charAt(1)
                    + dotsWithSpace + sLower + "?";
        }
        return finalStr;
    }

    public static int arthematicOperation(int num1, char operator, int num2) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '/') {
            return num1 / num2;
        } else if (operator == '*') {
            return num1 * num2;
        }
        return 0;
    }

    public static int differences(int[] a) {
        int num = 0, max = 0, min = 0, result = 0;
        for (int i = 0; i < a.length; i++) {
            num = a[i];// 10
            for (int j = 0; j < a.length; j++) {
                if (a[j] > num)
                    num = a[j];
                max = num;
            }
        }
        for (int i = 0; i < a.length; i++) {
            num = a[0];// 1
            for (int j = 0; j < a.length; j++) {
                if (a[j] < num)
                    num = a[j];
                min = num;
            }
        }
        result = max;
        return result;
    }

    public static float percantage(int origianlValue, int discount) {
        float a = (float) discount / 100;
        float discountAmount = origianlValue * a;
        float finalAmount = origianlValue - discountAmount;
        return finalAmount;
    }

    public static int trueCountes(boolean[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == true) {
                count++;
            }
        }
        return count;
    }

    public static boolean exitstsHigher(int[] a, int num) {
        for (int i : a) {
            if (i >= num)
                return true;
        }
        return false;
    }

    public static String reverseString(final String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            s += ch;
        }
        return s;
    }

    public static int arthmatic(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                if (num2 == 0) {
                    result = 0;
                }
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "%":
                result = num1 % num2;
                break;
        }
        return result;
    }

    public static int highestPaid(int a, int b, int c) {
        /* a=10,b=8,c=15 */
        int res = 0;
        int min = (a < b ? (a < c ? a : c) : (b < c) ? b : c);
        int res2 = (a > b) ? (a > c ? a : c) : (b > c) ? b : c;
        return min;
    }

    public static int wordCount() {
        String s = "hi this is naresh";
        String[] newS = s.split(" ");
        return newS.length;
    }

    public static String convertingFromInttoString() {
        int[] num = { 8, 9, 7, 7, 7, 4, 6, 9, 5, 2 };
        String nArr = Arrays.toString(num);
        String nA = nArr.replace('[', '(');
        String nAa = nA.replace(", ", "");
        String threeCha = nAa.substring(0, 4) + ") ";
        String rem = nAa.replace("]", "").substring(4);
        String finalS = threeCha.concat(rem);
        String iPh = "-" + finalS.substring(finalS.indexOf("6"));
        String iPhRem = "(" + finalS.substring(finalS.indexOf("8"), finalS.indexOf("6")).concat(iPh);

        return iPhRem;
    }

    public static boolean rooks() {
        String[] s = { "A8", "C7" };
        System.out.println(s[0]);
        String s1 = s[0].substring(0, 1);
        boolean s1C = s1.equals(s[1].substring(0, 1));
        String s2 = s[0].substring(1, 2);
        boolean s2C = s2.equals(s[1].substring(1, 2));
        if (s1C || s2C) {
            return true;
        }
        return false;
    }

    public static String leftAndRight() {
        String left = "naresh";
        String right = "kuruva";
        String firstStr = left.substring(0, 1).toUpperCase().concat(left.substring(1));
        return firstStr.concat(right);
    }

    public static String repeatingCha() {
        String r = "String";
        String finalStr = "";
        for (int i = 0; i < r.length(); i++) {
            String r1 = r.substring(i, i + 1) + r.charAt(i);
            finalStr += r1;
        }
        return finalStr;
    }

    public static String boom() {
        String numbers = "";
        int[] a = { 85, 75, 15, 24, 69, 67 };
        for (int i = 0; i < a.length; i++) {
            numbers += a[i];
        }
        if (numbers.contains("7")) {
            numbers = "boom!";
        } else {
            numbers = "there is no 7 in the number";
        }
        return numbers;
    }

    public static boolean consectutive(int[] arr) {
        int n = arr.length;
        if (n < 1)
            return false;

        /* 1) Get the minimum element in array */
        int min = getMin(arr, n);

        /* 2) Get the maximum element in array */
        int max = getMax(arr, n);

        /* 3) max - min + 1 is equal to n, then only check all elements */
        if (max - min + 1 == n) // 19-11 = 8+1 = 9
        {
            /*
             * Create a temp array to hold visited flag of all elements.
             * Note that, calloc is used here so that all values are initialized
             * as false
             */
            boolean visited[] = new boolean[n];
            int i;
            for (i = 0; i < n; i++) {
                /* If we see an element again, then return false */
                if (visited[arr[i] - min] != false)
                    return false;

                /* If visited first time, then mark the element as visited */
                visited[arr[i] - min] = true;
            }

            /* If all elements occur once, then return true */
            return true;
        }
        return false; // if (max - min + 1 != n)
    }

    /* UTILITY FUNCTIONS */
    public static int getMin(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
       public static void main(String[] args) {
    
    }

}/*
  * enduring
  * accountable
  * gorgeous
  */
