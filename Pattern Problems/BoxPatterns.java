public class BoxPatterns {

// Solid Box
static void solidBox(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

// Hollow Box
static void hollowBox(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int n = 5;

    System.out.println("Solid Box:");
    solidBox(n);

    System.out.println("\nHollow Box:");
    hollowBox(n);
}


}
