// -----------------------------------
// Pedro Caso
// Pablo Toledo
// Luis Hernandez 
// Algoritmos y estructuras básicas
// HDT1
// -----------------------------------

package HojaDeTrabajo1Estructuras;

// la interfaz utilizada en común se detalla a continuación:
interface Interfaz {
    // metodo para encender la licuadora
    void encender();

    // método para llenar la licuadora
    void llenar();

    // método para aumentar la velocidad y disminuir la velocidad
    void aumentarVelocidad();

    // método para verificar el estado de la velocidad actual
    int consultarVelocidad();

    // método para consultar si la licuadora se encuentra llena
    boolean consultarLlenado();

    // método para vaciar la licuadora
    void vaciar();
}