public class MathMedia {
    public double transform(double[] array) {
        double sum = 0.0;
        for (int i=0; i < array.length; i++){
            double number = array[i];
            sum += number;
        }
        return sum / array.length ;

    }
}
