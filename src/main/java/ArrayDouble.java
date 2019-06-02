import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ArrayDouble {

    private String[] getData() {
        try (BufferedReader reader =
                     new BufferedReader(
                             new InputStreamReader(
                                     System.in))) {

            System.out.println("Введите числа через пробел, нажмите ENTER:");
            return (reader.readLine().split(" "));
        } catch (IOException | NullPointerException | Error e) {
            e.printStackTrace();
        }
        return null;
    }

    private void printDoubleResult(String[] array) {
        for (String i : array) {
            System.out.println(Integer.valueOf(i) * 2);
        }
    }

    public static void main(String[] args) {
        ArrayDouble ar = new ArrayDouble();
        ar.printDoubleResult(
                Objects.requireNonNull(
                        ar.getData()));
    }
}
