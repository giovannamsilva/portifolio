
package figura;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
   
    @Override
    public double area() {
        return 3.14*Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * 3.14 * raio;
    }
    
    @Override
    public String dados(){
        return super.dados()+
                "\nTamanho do raio: "+raio;
    }
}
