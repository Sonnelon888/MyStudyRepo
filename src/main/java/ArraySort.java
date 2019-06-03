import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySort {
    private static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    private Integer[] arraySort;

    private ArraySort(Integer[] arraySort) {
        this.arraySort = arraySort;
    }

    private ArraySort() {
    }

    private ArraySort getArrayFromUser() throws IOException {
        System.out.println("Введите количество чисел, которые необходимо отсортировать: ");
        int arrayLength = Integer.parseInt(reader.readLine());
        arraySort = new Integer[arrayLength];
        System.out.println("Введите массив чисел через пробел для сортировки: ");
        try {
            String[] line = reader.readLine().split(" ", arrayLength);
            for (int i = 0; i < arraySort.length; i++) {
                arraySort[i] = Integer.parseInt(line[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Введеное количество чисел не совпадает с указанным");
            System.exit(-1);
        }
        reader.close();
        return new ArraySort(arraySort);
    }

    private ArraySort sortArray() {
        int startSort = 0;
        int endSort = ~-arraySort.length;
        int nowSorting = startSort - (startSort - endSort) / 2;
        while (startSort < endSort) {
            while (startSort < nowSorting && (arraySort[startSort] <= arraySort[nowSorting])) {
                startSort++;
            }
            while (endSort > nowSorting && (arraySort[nowSorting] <= arraySort[endSort])) {
                endSort--;
            }
            if (startSort < endSort) {
                int temp = arraySort[startSort];
                arraySort[startSort] = arraySort[endSort];
                arraySort[endSort] = temp;
                if (startSort == nowSorting)
                    nowSorting = endSort;
                else if (endSort == nowSorting)
                    nowSorting = startSort;
            }
        }
        return new ArraySort(arraySort);
    }

    private static void run() {
        ArraySort as = new ArraySort();
        try {
            System.out.println(String
                    .format("Результат сортировки: %s",
                            Arrays.toString(as.getArrayFromUser().sortArray().arraySort)));

        } catch (IOException e) {
            System.out.println("Возникла ошибка при обработке входных данных!");
        }
    }

    public static void main(String[] args) {
        run();
    }
}
