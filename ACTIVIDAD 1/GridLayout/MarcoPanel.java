package GridLayout;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

//Ventana con panel organizado en GridLayout
public class MarcoPanel extends JFrame
{
    private final JPanel panelBotones;
    private final JButton[] botones;

    public MarcoPanel()
    {
        super("GridLayout - Darikson Sanchez y Amira Garcia");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));

        //Creacion de los botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++)
        {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1));
            panelBotones.add(botones[cuenta]);
        }

        add(panelBotones, BorderLayout.SOUTH);
    }
}
