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
	private JTextField textField_Name;
	private JTextField textField_pNbr;
	private JTextField textField_AccountNumber;
	private JTextField textField_Balance;
	private JTextField textField_Owner;

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
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(92, 58, 56, 16);
		frmPersonAccount.getContentPane().add(lblName);
		
		JLabel lblPnbr = new JLabel("pNbr");
		lblPnbr.setBounds(92, 110, 56, 16);
		frmPersonAccount.getContentPane().add(lblPnbr);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(164, 55, 116, 22);
		frmPersonAccount.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_pNbr = new JTextField();
		textField_pNbr.setBounds(164, 107, 116, 22);
		frmPersonAccount.getContentPane().add(textField_pNbr);
		textField_pNbr.setColumns(10);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.setBounds(92, 149, 97, 25);
		frmPersonAccount.getContentPane().add(btnAdd_1);
		
		JButton btnFind_1 = new JButton("Find");
		btnFind_1.setBounds(193, 149, 97, 25);
		frmPersonAccount.getContentPane().add(btnFind_1);
		
		JButton btnRemove_1 = new JButton("Remove");
		btnRemove_1.setBounds(295, 149, 97, 25);
		frmPersonAccount.getContentPane().add(btnRemove_1);
		
		JButton btnPrintRegister = new JButton("Print register");
		btnPrintRegister.setBounds(92, 187, 300, 25);
		frmPersonAccount.getContentPane().add(btnPrintRegister);
		
		JLabel lblResponse_1 = new JLabel("Response");
		lblResponse_1.setVerticalAlignment(SwingConstants.TOP);
		lblResponse_1.setBounds(92, 217, 450, 52);
		frmPersonAccount.getContentPane().add(lblResponse_1);
		
		JLabel lblAccountNumber = new JLabel("Account number");
		lblAccountNumber.setBounds(52, 347, 97, 16);
		frmPersonAccount.getContentPane().add(lblAccountNumber);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(52, 392, 97, 16);
		frmPersonAccount.getContentPane().add(lblBalance);
		
		JLabel lblOwner = new JLabel("Owner (pnr)");
		lblOwner.setBounds(52, 441, 97, 16);
		frmPersonAccount.getContentPane().add(lblOwner);
		
		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.setBounds(93, 481, 97, 25);
		frmPersonAccount.getContentPane().add(btnAdd_2);
		
		JButton btnFind_2 = new JButton("Find");
		btnFind_2.setBounds(202, 481, 97, 25);
		frmPersonAccount.getContentPane().add(btnFind_2);
		
		JButton btnRemove_2 = new JButton("Remove");
		btnRemove_2.setBounds(313, 481, 97, 25);
		frmPersonAccount.getContentPane().add(btnRemove_2);
		
		JButton btnPrintAccounts = new JButton("Print accounts");
		btnPrintAccounts.setBounds(286, 437, 124, 25);
		frmPersonAccount.getContentPane().add(btnPrintAccounts);
		
		JLabel lblResponse_2 = new JLabel("Response");
		lblResponse_2.setVerticalAlignment(SwingConstants.TOP);
		lblResponse_2.setBounds(92, 519, 377, 69);
		frmPersonAccount.getContentPane().add(lblResponse_2);
		
		textField_AccountNumber = new JTextField();
		textField_AccountNumber.setColumns(10);
		textField_AccountNumber.setBounds(165, 347, 116, 22);
		frmPersonAccount.getContentPane().add(textField_AccountNumber);
		
		textField_Balance = new JTextField();
		textField_Balance.setColumns(10);
		textField_Balance.setBounds(165, 392, 116, 22);
		frmPersonAccount.getContentPane().add(textField_Balance);
		
		textField_Owner = new JTextField();
		textField_Owner.setColumns(10);
		textField_Owner.setBounds(165, 438, 116, 22);
		frmPersonAccount.getContentPane().add(textField_Owner);
	}
}
