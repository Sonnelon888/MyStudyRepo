import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDouble {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {

        System.out.println("Введите числа в одну строку через пробел, нажмите ENTER" +
                " и введите маркер \"конец файла\"\n" +
                " Win = Ctrl + Z, Unix & MacOs = Ctrl + D :");
        while (scanner.hasNextInt()) {
            array.add(scanner.nextInt());
        }
        scanner.close();
        for (int i : array) {
            System.out.println(i * 2);
        }
    }
}
