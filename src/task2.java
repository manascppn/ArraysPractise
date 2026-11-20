public class task2 {
    public static void main(String[] args) {
        int[] a = {12, 5, 28, 3, 19, 7, 15, 9};
        int max = a[0], maxIdx = 0;
        int min = a[0], minIdx = 0;

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIdx = i;
            }
        }
        System.out.println();
        System.out.println("Largest: " + max + " at index " + maxIdx);
        System.out.println("Smallest: " + min + " at index " + minIdx);
    }
}