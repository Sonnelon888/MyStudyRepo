import java.util.Scanner;

public class CheckConstants {
    private static final int X = 2;
    private static final int Y = 3;
    private static final int Z = 5;
    private static Scanner scanner = new Scanner(System.in);
    private static int T;

    public static void main(String[] args) {
        System.out.println("Введите значение для переменной T:");
        T = scanner.nextInt();
        scanner.close();
        if ((X == T) || (Y == T) || (Z == T)) {
            System.out.println("Данное значение имеется в константах");
        } else
            System.out.println("Такой константы нет!");
    }
}
