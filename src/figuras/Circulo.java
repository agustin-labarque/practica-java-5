package figuras;

public class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

}
