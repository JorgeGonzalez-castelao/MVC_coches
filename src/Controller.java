public class Controller {
    static Model miModelo = new Model();
    static View miVista = new View();

    public static void main(String[] args) {
        UI.crearVentana();
        ObsExceso miObserver = new ObsExceso();
        miModelo.addObserver(miObserver);

    }

    /**
     * Método para crear coche
     */
    public static void crearCoche(String modelo, String matricula){
        Coche aux = miModelo.crearCoche(modelo,matricula);
        if(aux!=null){
            miVista.muestraVelocidad(aux.matricula, aux.velocidad);
        }
    }

    /**
     * Método para incrementar la velocidad
     */
    public static void aumentarVelocidad(String matricula){
        miModelo.subirVelocidad(matricula);
    }


    /**
     * Método para disminuir la velocidad
     */
    public static void bajarVelocidad(String matricula){
        miModelo.bajarVelocidad(matricula);
    }

    /**
     * Método para buscar un coche
     * en caso de no encontrarse que lo indique
     */
    public static void buscarCoche(String matricula){
        Coche aux = miModelo.getCoche(matricula);
        miVista.muestraCoche(aux, matricula);
    }
}