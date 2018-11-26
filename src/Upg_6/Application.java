package Upg_6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Application {

	private JFrame frmPersonAccount;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frmPersonAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPersonAccount = new JFrame();
		frmPersonAccount.setTitle("Person & Account Management");
		frmPersonAccount.setBounds(100, 100, 715, 648);
		frmPersonAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPersonAccount.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 282, 697, 2);
		frmPersonAccount.getContentPane().add(separator);
		
		JLabel lblPersonsManagement = new JLabel("Persons management");
		lblPersonsManagement.setBounds(10, 13, 124, 16);
		frmPersonAccount.getContentPane().add(lblPersonsManagement);
		
		JLabel lblAccountManagement = new JLabel("Account management");
		lblAccountManagement.setBounds(10, 299, 126, 16);
		frmPersonAccount.getContentPane().add(lblAccountManagement);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(92, 58, 56, 16);
		frmPersonAccount.getContentPane().add(lblNewLabel);
		
		JLabel lblPnbr = new JLabel("pNbr");
		lblPnbr.setBounds(92, 110, 56, 16);
		frmPersonAccount.getContentPane().add(lblPnbr);
		
		textField = new JTextField();
		textField.setBounds(164, 55, 116, 22);
		frmPersonAccount.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 107, 116, 22);
		frmPersonAccount.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(92, 170, 97, 25);
		frmPersonAccount.getContentPane().add(btnNewButton);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(201, 170, 97, 25);
		frmPersonAccount.getContentPane().add(btnFind);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(302, 170, 97, 25);
		frmPersonAccount.getContentPane().add(btnRemove);
		
		JButton btnPrintRegister = new JButton("Print register");
		btnPrintRegister.setBounds(411, 170, 131, 25);
		frmPersonAccount.getContentPane().add(btnPrintRegister);
		
		JLabel lblNewLabel_1 = new JLabel("Response");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(92, 208, 450, 61);
		frmPersonAccount.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAccountNumber = new JLabel("Account number");
		lblAccountNumber.setBounds(52, 347, 97, 16);
		frmPersonAccount.getContentPane().add(lblAccountNumber);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(52, 392, 97, 16);
		frmPersonAccount.getContentPane().add(lblBalance);
		
		JLabel lblOwner = new JLabel("Owner (pnr)");
		lblOwner.setBounds(52, 441, 97, 16);
		frmPersonAccount.getContentPane().add(lblOwner);
		
		JButton button = new JButton("Add");
		button.setBounds(93, 481, 97, 25);
		frmPersonAccount.getContentPane().add(button);
		
		JButton button_1 = new JButton("Find");
		button_1.setBounds(202, 481, 97, 25);
		frmPersonAccount.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Remove");
		button_2.setBounds(313, 481, 97, 25);
		frmPersonAccount.getContentPane().add(button_2);
		
		JButton btnShow = new JButton("Print accounts");
		btnShow.setBounds(286, 437, 124, 25);
		frmPersonAccount.getContentPane().add(btnShow);
		
		JLabel lblNewLabel_2 = new JLabel("Response");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(92, 519, 377, 69);
		frmPersonAccount.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(165, 347, 116, 22);
		frmPersonAccount.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(165, 392, 116, 22);
		frmPersonAccount.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(165, 438, 116, 22);
		frmPersonAccount.getContentPane().add(textField_4);
	}
}
