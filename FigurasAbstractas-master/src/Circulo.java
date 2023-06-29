public class Circulo extends Figura {
    protected double r;

    public Circulo() {
        this.r = r;
    }
    @Override
    public double calcularPerimetro() {

        return 2 * Math.PI * r;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public double calcularAreaSuperficial() {
        return 0;
    }
}
