import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    public Integer cambiarVelocidad(String matricula, Integer v) {
        getCoche(matricula).velocidad = v;
        return getCoche(matricula).velocidad;
    }

    public Coche getCoche(String matricula){
        Coche aux = null;
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    public void subirVelocidad(String matricula) {
        getCoche(matricula).velocidad = getCoche(matricula).velocidad + 10;
        setChanged();
        notifyObservers(getCoche(matricula));
    }

    public void bajarVelocidad(String matricula) {
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - 10;
        setChanged();
        notifyObservers(getCoche(matricula));

    }

    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
