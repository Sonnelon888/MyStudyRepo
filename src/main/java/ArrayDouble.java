import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDouble {
    private String[] array;

    private void getData() {
        try (BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(
                                     System.in))) {

            System.out.println("Введите числа через пробел, нажмите ENTER:");
            array = (reader.readLine().split(" "));
        } catch (IOException | NullPointerException | Error e) {
            e.printStackTrace();
        }
    }

    private void printDoubleResult() {
        for (String i : array) {
            System.out.println(Integer.valueOf(i) * 2);
        }
    }

    public static void main(String[] args) {
        ArrayDouble ar = new ArrayDouble();
        ar.getData();
        ar.printDoubleResult();
    }
}
