public class Esfera extends Figura {
    double r;

    public Esfera(double r) {
        this.r = r;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public double calcularAreaSuperficial() {
        return calcularArea();
    }
}

