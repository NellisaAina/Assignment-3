import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MakeupGui extends JFrame {
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField_Name;
	private JTable table;
	
	 ArrayList <MakeupGui> m;
	    String header[] = new String[]{"Type Of Make", "Brand", "How To Use", "Where To Buy"};
	    DefaultTableModel dtm;
	    int row, col;
	    private JTextField textField_PhoneNumber;
	    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeupGui frame = new MakeupGui();
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
	public MakeupGui() {
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(250, 128, 114), 3, true));
		panel.setBackground(new Color(255, 218, 185));
		panel.setBounds(10, 11, 446, 588);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Makeup Data Information");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(20, 150, 409, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_Type = new JLabel("Type Of Makeup");
		lblNewLabel_Type.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Type.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Type.setBounds(20, 336, 138, 42);
		panel.add(lblNewLabel_Type);
		
		JLabel lblNewLabel_Brand = new JLabel("Brand");
		lblNewLabel_Brand.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Brand.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Brand.setBounds(36, 389, 122, 42);
		panel.add(lblNewLabel_Brand);
		
		JLabel lblNewLabel_Use = new JLabel("How To Use");
		lblNewLabel_Use.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Use.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Use.setBounds(20, 439, 138, 42);
		panel.add(lblNewLabel_Use);
		
		JLabel lblNewLabel_Buy = new JLabel("Where To Buy");
		lblNewLabel_Buy.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Buy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Buy.setBounds(52, 492, 106, 42);
		panel.add(lblNewLabel_Buy);
		
		textField_Name = new JTextField();
		textField_Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_Name.setBounds(168, 243, 251, 28);
		panel.add(textField_Name);
		textField_Name.setColumns(10);
		
		JComboBox comboBox_buy = new JComboBox();
		comboBox_buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_buy.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Midvalley Megamall", "Aeon Shah Alam"}));
		comboBox_buy.setBounds(168, 500, 251, 30);
		panel.add(comboBox_buy);
		
		JComboBox comboBox_brand = new JComboBox();
		comboBox_brand.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Fenty Beauty", "Maybelline", "MAC", "Revlon"}));
		comboBox_brand.setBounds(168, 397, 251, 30);
		panel.add(comboBox_brand);
		
		JComboBox comboBox_use = new JComboBox();
		comboBox_use.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Apply thinly on your lip.", "Apply it on your eye lid with your favourite colour.", "Apply it on your eyelash, curl it upward.", "Apply thinly use blusher brush."}));
		comboBox_use.setBounds(168, 447, 251, 30);
		panel.add(comboBox_use);
		
		JComboBox comboBox_type = new JComboBox();
		comboBox_type.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Lipstick", "Eyeshadow", "Mascara", "Blusher"}));
		comboBox_type.setBounds(168, 345, 251, 28);
		panel.add(comboBox_type);
		
		JLabel lblNewLabel_Type_1 = new JLabel("Name");
		lblNewLabel_Type_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Type_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Type_1.setBounds(20, 234, 138, 42);
		panel.add(lblNewLabel_Type_1);
		
		JLabel lblNewLabel_Type_1_1 = new JLabel("Phone Number");
		lblNewLabel_Type_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Type_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Type_1_1.setBounds(20, 284, 138, 42);
		panel.add(lblNewLabel_Type_1_1);
		
		textField_PhoneNumber = new JTextField();
		textField_PhoneNumber.setColumns(10);
		textField_PhoneNumber.setBounds(168, 293, 251, 28);
		panel.add(textField_PhoneNumber);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\eye-icon.png"));
		lblNewLabel.setBounds(148, 11, 194, 191);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(250, 128, 114), 3, true));
		panel_1.setBackground(new Color(255, 218, 185));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(10, 610, 1350, 87);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textField_Name.getText(),
						textField_PhoneNumber.getText(),
						comboBox_type.getSelectedItem(),
						comboBox_brand.getSelectedItem(),
						comboBox_use.getSelectedItem(),
						comboBox_buy.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Car Booking Confirmed", "Makeup Data Information",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(97, 20, 221, 49);
		panel_1.add(btnNewButton);
		
		JButton btnEdit = new JButton("RESET");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Name.setText("");
				textField_PhoneNumber.setText("");
				comboBox_type.setSelectedItem("- Please Select - ");
				comboBox_brand.setSelectedItem("- Please Select - ");
				comboBox_use.setSelectedItem("- Please Select - ");
				comboBox_buy.setSelectedItem("- Please Select - ");
				
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEdit.setBounds(376, 20, 174, 49);
		panel_1.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No Data to delete", "Makeup Data Information",
								JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select which data to delete", "Makeup Data Information",
								JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(836, 20, 167, 49);
		panel_1.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ?", "Makeup Data Information",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1069, 20, 160, 49);
		panel_1.add(btnExit);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
		            File file = new File ("/Users/user/Desktop/DataBase.txt");
		            if(!file.exists())
		            {
		                file.createNewFile();
		            }
		            
		            FileWriter fw = new FileWriter(file.getAbsoluteFile());
		            BufferedWriter bw = new BufferedWriter(fw);
		            bw.write("- Makeup Data Information -\n");
		            bw.write("Name\t\tPhoneNumber\t\tType Of Makeup\t\t\tBrand\t\tHow To Use\t\tWhere To Buy\n");
		            
		            for(int i = 0; i < table.getRowCount(); i++)
		            {
		                for(int j = 0; j < table.getColumnCount(); j++)
		                {
		                    bw.write(table.getModel().getValueAt(i, j) + "\t\t");
		                }
		                bw.write("\n");
		            }
		            bw.close();
		            fw.close();
		            JOptionPane.showConfirmDialog(frame, "Save To File", "Makeup Data Information",
		            		JOptionPane.OK_OPTION);
		        }
		        catch(Exception ex)
		        {
		            ex.printStackTrace();
		        }
			}
		});
		
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(611, 20, 167, 49);
		panel_1.add(btnSave);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(250, 128, 114), 3, true));
		panel_2.setBackground(new Color(255, 218, 185));
		panel_2.setBounds(466, 11, 894, 588);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 47, 806, 505);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Phone Number", "Type of Makeup", "Makeup Brand", "How to Use", "Where to Buy"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(116);
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(119);
		table.getColumnModel().getColumn(4).setPreferredWidth(132);
		scrollPane.setViewportView(table);
	}
}
