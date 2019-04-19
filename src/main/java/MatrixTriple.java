import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixTriple {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private List<List<String>> array = new ArrayList<List<String>>();
    private String result = "";

    public void getMatrixFromUser() throws IOException {
        System.out.println("Введите колличество строк, содержащихся в матрице:");
        int i = Integer.parseInt(reader.readLine());
        System.out.println("Введите матрицу в виде строк :");
        for (int x = 0; x < i; x++) {
            array.add(Arrays.asList(reader.readLine().split(" ")));
        }
        reader.close();
    }

    public void printTripleFirstLine() {
        for (String i : array.get(0)) {
            result += (Integer.parseInt(i) * 3) + " ";
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        MatrixTriple matrix = new MatrixTriple();
        try {
            matrix.getMatrixFromUser();
            matrix.printTripleFirstLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
