public class OutputResult {
    public void transform(double array[] , UnityTemp unityInput,  double arrayResult[] , UnityTemp unityOutput) {
        for (int i=0; i<array.length; i++) {
            double number = array[i];
            double result = arrayResult[i];
            System.out.println("|      " + number + "º " + unityInput + "    =   " + result + "º  " + unityOutput + "              ");
        }
    }
}
