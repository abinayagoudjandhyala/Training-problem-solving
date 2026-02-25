public class MountainPatterns {

//  Simple Mountain
static void printMountain(int n) {
    for (int i = 0; i < n; i++) {

        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        for (int k = 0; k <= i; k++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}

//  Full Pyramid
static void straightMountain(int n) {
    for (int i = 0; i < n; i++) {

        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

//  Reverse Pyramid
static void reverseMountain(int n) {
    for (int i = n - 1; i >= 0; i--) {

        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

public static void main(String[] args) {
    int n = 5;

    System.out.println("Simple Mountain:");
    printMountain(n);

    System.out.println("\nFull Pyramid:");
    straightMountain(n);

    System.out.println("\nReverse Pyramid:");
    reverseMountain(n);
}


}
