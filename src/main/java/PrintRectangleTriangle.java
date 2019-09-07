import java.util.Scanner;

public class PrintRectangleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles rectangle");
            System.out.println("0. Exit");
            System.out.println("Choice a number: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the width of rectangle: ");
                    int width = scanner.nextInt();
                    System.out.println("Enter the height of rectangle: ");
                    int height = scanner.nextInt();
                    printRectangle(width, height);
                    break;
                case 2:
                    System.out.println("Enter the width of bottom edge of triangle: ");
                    int bottomEdge = scanner.nextInt();
                    printSquareTriangle(bottomEdge);
                    break;
                case 3:
                    System.out.println("Enter the width of bottom edge of triangle: ");
                    bottomEdge = scanner.nextInt();
                    printIsoscelesTriangle(bottomEdge);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(int bottomEdge) {
        for (int i = 0; i < bottomEdge; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < bottomEdge; i++) {
            for (int j = 0; j < bottomEdge - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < bottomEdge; i++) {
            for (int j = 0; j < bottomEdge - i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < bottomEdge; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < bottomEdge - i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printIsoscelesTriangle(int bottomEdge) {
        for (int i = 0; i < bottomEdge; i++) {
            for (int j = 0; j < bottomEdge - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
