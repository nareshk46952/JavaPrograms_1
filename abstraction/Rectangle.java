package abstraction;
import java.util.*;

public class Rectangle extends Shape {
    int sides() {
        return 4;
    }

    String name() {
        return "Rectangle";
    }

    public static void main(String[] args) {
        deletionElement();
    }

    public static void inpArr() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int size = s.nextInt();
            int[] a = new int[size];
            System.out.println("Enter " + size + " telements");
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            System.out.println("THe number in an array is repeated " + numberOfTimes(a) + " times");
        }
    }

    public static int maxArr(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static int sumOfArrays(int[] a) {
        int sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        return sum;
    }

    public static void evenAndOdd(int[] a) {
        // int[] b = new int[a.length];
        System.out.println("\tEven Numbers");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }
        System.out.println("\tOdd Numbers");
        oddArr(a);
    }

    public static void oddArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                System.out.println(a[i]);
        }
    }

    public static void reverseArr(int[] a) {
        int temp = 0;
        System.out.println("Printing all elements before array ");
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Printing all elements after array ");
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
            System.out.println(a[i]);
        }
    }

    public static int minNum(int[] a) {
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            min = a[0];
            if (min > a[i])
                min = a[i];
        }
        return min;
    }

    public static int numberOfTimes(int[] a) {
        int num = 10, count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num)
                count++;
        }
        return count;
    }

    public static void sumOfTwoArrys() {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 2, 4, 6, 8, 10 };
        int[] c = new int[100];
        for (int i = 0; i < c.length; i++) {
            c[i] = arr1[i] + arr2[i];
        }
        for (int i : c) {
            System.out.println(i);
        }
    }

    public static void addingElements() {
        try (Scanner s = new Scanner(System.in)) {
            int[] a = new int[10];
            int pos, num;
            int size = 5;
            System.out.println("Enter " + size + " elements");
            for (int i = 0; i < size; i++) {
                a[i] = s.nextInt();
            }
            System.out.println("Enter the Number do you want add ");
            num = s.nextInt();
            System.out.println("Enter the Position");
            pos = s.nextInt();
            for (int i = size; i > pos; i--) {
                a[i] = a[i - 1];
            }
            a[pos] = num;
            size++;
            System.out.println("Printing New Array");
            for (int i : a) {
                System.out.println(i);
            }
        }
    }

    public static void deletionElement() {
        try (Scanner s = new Scanner(System.in)) {
            int[] a = new int[10];
            int num, i;
            System.out.print("Enter the size :");
            int size = s.nextInt();
            System.out.println("Enter " + size + " Elements");
            for (i = 0; i < size; i++) {
                a[i] = s.nextInt();
            }
            System.out.print("Enter the number to delete: ");
            num = s.nextInt();
            for (i = 0; i < size; i++) {
                if (a[i] == num) {
                    break;
                }
            }
            for (int j = i; j < size; j++) {
                a[j] = a[j + 1];
            }
            size--;
            for (int j = 0; j < size; j++) {
                System.out.println(a[j]);
            }
        }
        catch(Exception e){
            System.out.println("The Error is "+e);
        }
    }
}
