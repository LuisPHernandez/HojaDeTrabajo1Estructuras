package HojaDeTrabajo1Estructuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Licuadora100Test {

    /**
     *
     */
    private Licuadora100 licuadora;

    // se inicializa y crea una licuadora antes de cada prueba (método)
    /**
     * 
     */
    @BeforeEach
    public void TestLicuadora100() {
        licuadora = new Licuadora100();
    }

    // Este test será para probar su encendido
    /**
     * 
     */
    @Test
    public void testParaEncendido() {
        licuadora.llenar(); // primero se llena la licuadora
        licuadora.encender(); // luego se enciende
        assertTrue(licuadora.isEncendido());
        assertEquals(1, licuadora.getVelocidad(), "La velocidad luego de encenderse es 1 (vel. mínima)");
    }

    // El segundo test es para apagar la licuadora
    /**
     * 
     */
    @Test
    public void testParaApagado() {
        licuadora.llenar(); // se llena para encenderse
        licuadora.encender(); // se enciende
        licuadora.encender(); // se vuelve a presionar la misma opcion para apagarse
        assertFalse(licuadora.isEncendido());
        assertEquals(0, licuadora.getVelocidad(), "la velocidad tiene que ser 0 ya que esta apagada");
    }

    // El tercer test es para aumentar la velocidad de 1 en 1
    /**
     * 
     */
    @Test
    public void testParaAumentarVelocidad() {
        licuadora.llenar(); // se llena para encenderse 
        licuadora.encender(); // se enciende (vel 1)
        licuadora.aumentarVelocidad(); // ahora se aumenta la velocidad (vel 2)
        assertEquals(2, licuadora.getVelocidad(), "la velocidad tiene que ser 2 despues de aumentar 1 vez la velocidad");
    }

    // El cuarto test es para disminuir la velocidad una vez llegue a 10
    /**
     * 
     */
    @Test
    public void testParaReducirVelMax() {
        licuadora.llenar(); // se llena para encenderse
        licuadora.encender(); // se enciende
        // se aumenta la velocidad hasta 10 para que se disminuya a 1 nuevamente
        for (int i = 0; i < 10; i++) { 
            licuadora.aumentarVelocidad();
        }
        assertEquals(1, licuadora.getVelocidad());
    }

    // El quinto test es para verificar si la licuadora esta llena o vacía
    @Test
    public void testVerificarLlenado() {
        assertFalse(licuadora.consultarLlenado(), "Tiene que estar vacía para llenarse");
        licuadora.llenar(); // se llena la licuadora
        assertTrue(licuadora.consultarLlenado());
    }

    // El test verifica si la licuadora se vacía al accionar la función correspondiente
    @Test
    public void testParaVaciarla() {
        licuadora.llenar(); // se llena la licuadora
        assertTrue(licuadora.consultarLlenado(), "tiene que estar llena para vaciarse");
        licuadora.vaciar(); // se vacía la licuadora
        assertFalse(licuadora.consultarLlenado());
    }
}
