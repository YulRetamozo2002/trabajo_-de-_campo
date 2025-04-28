package clase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNC;
	private JTextField txtDNI;
	private JTextField txtTELEFONO;
	private JTextField txtNM;
	private JTextField txtRAZA;
	private JTextField txtSEXO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veterinaria");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(238, 11, 122, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Datos Cliente :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 45, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Datos Mascota :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 145, 122, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre cliente");
		lblNewLabel_2.setBounds(20, 70, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombre mascota");
		lblNewLabel_2_1.setBounds(20, 170, 112, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("DNI");
		lblNewLabel_3.setBounds(20, 95, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Teléfono");
		lblNewLabel_3_1.setBounds(20, 120, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Raza");
		lblNewLabel_3_1_1.setBounds(20, 195, 46, 14);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Sexo");
		lblNewLabel_3_1_1_1.setBounds(20, 218, 46, 14);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		txtNC = new JTextField();
		txtNC.setBounds(115, 67, 223, 20);
		contentPane.add(txtNC);
		txtNC.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(125, 92, 129, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtTELEFONO = new JTextField();
		txtTELEFONO.setColumns(10);
		txtTELEFONO.setBounds(125, 114, 129, 20);
		contentPane.add(txtTELEFONO);
		
		txtNM = new JTextField();
		txtNM.setColumns(10);
		txtNM.setBounds(125, 170, 176, 20);
		contentPane.add(txtNM);
		
		txtRAZA = new JTextField();
		txtRAZA.setColumns(10);
		txtRAZA.setBounds(125, 192, 129, 20);
		contentPane.add(txtRAZA);
		
		txtSEXO = new JTextField();
		txtSEXO.setColumns(10);
		txtSEXO.setBounds(125, 215, 129, 20);
		contentPane.add(txtSEXO);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(348, 29, 213, 172);
		contentPane.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		JButton btnNewButton = new JButton("Procesar Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NombreCliente = txtNC.getText();  
				String NombreMascota = txtNM.getText();
				String Raza = txtRAZA.getText();
				String Sexo = txtSEXO.getText();
				int telefono = Integer.parseInt(txtTELEFONO. getText());
				int DNI = Integer.parseInt(txtDNI.getText());
				Veterinaria V = new Veterinaria(NombreCliente, NombreMascota, Raza, Sexo, 35, telefono, DNI);
				Resultado(V);
			}
			public void Imprimir(String s) {
				txtS.append(s + "\n" );
			}
			public void Resultado(Veterinaria v) {
				Imprimir("------------------------");
				Imprimir("Datos del cliente");
				Imprimir("Nombre : " + v.getNombreCliente());
				Imprimir("teléfono : " + v.getTelefono());
				Imprimir("DNI : " + v.getDni());
				
				Imprimir("------------------------");
				Imprimir("Datos de la mascota");
				Imprimir("Nombre : " + v.getNombreMascota());
				Imprimir("Raza : " + v.getRaza());
				Imprimir("Sexo : " + v.getSexo());
				
				Imprimir("------------------------");
				Imprimir("Monto a pagar por consulta y medicamento es " + v.MontoTotal());
			}
		});
		btnNewButton.setBounds(392, 214, 122, 23);
		contentPane.add(btnNewButton);
	}
}
