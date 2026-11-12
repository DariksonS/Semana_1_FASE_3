package Ejercicio2;
import javax.swing.SwingUtilities;
public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmCompraPasajes ventana = new FrmCompraPasajes();
                ventana.setVisible(true);
            }
        });

	}

}
