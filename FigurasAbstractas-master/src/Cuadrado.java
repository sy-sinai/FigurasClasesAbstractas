public class Cuadrado extends Figura {
    protected double l;

    @Override
    public double calcularPerimetro() {
        l = calcularDistancia(0, 1);
        double perimetro = l * 4;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        return Math.pow(l, 2);
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

    @Override
    public double calcularAreaSuperficial() {
        return 0;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}