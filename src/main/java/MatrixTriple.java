import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTriple {
    private String[][] array;

    private void getMatrixFromUser() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите колличество строк, содержащихся в матрице:");
            int matrixStringCount = Integer.parseInt(reader.readLine());
            array = new String[matrixStringCount][];
            System.out.println("Введите матрицу в виде строк :");
            for (int i = 0; i < matrixStringCount; i++) {
                array[i] = (reader.readLine().split(" "));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printTripleFirstLine() {
        StringBuilder result = new StringBuilder();
        for (String s : array[0]) {
            result.append(Integer.parseInt(s) * 3).append(" ");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        MatrixTriple matrix = new MatrixTriple();
        matrix.getMatrixFromUser();
        matrix.printTripleFirstLine();
    }
}
