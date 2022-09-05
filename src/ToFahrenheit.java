public class ToFahrenheit {
    public double transform(UnityTemp type, double temp) {
        double result;
        switch(type){
            case CELSIUS:
                result =  (temp * 9.0 / 5) + 32;
                break;
            case KELVIN:
                result = (temp - 273.15) * 9.0 / 5 + 32;
                break;
            default:
                result =  temp;
                break;
        }

        return result ;

    }

}
