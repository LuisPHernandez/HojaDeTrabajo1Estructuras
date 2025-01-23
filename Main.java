/**----------------------------------------------------------------------
* @author Pablo Toledo
* @author Pedro Caso
* @author Luis Hernandez 
* @Project Algoritmos y estructuras básicas - HDT1
* Última modificación: 21/01/2025
* Se realizó la prueba de intercambio con otro grupo (licuadora2.java)
* -----------------------------------------------------------------------
*/

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
            System.out.println("\nOpciones ofrecidas por la licuadora");
            System.out.println("1. Encender Licuadora (tiene que llenarse primero)");
            System.out.println("2. Llenar la licuadora");
            System.out.println("3. Aumentar/disminuir la velocidad (de 1 a 10)");
            System.out.println("4. Consultar velocidad actual");
            System.out.println("5. Consultar llenado");
            System.out.println("6. Vaciar licuadora");
            System.out.println("7. Salir");

            int opciones = scan.nextInt();
            switch(opciones){

                case 1:
                    licuadora.encender();
                    if (licuadora.getEncendido()) {
                        System.out.println("La licuadora se encendió");
                    } 
                    
                    else {
                        System.out.println("La licuadora se apagó");
                    }
                    break;

                case 2:
                    licuadora.llenar();
                    System.out.println("La licuadora se llenó con éxito");
                    break;

                case 3:
                    licuadora.aumentarVelocidad();
                    System.out.println("La velocidad aumentó/disminuyó a: " + licuadora.consultarVelocidad());
                    break;

                case 4:
                    System.out.println("La velocidad actual es: " + licuadora.consultarVelocidad());
                    break;

                case 5:
                    System.out.println("Estado: " + (licuadora.consultarLlenado() ? "Llena" : "Vacía"));
                    break;
                
                case 6:
                    licuadora.vaciar();
                    System.out.println("La licuadora se vació.");
                    break;

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
