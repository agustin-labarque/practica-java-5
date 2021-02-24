package figuras;

public class Main {

    public static void main(String[] args){

        //uso 3 figuras con area 25
        FiguraGeometrica[] figuras = new FiguraGeometrica[] { new Triangulo(5, 10), new Rectangulo(5, 5), new Circulo(5/Math.sqrt(Math.PI))};
        System.out.println(FiguraGeometricaUtils.areaPromedio(figuras));

        //uso 3 figuras de area 15, 20, 25 respectivamente
        FiguraGeometrica[] figuras2 = new FiguraGeometrica[] { new Triangulo(5, 6), new Rectangulo(5, 4), new Circulo(5/Math.sqrt(Math.PI))};
        System.out.println(FiguraGeometricaUtils.areaPromedio(figuras2));
        
    }

}
