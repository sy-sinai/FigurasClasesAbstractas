public class Piramide extends Triangulo {
    double altura;

    public Piramide(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularAreaSuperficial() {
        double areaBase = super.calcularArea();
        double areaLateral = calcularAreaLateral();
        return areaBase + areaLateral;
    }

    private double calcularAreaLateral() {
        double perimetro = calcularPerimetro();
        double apotema = calcularApotema();
        return (perimetro * apotema) / 2;
    }

    private double calcularApotema() {
        double semilado = calcularPerimetro() / 3;
        return Math.sqrt(Math.pow(l1, 2) - Math.pow(semilado, 2));
    }

    @Override
    public double calcularVolumen() {
        double areaBase = super.calcularArea();
        return (areaBase * altura) / 3;
    }
}