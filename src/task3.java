public class task3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        System.out.println();

        double avg = (double) sum / a.length;
        System.out.println("Average: " + avg);

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg) count++;
        }
        System.out.println("Numbers above average: " + count);
    }
}