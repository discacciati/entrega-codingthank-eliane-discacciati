import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
            initialize();
            ToFahrenheit transformToFahrenheit = new ToFahrenheit();
            ToCelsius transformToCelsius = new ToCelsius();
            ToKelvin transformToKelvin = new ToKelvin();
            GetDouble inputNumberDouble = new GetDouble();
            GetSize arraySize =  new GetSize();
            GetUnityTemp unityTemp = new GetUnityTemp();
            MathMedia mathMedia = new MathMedia();
            OutputResult outputResult = new OutputResult();

            UnityTemp unityInput = unityTemp.getUnityTemp("entrada que você irá fornecer");
            UnityTemp unityOutput = unityTemp.getUnityTemp("saída que será convertida");
            String resultWhile = "S" ;
            double mediaTemp = 0.0;
            double mediaResult = 0.0;
            int size ;

            size = arraySize.getSize();

            double[] temp ;
            double[] result ;
            temp = new double[size];
            result = new double[size];

            for (int i = 0 ; i<size ; i++){



                try {
                    temp[i] = inputNumberDouble.getDouble();
                }catch (ArrayIndexOutOfBoundsException exception) {
                    System.err.println("Valor digitado não foi aceito.");
                }




            }



            while(resultWhile.equalsIgnoreCase("S")) {
                Scanner input = new Scanner(System.in);
                System.out.println(" ____________________________________________________ ");
                System.out.println("|      Deseja converter mais uma temperatura?        |");
                System.out.println("|____________________________________________________| ");
                System.out.println("|     Responda   S    para sim                       | ");
                System.out.println("|     Responda   N    para não                       | ");
                System.out.println("|____________________________________________________|");
                resultWhile = input.nextLine();
                if(resultWhile.equalsIgnoreCase("S")) {
                    try {
                        int n = temp.length;
                        temp[n] = inputNumberDouble.getDouble();
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        System.err.println("Valor digitado não foi aceito. Será usado valor padrão de 10.");
                    }
                }
            }


            for (int i = 0 ; i < temp.length ; i++){
                double temperature = temp[i];
                switch (unityOutput){
                    case CELSIUS:
                        result[i]= transformToCelsius.transform(unityInput, temperature);
                        break;
                    case KELVIN:
                        result[i] = transformToKelvin.transform(unityInput, temperature);
                        break;
                    case FAHRENHEIT:
                        result[i] = transformToFahrenheit.transform(unityInput, temperature);
                        break;
                    default:
                        result[i] = 0;
                        break;
                }
            }

            mediaTemp = mathMedia.transform(temp);
            mediaResult = mathMedia.transform(result);

            System.out.println(" ____________________________________________________ " );
            System.out.println("|   O resultado da(s) conversão(s) solicitada(s) é : |" );
            outputResult.transform(temp, unityInput, result, unityOutput);
            System.out.println("|____________________________________________________|" );
            System.out.println("|   O resultado da média das temperaturas            |" );
            System.out.println("|   em   "+ unityInput +"    é   "+ mediaTemp  );
            System.out.println("|   em   "+ unityOutput +"    é   "+ mediaResult );
            System.out.println("|____________________________________________________|" );

    }

    private static void initialize() {
            System.out.println(" ____________________________________________________ " );
            System.out.println(" Bem vindo ao nosso conversor de temperaturas! ");
            System.out.println(" ____________________________________________________ " );
    }


}

