import java.util.Scanner;

public class GetSize {
    public int getSize() {
        Scanner input = new Scanner(System.in);
        System.out.println(" ___________________________________________________________________ " );
        System.out.println("| Digite a quantidade de temperaturas que deseja converter          | ");
        System.out.println(" ___________________________________________________________________ " );
        try {
            return input.nextInt();
        } catch (IllegalArgumentException exception) {
            System.err.println("Valor digitado não foi aceito. Tente novamente.");
            return getSize();
        }
    }
}
