import javax.swing.*;

public class dialog extends JDialog{
    private JLabel mensaje;
    private JPanel contentPane;


    public dialog() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * Mostramos un dialogo modal con información
     * @param msg información que queremos mostrar
     */
    public static void mostrarMensaje(String msg) {
        dialog dialog = new dialog();
        dialog.pack();
        // actualizamos mensaje
        dialog.mensaje.setText(msg);
        dialog.setVisible(true);
    }
}
