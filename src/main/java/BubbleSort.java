import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    private static BubbleSort bs = new BubbleSort();
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public int[] bubblesort(int[] sort) {
        for (int i = sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (sort[j] > sort[j + 1]) {
                    int checked = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = checked;
                }
            }
        }
        return sort;
    }

    public static int[] getArrayFromUser() throws IOException {
        System.out.println("Введите количество чисел, которые необходимо отсортировать: ");
        int arrayLength = Integer.parseInt(reader.readLine());
        int[] sort = new int[arrayLength];
        System.out.println("Введите массив чисел через пробел для сортировки: ");
        String[] line = reader.readLine().split(" ");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = Integer.parseInt(line[i]);
        }
        return sort;
    }

    public static void printResult() {
        String result = "";
        try {
            for (int i : bs.bubblesort(getArrayFromUser())) {
                result += (i + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printResult();
    }
}
