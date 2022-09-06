import java.util.InputMismatchException;
import java.util.Scanner;

public class GetDouble {

    public double getDouble() {
        Scanner input = new Scanner(System.in);
        System.out.println(" ___________________________________________________________________ " );
        System.out.println("|   Digite o valor da temperatura que será convertido:              | ");
        System.out.println(" ___________________________________________________________________ " );
        try {
            return input.nextDouble();
        } catch (IllegalArgumentException exception) {
            System.err.println("Valor digitado não foi aceito. Tente novamente.");
            return getDouble();
        }
    }
}
