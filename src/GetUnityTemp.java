import java.util.InputMismatchException;
import java.util.Scanner;

public class GetUnityTemp {

    public UnityTemp getUnityTemp(String io) {
        Scanner input = new Scanner(System.in);
        System.out.println("| Digite a unidade de temperatura de " + io );
        System.out.println(" ___________________________________________________________________ " );
        System.out.println("|             Opções de unidade de Temperatura                      |" );
        System.out.println("|___________________________________________________________________| " );
        System.out.println("|        Celsius                                                    |" );
        System.out.println("|        Kelvin                                                     |" );
        System.out.println("|        Fahrenheit                                                 |" );
        System.out.println("|___________________________________________________________________| " );
        String typeString = input.nextLine();
        try {
            return UnityTemp.valueOf(typeString.toUpperCase());
        } catch (IllegalArgumentException exception) {
            System.err.println("A unidade de temperatura foi digitada incorretamente. Tente novamente");
            return getUnityTemp(io);
        }
    }
}
