package HojaDeTrabajo1Estructuras;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Licuadora100 licuadora = new Licuadora100();
        Scanner scan = new Scanner(System.in);
        boolean licuar = true;
        while(licuar != false){
            System.out.println("Opciones de licuadora: ");
            System.out.println("1. Encender Licuadora");
            System.out.println("2. Llenar licuadora");
            System.out.println("3. Aumentar la velocidad");
            System.out.println("4. Consultar velocidad");
            System.out.println("5. Consultar llenado");
            System.out.println("6. Vaciar");
            System.out.println("7. Salir");

            int op = scan.nextInt();
            switch(op){
                case 1:
                    licuadora.encender();
                    if (licuadora.isEncendido()) {
                        System.out.println("Licuadora encendida");
                    } else {
                        System.out.println("Licuadora apagada");
                    }
                    break;
                case 2:
                    licuadora.llenar();
                    System.out.println("Licuadora llena.");
                    break;
                case 3:
                    licuadora.aumentarVelocidad();
                    System.out.println("Velocidad actual: " + licuadora.consultarVelocidad());
                    break;
                case 4:
                    System.out.println("Velocidad actual: " + licuadora.consultarVelocidad());
                    break;
                case 5:
                    System.out.println("Estado de llenado: " + (licuadora.consultarLlenado() ? "Lleno" : "Vacío"));
                    break;
                case 6:
                    licuadora.vaciar();
                    System.out.println("Licuadora vaciada.");
                    break;
                case 7:
                    licuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scan.close();
    }
}
