package Ejercicio2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrmCompraPasajes extends JFrame{
	private JTextField txtNombre= new JTextField(15);
	private JTextField txtDocumento= new JTextField(15);
	private JTextField txtFecha= new JTextField(15);
	
	private JComboBox<String> cmbOrigen= new JComboBox<>(new String[] {"Lima","Arequipa","Cusco","Trujillo"});
	private JComboBox<String> cmbDestino= new JComboBox<>(new String [] {"Lima","Arequipa","Cusco","Trujillo"});
	
	private JRadioButton rbPiso1 = new JRadioButton("1er Piso",true);
	private JRadioButton rbPiso2= new JRadioButton("2do Piso");
	private ButtonGroup grupoPisos= new ButtonGroup();
	
	private JCheckBox chkAudifonos= new JCheckBox("Audifonos");
	private JCheckBox chkManta= new JCheckBox("Manta");
	private JCheckBox chkRevistas= new JCheckBox("Revistas");
	
	private JList<String> lstCalidad = new JList<>(new String[]{"Económico", "Standard", "VIP"});
	
	private JButton btnProcesar= new JButton("Procesar Compra");
	private JButton btnLimpiar= new JButton("Limpiar Formulario");
	
	public FrmCompraPasajes() {
		setTitle("Empresa de Transporte - Compra de Pasajes");
		setSize(480,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		grupoPisos.add(rbPiso1);
		grupoPisos.add(rbPiso2);
		
		JPanel panelContenedor= new JPanel();
		panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS));
		
		JPanel pnlDatos = new JPanel(new GridLayout(3, 2, 5, 5));
        pnlDatos.setBorder(BorderFactory.createTitledBorder("Datos del Pasajero"));
        pnlDatos.add(new JLabel("Nombre:")); pnlDatos.add(txtNombre);
        pnlDatos.add(new JLabel("Documento:")); pnlDatos.add(txtDocumento);
        pnlDatos.add(new JLabel("Fecha (DD/MM/AAAA):")); pnlDatos.add(txtFecha);
        panelContenedor.add(pnlDatos);
		
		JPanel pnlRuta= new JPanel(new GridLayout(2,2,5,5));
		pnlRuta.setBorder(BorderFactory.createTitledBorder("Origen y Destino"));
		pnlRuta.add(new JLabel("Origen:")); pnlRuta.add(cmbOrigen);
        pnlRuta.add(new JLabel("Destino:")); pnlRuta.add(cmbDestino);
        panelContenedor.add(pnlRuta);
        
        JPanel pnlOpciones = new JPanel(new FlowLayout());
        pnlOpciones.setBorder(BorderFactory.createTitledBorder("Preferencias"));
        pnlOpciones.add(rbPiso1); pnlOpciones.add(rbPiso2);
        pnlOpciones.add(chkAudifonos); pnlOpciones.add(chkManta); pnlOpciones.add(chkRevistas);
        panelContenedor.add(pnlOpciones);
        
        JPanel pnlCalidad = new JPanel(new BorderLayout());
        pnlCalidad.setBorder(BorderFactory.createTitledBorder("Calidad de Servicio"));
        lstCalidad.setSelectedIndex(0);
        pnlCalidad.add(new JScrollPane(lstCalidad), BorderLayout.CENTER);
        panelContenedor.add(pnlCalidad);
        
        JPanel pnlBotones = new JPanel();
        pnlBotones.add(btnProcesar);
        pnlBotones.add(btnLimpiar);
        panelContenedor.add(pnlBotones);

        add(panelContenedor);
        
        btnProcesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarCompra();
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
    }
	private void generarCompra() {
		String extras = "";
        if (chkAudifonos.isSelected()) extras += "- Audífonos\n";
        if (chkManta.isSelected()) extras += "- Manta\n";
        if (chkRevistas.isSelected()) extras += "- Revistas\n";
        if (extras.isEmpty()) extras = "Sin servicios opcionales";
        Pasajero pasajero = new Pasajero(
                txtNombre.getText(),
                txtDocumento.getText(),
                txtFecha.getText(),
                cmbOrigen.getSelectedItem().toString(),
                cmbDestino.getSelectedItem().toString(),
                rbPiso1.isSelected() ? "1er Piso" : "2do Piso",
                lstCalidad.getSelectedValue(),
                extras
            );
        JOptionPane.showMessageDialog(this, pasajero.obtenerResumen(), "Resumen de Pasaje", JOptionPane.INFORMATION_MESSAGE);
    }
	private void limpiar() {
        txtNombre.setText("");
        txtDocumento.setText("");
        txtFecha.setText("");
        cmbOrigen.setSelectedIndex(0);
        cmbDestino.setSelectedIndex(0);
        rbPiso1.setSelected(true);
        chkAudifonos.setSelected(false);
        chkManta.setSelected(false);
        chkRevistas.setSelected(false);
        lstCalidad.setSelectedIndex(0);
	}
}
