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
		separator.setBounds(0, 298, 697, 2);
		frmPersonAccount.getContentPane().add(separator);
		
		JLabel lblPersonsManagement = new JLabel("Persons management");
		lblPersonsManagement.setBounds(10, 13, 124, 16);
		frmPersonAccount.getContentPane().add(lblPersonsManagement);
		
		JLabel lblAccountsManagement = new JLabel("Accounts management");
		lblAccountsManagement.setBounds(10, 311, 126, 16);
		frmPersonAccount.getContentPane().add(lblAccountsManagement);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(92, 58, 56, 16);
		frmPersonAccount.getContentPane().add(lblName);
		
		JLabel lblPnbr = new JLabel("pNbr");
		lblPnbr.setBounds(92, 108, 56, 16);
		frmPersonAccount.getContentPane().add(lblPnbr);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(164, 55, 126, 22);
		frmPersonAccount.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_pNbr = new JTextField();
		textField_pNbr.setBounds(164, 105, 126, 22);
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
		
		JLabel lblAccountNumber = new JLabel("Account number");
		lblAccountNumber.setBounds(92, 359, 97, 16);
		frmPersonAccount.getContentPane().add(lblAccountNumber);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(92, 404, 97, 16);
		frmPersonAccount.getContentPane().add(lblBalance);
		
		JLabel lblOwner = new JLabel("Owner (pNbr)");
		lblOwner.setBounds(92, 453, 97, 16);
		frmPersonAccount.getContentPane().add(lblOwner);
		
		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.setBounds(92, 493, 97, 25);
		frmPersonAccount.getContentPane().add(btnAdd_2);
		
		JButton btnFind_2 = new JButton("Find");
		btnFind_2.setBounds(193, 493, 97, 25);
		frmPersonAccount.getContentPane().add(btnFind_2);
		
		JButton btnRemove_2 = new JButton("Remove");
		btnRemove_2.setBounds(295, 493, 97, 25);
		frmPersonAccount.getContentPane().add(btnRemove_2);
		
		JButton btnPrintAccounts = new JButton("Show accounts");
		btnPrintAccounts.setBounds(295, 446, 105, 25);
		frmPersonAccount.getContentPane().add(btnPrintAccounts);
		
		textField_AccountNumber = new JTextField();
		textField_AccountNumber.setColumns(10);
		textField_AccountNumber.setBounds(174, 356, 116, 22);
		frmPersonAccount.getContentPane().add(textField_AccountNumber);
		
		textField_Balance = new JTextField();
		textField_Balance.setColumns(10);
		textField_Balance.setBounds(174, 401, 116, 22);
		frmPersonAccount.getContentPane().add(textField_Balance);
		
		textField_Owner = new JTextField();
		textField_Owner.setColumns(10);
		textField_Owner.setBounds(174, 447, 116, 22);
		frmPersonAccount.getContentPane().add(textField_Owner);
		
		JTextArea response_1 = new JTextArea();
		response_1.setBounds(92, 223, 498, 69);
		frmPersonAccount.getContentPane().add(response_1);
		
		JTextArea response_2 = new JTextArea();
		response_2.setBounds(92, 529, 498, 69);
		frmPersonAccount.getContentPane().add(response_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(92, 480, 308, 2);
		frmPersonAccount.getContentPane().add(separator_1);
	}
}
