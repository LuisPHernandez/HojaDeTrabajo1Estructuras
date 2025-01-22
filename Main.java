package HojaDeTrabajo1Estructuras;

import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String []args){
        Licuadora100 licuadora = new Licuadora100();
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        while(continuar != false){
            System.out.println("opciones ofrecidas por la licuadora");
            System.out.println("1. Encender Licuadora (tiene que llenarse primero)");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Aumentar/disminuir la velocidad (de 1 a 10)");
            System.out.println("4. Consultar velocidad actual");
            System.out.println("5. Consultar llenado");
            System.out.println("6. Vaciar licuadora");
            System.out.println("7. Salir");

            int opciones = scan.nextInt();
            switch(opciones){

                //Encender la licuadora
                case 1:
                    licuadora.encender();
                    if (licuadora.isEncendido()) {
                        System.out.println("La licuadora se encendió");
                    } 
                    
                    else {
                        System.out.println("La licuadora se apagó");
                    }
                    break;

                // Llenar la licuadora 
                case 2:
                    licuadora.llenar();
                    System.out.println("La licuadora se llenó con éxito");
                    break;

                // Aumentar/Disminuir velocidad
                case 3:
                    licuadora.aumentarVelocidad();
                    System.out.println("La velocidad aumentó/disminuyó a: " + licuadora.consultarVelocidad());
                    break;

                // Consultar la velocidad actual
                case 4:
                    System.out.println("La velocidad actual es: " + licuadora.consultarVelocidad());
                    break;

                // Verificar si esta llena o vacía
                case 5:
                    System.out.println("Estado: " + (licuadora.consultarLlenado() ? "Llena" : "Vacía"));
                    break;
                
                // Vaciar licuadora 
                case 6:
                    licuadora.vaciar();
                    System.out.println("La licuadora se vació.");
                    break;

                // Salir del programa 
                case 7:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
            }
        }
        scan.close();
    }
}
