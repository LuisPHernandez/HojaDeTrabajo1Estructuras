package HojaDeTrabajo1Estructuras;

public class Licuadora100 implements Interfaz{
    private boolean encendido;
    private boolean lleno;
    private int velocidad;
    

    public Licuadora100() {
        this.encendido = false;
        this.lleno = false;
        this.velocidad = 0;
    }

    // requisito previo, tiene que estar apagada y llena
    @Override
    public void encender() {
        if (encendido == false && lleno == true) {
            encendido = true;
            velocidad = 1; // se enciende con la velocidad 1, ya que no es posible saltarse velocidades
        }
    }

    @Override
    public void llenar() {
        lleno = true;
    }

    // requisitos previo, solo se puede aumentar la velocidad si esta encendida la licuadora y cuando llegue a 10 regrese a la velocidad 1
    @Override
    public void aumentarVelocidad() {
        if(encendido == true) {
            velocidad += 1;
            if (velocidad > 10) {
                velocidad = 1;
            }
        }
    }


}
