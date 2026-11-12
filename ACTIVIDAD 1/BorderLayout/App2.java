package BorderLayout;

import javax.swing.JFrame;

//Prueba de BorderLayout
public class App2
{
    public static void main(String[] args)
    {
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRastreadorRaton.setSize(300, 100);
        marcoRastreadorRaton.setVisible(true);
    }
}
