package figuras;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString(){
        return String.valueOf(this.area());
    }

}
