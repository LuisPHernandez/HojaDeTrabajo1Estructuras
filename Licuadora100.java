package HojaDeTrabajo1Estructuras;

public class Licuadora100 implements Interfaz {
    private boolean encendido;
    private boolean lleno;
    private int velocidad;
    

    public Licuadora100() {
        this.encendido = false;
        this.lleno = false;
        this.velocidad = 0;
    }

    // Requisito previo, tiene que estar apagada y llena
    @Override
    public void encender() {
        if (encendido == true) {
            encendido = false;
            velocidad = 0;
        }

        else if (encendido == false && lleno == true) {
            encendido = true;
            velocidad = 1; // se enciende con la velocidad 1, ya que no es posible saltarse velocidades
        }
    }

    @Override
    public void llenar() {
        lleno = true;
    }

    // Requisitos previo, solo se puede aumentar la velocidad si esta encendida la licuadora y cuando llegue a 10 regrese a la velocidad 1
    @Override
    public void aumentarVelocidad() {
        if(encendido == true) {
            velocidad += 1;
            if (velocidad > 10) {
                velocidad = 1;
            }
        }
    }

    // Se devuelve el valor actual de la velocidad
    @Override
    public int consultarVelocidad() {
        return velocidad;
    }

    // Se devuelve el estado actual de la licuadora (true = lleno, false = vacío)
    @Override
    public boolean consultarLlenado() {
        return lleno;
    }

    // Se vacía el contenido de la licuadora y se actualiza su estado
    @Override
    public void vaciar() {
        if (lleno == true) {
            lleno = false;
        }
    }
}
