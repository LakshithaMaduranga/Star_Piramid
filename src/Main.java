public class Main {
    public static void starMethod1() {
        for (int i = 0; i <= 5; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
    }

    public static void starMethod2() {
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        starMethod1();

        starMethod2();
    }
}
