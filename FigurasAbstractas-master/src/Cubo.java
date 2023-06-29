public class Cubo extends Cuadrado {


    @Override
    public double calcularPerimetro() {
        double perimetro = super.calcularPerimetro();
        return perimetro * 12;
    }

    @Override
    public double calcularAreaSuperficial() {
        double areaBase = super.calcularArea();
        double areaSuperficial = areaBase * 6;
        return areaSuperficial;
    }

    @Override
    public double calcularVolumen() {
        System.out.println("l :"+l);
        double areaBase = calcularArea();
        double volumen = areaBase * l;
        return volumen;
    }


}


