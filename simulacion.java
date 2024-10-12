import java.util.Scanner;

public class simulacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cantidad;
        double potencia = 55;
        int pt = 100;
        double potenciaAnterior = potencia; // Variable para almacenar la potencia anterior

        System.out.println("¿Cantidad de cristales?");
        cantidad = leer.nextInt();

        System.out.println("Iteración\tPotencia reducida");
        for (int i = 0; i < cantidad; i++) {
            double distancia = i + 1; // Distancia en metros
            double reduccionPorcentaje = 5.0 / distancia; // Porcentaje de reducción que disminuye con la distancia
            pt = pt - (int) (reduccionPorcentaje * pt / 100);
            potencia = (pt * potencia)/100;
            System.out.println((i+1) + "\t\t" + potencia);
            potenciaAnterior = potencia; // Actualiza la potencia anterior
        }
        System.out.println("La potencia final con " + cantidad + " cristales a 1m de distancia es de: " + potencia);
    }
}