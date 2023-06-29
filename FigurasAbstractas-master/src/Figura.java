import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {

    List<Punto> listaPuntos = new ArrayList<>();

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

    public abstract double calcularVolumen();
    public abstract double calcularAreaSuperficial();

    public void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la componente x del punto: ");
        double x = sc.nextDouble();
        System.out.println("Ingrese la componente y del punto: ");
        double y = sc.nextDouble();
        System.out.println("Ingrese la componente z del punto: ");
        double z = sc.nextDouble();
        listaPuntos.add(new Punto(x,y,z));

    }

    public double calcularDistancia(int i, int j){

        double dist = Math.sqrt(Math.pow(listaPuntos.get(i).getX()-listaPuntos.get(j).getX(),2)
                                +Math.pow(listaPuntos.get(i).getY()-listaPuntos.get(j).getY(),2)
                                +Math.pow(listaPuntos.get(i).getZ()-listaPuntos.get(j).getZ(),2));
        return dist;
    }

}
