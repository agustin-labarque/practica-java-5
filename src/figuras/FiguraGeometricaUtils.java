package figuras;

public class FiguraGeometricaUtils {

    public static double areaPromedio(FiguraGeometrica[] arr){
        double areaTotal = 0;
        for(int i=0; i<arr.length; i++){
            areaTotal += arr[i].area();
        }
        return areaTotal / arr.length;
    }

}
