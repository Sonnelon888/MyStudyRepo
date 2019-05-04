import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyConverter {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Double range;
    private Double value;
    private Double result;

    private void takeExchangeRange(){
        System.out.println("Введите значение курса доллара по отношению к рублю:");
        try {
            range = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void takeValue(){
        System.out.println("Введите сумму в рублях, которую необходимо конвертировать c двумя знаками после запятой:");
        try {
            value = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void convert(){
        result = value / range;
        System.out.println("Данная сумма соответствует " + String.format("%.2f", result) + "$");
    }

    public static void run(){
        MoneyConverter mc = new MoneyConverter();
        mc.takeExchangeRange();
        mc.takeValue();
        mc.convert();
    }

    public static void main(String[] args) {
        MoneyConverter.run();
    }
}
