import java.util.Observable;
import java.util.Observer;

public class ObsExceso implements Observer {
    View miVista = new View();

    /**
     * Método que muestra dos respuestas diferentes una si el coche va por debajo de 160 y la otra si excede los 160
     */
    @Override
    public void update(Observable o, Object arg) {
        Coche obxC = (Coche) arg;
        if(obxC.velocidad>120) {
            miVista.muestraExceso(obxC.matricula, obxC.velocidad);
        }else{
            miVista.muestraVelocidad(obxC.matricula, obxC.velocidad);
        }
    }
}