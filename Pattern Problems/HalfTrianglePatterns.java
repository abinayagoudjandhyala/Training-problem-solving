public class HalfTrianglePatterns {

// Number Increasing Triangle
static void numberTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

// Continuous Number Triangle
static void continuousNumberTriangle(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
}

//  Alphabet Triangle
static void alphabetTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < i; j++) {
            char ch = (char) ('A' + j);
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}

// Star Half Triangle
static void starTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int n = 5;

    System.out.println("Number Triangle:");
    numberTriangle(n);

    System.out.println("\nContinuous Number Triangle:");
    continuousNumberTriangle(n);

    System.out.println("\nAlphabet Triangle:");
    alphabetTriangle(n);

    System.out.println("\nStar Triangle:");
    starTriangle(n);
}

}
