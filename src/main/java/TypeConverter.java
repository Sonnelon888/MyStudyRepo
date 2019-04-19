import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TypeConverter {
    private String S ="";
    private int X;
    private double Y;

    public String getS(){
        return S;
    }

    public void takeNumFromUser(){
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Введите число: ");
        try {
            S  = reader.readLine();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getX(String s){
        return Integer.parseInt(s);
    }

    public double getY(String s){
        return Double.parseDouble(s);
    }

    public static void main(String[] args) {
        TypeConverter tc = new TypeConverter();
        tc.takeNumFromUser();
        System.out.println("S = "+ tc.getS() +
                "\nХ = "+ tc.getX(tc.getS()) +
                "\nY =" + tc.getY(tc.getS()));
    }
}
