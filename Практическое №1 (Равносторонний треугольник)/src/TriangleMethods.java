import java.util.Scanner;

public class TriangleMethods {
    public static int sideA = sides();
    public static int sideB = sides();
    public static int sideC = sides();

    public TriangleMethods() {
    }

    public TriangleMethods(int sideA, int sideB,int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static int sides() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны (см): ");
        int side = scanner.nextInt();
        return side;
    }
    public static void isExist() {
        if (sideA == sideB && sideB == sideC) {
            System.out.println("Введённый треуголник является равносторонним.");
        } else {
            System.out.println("Введённый треуголник не является равносторонним.");
        }
    }

    public static int perimeter() {
        int perimeter = sideA + sideB + sideC;
        System.out.println("Периметр треугольника составляет: " +perimeter+ " (см).");
        return perimeter;
    }

    public static double square() {
        int perimeter = sideA + sideB + sideC;
        int p = perimeter/2;
        double square = Math.sqrt(p*(p-sideA) * (p - sideB) * (p - sideC));
        System.out.println("Площадь треугольника составляет: " +square+ " (см²).");
        return square;
    }
}