import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            int x;
            do {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                x = sc.nextInt();
                if (x < 0 || x > 100) {
                    System.out.println("Invalid score, try again.");
                }
            } while (x < 0 || x > 100);
            a[i] = x;
        }

        int passed = 0, failed = 0, sum = 0;
        System.out.print("Scores: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
            if (a[i] >= 60) passed++;
            else failed++;
        }
        System.out.println();

        double avg = (double) sum / a.length;
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + avg);
    }
}