package GridLayout;

import javax.swing.JFrame;

//Prueba de GridLayout
public class App3
{
    public static void main(String[] args)
    {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPanel.setSize(450, 200);
        marcoPanel.setVisible(true);
    }
}
