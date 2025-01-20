package HojaDeTrabajo1Estructuras;

public class Licuadora100 implements Interfaz{
    private boolean encendido;
    private boolean lleno;
    private int velocidad;
    

    public Licuadora(boolean encendido, boolean lleno, int velocidad){
        this.encendido = encendido;
        this.lleno = lleno;
        this.velocidad = velocidad;
    }
}
