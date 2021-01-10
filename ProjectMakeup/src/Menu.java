import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Menu {

	private JFrame frame;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 850, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(250, 128, 114), 3, true));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(10, 11, 814, 124);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\eye-icon.png"));
		lblNewLabel.setBounds(56, 23, 158, 90);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Make Up For You");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 55));
		lblNewLabel_1.setBounds(234, 23, 570, 90);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(250, 128, 114), 3, true));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 144, 316, 368);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnlipstick = new JButton("\r\nLIPSTICK");
		btnlipstick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HERE
				textPane.setText("                  Lipstick"
						+"\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply thinly on your lip."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Lipstick:"
						+ "\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply thinly on your lip."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");*/
			}
		});
		btnlipstick.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		btnlipstick.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\lipstick-icon.png"));
		btnlipstick.setBounds(50, 11, 219, 75);
		panel_1.add(btnlipstick);
		
		JButton btnEyeshadow = new JButton("EYESHADOW");
		btnEyeshadow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HERE
				textPane.setText("                  Eyeshadow"
						+"\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply it on your eye lid with your favourite colour."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Lipstick:"
						+ "\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply it on your eye lid with your favourite colour."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");*/
			}
		});
		btnEyeshadow.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Makeup-icon.png"));
		btnEyeshadow.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		btnEyeshadow.setBounds(50, 97, 219, 75);
		panel_1.add(btnEyeshadow);
		
		JButton btnMascara = new JButton("MASCARA");
		btnMascara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("                  Mascara"
						+"\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply it on your eyelash, curl it upward."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Lipstick:"
						+ "\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply it on your eyelash, curl it upward."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");*/
			}
		});
		btnMascara.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\08-mascara-icon.png"));
		btnMascara.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		btnMascara.setBounds(50, 183, 219, 75);
		panel_1.add(btnMascara);
		
		JButton btnBlusher = new JButton("BLUSHER");
		btnBlusher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HERE
				textPane.setText("                  Mascara"
						+"\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply thinly use blusher brush."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");
				/*JOptionPane.showMessageDialog(null, "Lipstick:"
						+ "\nWhat Brand ?"
						+ "\n- Fenty Beauty\n- Maybelline\n- MAC\n- Revlon"
						+ "\nHow to Use ?"
						+ "\nApply thinly use blusher brush."
						+ "\nWhere to Buy ?"
						+ "\n- Midvalley Megamall\n- Aeon Shah Alam");*/
			}
		});
		btnBlusher.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\blusher.png"));
		btnBlusher.setFont(new Font("Lucida Handwriting", Font.BOLD, 16));
		btnBlusher.setBounds(50, 269, 219, 75);
		panel_1.add(btnBlusher);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(250, 128, 114), 3, true));
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(336, 146, 488, 366);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(20, 27, 446, 316);
		panel_2.add(textPane_1);
		textPane_1.setForeground(new Color(0, 0, 0));
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPane_1.setBackground(new Color(255, 228, 196));
		
	}

}
