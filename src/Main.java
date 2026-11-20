public class Main {
    public static void main(String[] args) {
        int[] a = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
        int pos = 0, neg = 0, zero = 0;

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] > 0) pos++;
            else if (a[i] < 0) neg++;
            else zero++;
        }
        System.out.println();
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}