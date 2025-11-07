public class PatternDemo {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Right Triangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nInverted Triangle Pattern:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nRectangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
