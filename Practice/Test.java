package Practice;

import java.util.Arrays;a

public class Test {
    public static void main(String[] args) {
       
    }

    public static int factorial(int n) {

        if (n == 1) {
            return n;
        }
        return (n * factorial(n - 1));
    }

    void binarySearch() {
        int[] a = { 10, 20, 30, 40, 50 };
        int key = 20;
        int result = Arrays.binarySearch(a, key);
        if (result != -1)
            System.out.println("The element is found at Index " + result);
        else
            System.out.println("The element is not found");
    }

    void exceptionDemo() {
        int count = 0;
        try {
            /*
             * File a = new File("C:/Users/knare/Files/Upgard/JAVA/demo/demo.txt");
             * FileWriter n = new FileWriter(a);
             * n.write("Hi this is naresh");
             * n.close();
             * System.out.println("submitted");
             * Scanner sc = new Scanner(a);
             * while (sc.hasNext()) {
             * System.out.println(sc.next());
             * }
             */
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println(arr[10]);
            try {
                int[] a = { 0 };
                System.out.println(a.length);
            } catch (NullPointerException e) {
                System.out.println(++count + " NullPointerException " + e);
            }
            try {
                String st = "avd";
                System.out.println(st.charAt(6));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(++count + " StringIndexOutOfBoundsException " + e);
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(++count + " ArrayIndexOutOfBoundsException " + e);
        }

        finally {
            System.out.println("The Finally block is executed");
        }

    }

    public static void commentExcute() {
        // THe Below Comment is going to execute
        // \u000d
        System.out.println("Comment has Excuted");
    }

    public static void assci() {
        System.out.println("-----------------------------------------------");
        System.out.println("\tAssci numbers\t Assci Values");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i <= 90; i++) {
            System.out.println("|\t\t" + i + "\t\t" + (char) i + "\t|");
        }
        System.out.println("-----------------------------------------------");
    }

    public static int heartBeatCount(int day) {
        int daysInHours = day * 24 * 60;
        int count = daysInHours * 72;
        return count;
    }
}
