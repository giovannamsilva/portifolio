
package figura;

public class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return base*2 + altura*2;
    }
    
     @Override
    public String dados(){
        return super.dados()+
                "\nTamanho da base: "+base+
                "\nTamanho da altura: "+altura;
    }
}
