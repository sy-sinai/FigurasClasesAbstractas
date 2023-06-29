// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Ente

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        int opc;
        List<Figura>listaFiguras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("Elija una de las siguientes opciones\n1.Circulo\n2.Triangulo\n3.Cuadrado\n4.Esfera\n5.Piramide\n6.Cubo\n7. Salir");
        System.out.println("Opcion");
        opc = sc.nextInt();
        do{
        switch (opc) {
            case 1:
                System.out.println("Circulo");
                Circulo c = new Circulo() {
                    @Override
                    public double calcularVolumen() {
                        return 0;
                    }

                    @Override
                    public double calcularAreaSuperficial() {
                        return 0;
                    }

                };
                c.ingresarPuntos();
                c.ingresarPuntos();

                System.out.println("El perimetro del circulo es: "+c.calcularPerimetro());
                System.out.println("El area del circulo es: "+c.calcularArea());
                listaFiguras.add(c);
                break;
            case 2:
                System.out.println("Triangulo");
                Triangulo tr = new Triangulo() {
                    @Override
                    public double calcularVolumen() {
                        return 0;
                    }

                    @Override
                    public double calcularAreaSuperficial() {
                        return 0;
                    }
                };
                tr.ingresarPuntos();
                tr.ingresarPuntos();
                tr.ingresarPuntos();

                System.out.println("El perimetro del triangulo es: "+tr.calcularPerimetro());
                System.out.println("El area del triangulo es: "+tr.calcularArea());
                listaFiguras.add(tr);

                break;
            case 3:
                System.out.println("Cuadrado");
                Cuadrado cuadrado = new Cuadrado() {
                    @Override
                    public double calcularVolumen() {
                        return 0;
                    }

                    @Override
                    public double calcularAreaSuperficial() {
                        return 0;
                    }
                };
                cuadrado.ingresarPuntos();
                cuadrado.ingresarPuntos();

                System.out.println("El perimetro del cuadrado es: "+cuadrado.calcularPerimetro());
                System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
                listaFiguras.add(cuadrado);

                break;
            case 4: System.out.println("Esfera");
                Circulo circulo1 = new Circulo();

                System.out.println("Ingrese punto 1");
                circulo1.ingresarPuntos();
                System.out.println("Ingrese el punto 2");
                circulo1.ingresarPuntos();

                double r = circulo1.calcularDistancia(0,1);

               Esfera esfera = new Esfera(r);

                System.out.println("El Volumen del esfera es: "+esfera.calcularVolumen());
                System.out.println("El Area superficial del esfera es: "+esfera.calcularAreaSuperficial());


                break;
            case 5:
                System.out.println("Piramide");
                double altura;
                System.out.println("Ingrese la altura de la piramide:");
                altura = sc.nextDouble();


                Piramide piramide = new Piramide(altura);

                Triangulo base = new Triangulo() {
                    @Override
                    public double calcularVolumen() {
                        return 0;
                    }

                    @Override
                    public double calcularAreaSuperficial() {
                        return 0;
                    }
                };

                System.out.println("Ingrese los puntos del triángulo base:");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese el punto numero "+i);
                    base.ingresarPuntos();
                }

                piramide.listaPuntos.addAll(base.listaPuntos);
                System.out.println("El Volumen del esfera es: "+piramide.calcularVolumen());
                System.out.println("El Area superficial del esfera es: "+piramide.calcularAreaSuperficial());


                break;

            case 6:
                System.out.println("Cubo");
                System.out.println("Cubo");
                Cubo cubo = new Cubo();
                cubo.ingresarPuntos();
                cubo.ingresarPuntos();

                double l = cubo.calcularDistancia(0,1);

                cubo.setL(l);
                System.out.println(""+cubo.getL());
                System.out.println("El Volumen del cubo es: "+cubo.calcularVolumen());
                System.out.println("El Area superficial del cubo es: "+cubo.calcularAreaSuperficial());
                System.out.println("El Volumen del cubo es: "+cubo.calcularVolumen());
                listaFiguras.add(cubo);

                break;
            case 7:
                System.out.println("Ha salido del programa");
            default:
                System.out.println("Opción no válida");
                break;
        }




        } while (opc < 7);
    }
}

