import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private JPanel panel1;
    private JButton crear_coche;
    private JTextField modelo;
    private JTextField matricula;
    private JButton button1;
    private JButton button2;

    //como necesitamos un controlador lo instanciaremos fuera
    Controller controlador;

    public UI() {
        //primero debemos instanciar el controlador
        controlador = new Controller();
        crear_coche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.crearCoche(modelo.getText(),matricula.getText());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.bajarVelocidad(matricula.getText());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.aumentarVelocidad(matricula.getText());

            }
        });
    }


    /**
     * Inicializa la Interfaz del Usuario
     * Lo llamaremos en el constructor de la vista
     */
    public static void crearVentana(){
        JFrame jframe = new JFrame("Aplicacion Jorge MVC");
        jframe.setContentPane(new UI().panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }

}

