public class View {
    /**
     metodo que implementa la velocidad del coche
     */
     void muestraVelocidad(String matricula, Integer v){
        dialog.mostrarMensaje("El coche " + matricula + " tiene una velocidad de: " + v + "km/h");
    }

    /**
     * Metodo ver coche que muestra el coche
     * o que diga que no existe el coche
     */
    void muestraCoche(Coche aux, String matricula){
        if(aux==null){
            dialog.mostrarMensaje("No hay coche con la siguiente matrícula: " + matricula);
        }
        else{
            dialog.mostrarMensaje("El " + aux.modelo + " con la matrícula: " + aux.matricula + " tiene una velocidad de: " + aux.velocidad +"km/h");
        }
    }

    void muestraExceso(String matricula, Integer v){
        dialog.mostrarMensaje("Peligro coche : " + matricula + " con exceso de velocidad, tiene velocidad de: " + v + "km/h");
    }
}