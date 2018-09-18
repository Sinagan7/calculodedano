import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextField;
import java.awt.Choice;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SpinnerNumberModel;

public class aplicaciongrafica extends JFrame {

	private JPanel contentPane;
	private JSpinner habilidadAtaque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aplicaciongrafica frame = new aplicaciongrafica();
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
	public aplicaciongrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 508);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u00C1nima: C\u00E1lculo de da\u00F1o");
		lblNewLabel.setBounds(-38, 22, 574, 26);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 24));
		contentPane.add(lblNewLabel);

		JLabel lblAtacante = new JLabel("Atacante:");
		lblAtacante.setHorizontalAlignment(SwingConstants.LEFT);
		lblAtacante.setForeground(Color.WHITE);
		lblAtacante.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblAtacante.setBounds(57, 61, 143, 26);
		contentPane.add(lblAtacante);

		JComboBox atacante = new JComboBox();
		atacante.setForeground(SystemColor.inactiveCaption);
		atacante.setEditable(true);
		lblAtacante.setLabelFor(atacante);
		atacante.setFont(new Font("Cambria", Font.ITALIC, 14));
		atacante.setModel(new DefaultComboBoxModel(new String[] {"Rosfbif", "Lauryx", "Verdudu", "Lialda", "Hatka", "Enemigos"}));
		atacante.setBounds(74, 98, 143, 26);
		contentPane.add(atacante);

		JLabel lblHabilidadAtaque = new JLabel("Habilidad de Ataque:");
		lblHabilidadAtaque.setHorizontalAlignment(SwingConstants.LEFT);
		lblHabilidadAtaque.setForeground(Color.WHITE);
		lblHabilidadAtaque.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblHabilidadAtaque.setBounds(57, 135, 170, 26);
		contentPane.add(lblHabilidadAtaque);

		habilidadAtaque = new JSpinner();
		lblHabilidadAtaque.setLabelFor(habilidadAtaque);
		habilidadAtaque.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		habilidadAtaque.setBounds(74, 172, 143, 26);
		contentPane.add(habilidadAtaque);

		JLabel lblDefensata = new JLabel("Defensa (TA)");
		lblDefensata.setHorizontalAlignment(SwingConstants.LEFT);
		lblDefensata.setForeground(Color.WHITE);
		lblDefensata.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblDefensata.setBounds(297, 135, 170, 26);
		contentPane.add(lblDefensata);

		JLabel lblDefensor = new JLabel("Defensor");
		lblDefensor.setHorizontalAlignment(SwingConstants.LEFT);
		lblDefensor.setForeground(Color.WHITE);
		lblDefensor.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblDefensor.setBounds(297, 61, 143, 26);
		contentPane.add(lblDefensor);

		JComboBox defensor = new JComboBox();
		defensor.setModel(new DefaultComboBoxModel(new String[] {"Rosfbif", "Lauryx", "Verdudu", "Lialda", "Hatka", "Enemigos"}));
		lblDefensor.setLabelFor(defensor);
		defensor.setForeground(SystemColor.inactiveCaption);
		defensor.setFont(new Font("Cambria", Font.ITALIC, 14));
		defensor.setEditable(true);
		defensor.setBounds(315, 98, 143, 26);
		contentPane.add(defensor);

		JComboBox defensaTA = new JComboBox();
		defensaTA.setModel(new DefaultComboBoxModel(new String[] {"FIL", "CON", "PEN", "CAL", "FRI", "ELE", "ENE"}));
		lblDefensata.setLabelFor(defensaTA);
		defensaTA.setForeground(SystemColor.inactiveCaption);
		defensaTA.setFont(new Font("Cambria", Font.ITALIC, 14));
		defensaTA.setEditable(true);
		defensaTA.setBounds(315, 172, 143, 26);
		contentPane.add(defensaTA);

		JLabel lblHabilidadDefensa = new JLabel("Habilidad de Defensa:");
		lblHabilidadDefensa.setHorizontalAlignment(SwingConstants.LEFT);
		lblHabilidadDefensa.setForeground(Color.WHITE);
		lblHabilidadDefensa.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblHabilidadDefensa.setBounds(297, 209, 170, 26);
		contentPane.add(lblHabilidadDefensa);

		JSpinner habilidadDefensa = new JSpinner();
		lblHabilidadDefensa.setLabelFor(habilidadDefensa);
		habilidadDefensa.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		habilidadDefensa.setBounds(315, 246, 143, 26);
		contentPane.add(habilidadDefensa);

		JComboBox arma = new JComboBox();
		arma.setModel(new DefaultComboBoxModel(new String[] {"Maza de Guerra", "Daga", "Florete", "Espada Larga", "Arco Largo", "Lanza"}));
		arma.setForeground(SystemColor.inactiveCaption);
		arma.setFont(new Font("Cambria", Font.ITALIC, 14));
		arma.setEditable(true);
		arma.setBounds(74, 246, 143, 26);
		contentPane.add(arma);

		JLabel lblArma = new JLabel("Elegir Arma:");
		lblArma.setLabelFor(arma);
		lblArma.setHorizontalAlignment(SwingConstants.LEFT);
		lblArma.setForeground(Color.WHITE);
		lblArma.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblArma.setBounds(57, 209, 170, 26);
		contentPane.add(lblArma);

		JSpinner absorcionBase = new JSpinner();
		absorcionBase.setModel(new SpinnerNumberModel(new Integer(20), null, null, new Integer(1)));
		absorcionBase.setFont(new Font("Bookman Old Style", Font.ITALIC, 14));
		absorcionBase.setBounds(315, 320, 143, 26);
		contentPane.add(absorcionBase);

		JLabel lblAbsorcionBase = new JLabel("Absorci\u00F3n Base:");
		lblAbsorcionBase.setLabelFor(absorcionBase);
		lblAbsorcionBase.setHorizontalAlignment(SwingConstants.LEFT);
		lblAbsorcionBase.setForeground(Color.WHITE);
		lblAbsorcionBase.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		lblAbsorcionBase.setBounds(297, 283, 170, 26);
		contentPane.add(lblAbsorcionBase);
	}
}
