package FlowLayaout;

import javax.swing.JFrame;

//Prueba de FlowLayout
public class App1
{
    public static void main(String[] args)
    {
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(350, 100);
        campoTextoMarco.setVisible(true);
    }
}
