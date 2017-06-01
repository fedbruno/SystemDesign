import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BrunoTabbedPaneFrame extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel namePanel = new JPanel();
	private final JLabel lblAddress = new JLabel("Name:");
	private final JTextField enternameTextField = new JTextField();
	private final JPanel AddressPanel = new JPanel();
	private final JLabel lblAddress_1 = new JLabel("Address:");
	private final JTextField enteraddressTextField = new JTextField();
	private final JPanel summaryPanel = new JPanel();
	private final JLabel lblNameAns = new JLabel("Name:");
	private final JLabel lblCity = new JLabel("CIty:");
	private final JLabel lblState = new JLabel("State:");
	private final JLabel lblZip = new JLabel("Zip:");
	private final JTextField entercityTextField = new JTextField();
	private final JTextField enterstateTextField = new JTextField();
	private final JTextField enterzipTextField = new JTextField();
	private final JLabel lblAddressAns = new JLabel("Address:");
	private final JLabel lblStateAns = new JLabel("State:");
	private final JLabel lblCityAns = new JLabel("City:");
	private final JLabel lblZipAns = new JLabel("Zip:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoTabbedPaneFrame frame = new BrunoTabbedPaneFrame();
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
	public BrunoTabbedPaneFrame() {
		enterzipTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_enterzipTextField_actionPerformed(e);
			}
		});
		enterzipTextField.setText("Enter Zip:");
		enterzipTextField.setBounds(114, 178, 134, 28);
		enterzipTextField.setColumns(10);
		enterstateTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_enterstateTextField_actionPerformed(e);
			}
		});
		enterstateTextField.setText("Enter State:\n");
		enterstateTextField.setBounds(114, 130, 134, 28);
		enterstateTextField.setColumns(10);
		entercityTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_entercityTextField_actionPerformed(e);
			}
		});
		entercityTextField.setText("Enter City:\n");
		entercityTextField.setBounds(114, 85, 134, 28);
		entercityTextField.setColumns(10);
		enteraddressTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_txtEnterAddress_actionPerformed(e);
			}
		});
		enteraddressTextField.setText("Enter Address:\n");
		enteraddressTextField.setToolTipText("");
		enteraddressTextField.setBounds(114, 36, 134, 28);
		enteraddressTextField.setColumns(10);
		enternameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_txtEnterName_actionPerformed(e);
			}
		});
		enternameTextField.setText("Enter Name:");
		enternameTextField.setBounds(114, 41, 134, 28);
		enternameTextField.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Tabbed Pane Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 6, 678, 378);
		
		contentPane.add(tabbedPane);
		namePanel.setToolTipText("");
		
		tabbedPane.addTab("Name", null, namePanel, null);
		namePanel.setLayout(null);
		lblAddress.setBounds(28, 47, 74, 16);
		
		namePanel.add(lblAddress);
		
		namePanel.add(enternameTextField);
		
		tabbedPane.addTab("Address", null, AddressPanel, null);
		AddressPanel.setLayout(null);
		lblAddress_1.setBounds(31, 42, 61, 16);
		
		AddressPanel.add(lblAddress_1);
		
		AddressPanel.add(enteraddressTextField);
		lblCity.setBounds(31, 91, 61, 16);
		
		AddressPanel.add(lblCity);
		lblState.setBounds(31, 136, 61, 16);
		
		AddressPanel.add(lblState);
		lblZip.setBounds(31, 184, 61, 16);
		
		AddressPanel.add(lblZip);
		
		AddressPanel.add(entercityTextField);
		
		AddressPanel.add(enterstateTextField);
		
		AddressPanel.add(enterzipTextField);
		
		tabbedPane.addTab("Summary", null, summaryPanel, null);
		summaryPanel.setLayout(null);
		lblNameAns.setBounds(51, 60, 195, 16);
		
		summaryPanel.add(lblNameAns);
		lblAddressAns.setBounds(51, 103, 182, 16);
		
		summaryPanel.add(lblAddressAns);
		lblStateAns.setBounds(52, 179, 195, 16);
		
		summaryPanel.add(lblStateAns);
		lblCityAns.setBounds(52, 141, 195, 16);
		
		summaryPanel.add(lblCityAns);
		lblZipAns.setBounds(51, 225, 195, 16);
		
		summaryPanel.add(lblZipAns);
	
	}
	protected void do_txtEnterName_actionPerformed(ActionEvent e) {
		if(!(enternameTextField.getText().isEmpty())) {
		lblNameAns.setText(enternameTextField.getText());
		lblNameAns.setForeground(Color.BLACK);
		}
		else 
		{
			lblNameAns.setText("Fill out text field.");
			lblNameAns.setForeground(Color.RED);		
		}
			
	}
	protected void do_txtEnterAddress_actionPerformed(ActionEvent e) {
		if(!(enteraddressTextField.getText().isEmpty())) {
		lblAddressAns.setText(enteraddressTextField.getText());
		lblAddressAns.setForeground(Color.BLACK);
		}
		else 
		{
			lblAddressAns.setText("Fill out address text field.");
			lblAddressAns.setForeground(Color.RED);		
		}
		}
	protected void do_entercityTextField_actionPerformed(ActionEvent e) {
		if(!(entercityTextField.getText().isEmpty())) {
		lblCityAns.setText(entercityTextField.getText());
		lblCityAns.setForeground(Color.BLACK);
	}
		else 
		{
			lblCityAns.setText("Fill out city text field.");
			lblCityAns.setForeground(Color.RED);		
		}
		}
	protected void do_enterstateTextField_actionPerformed(ActionEvent e) {
		if(!(enterstateTextField.getText().isEmpty())) {
		lblStateAns.setText(enterstateTextField.getText());
		lblStateAns.setForeground(Color.BLACK);
	}
		else 
		{
			lblStateAns.setText("Fill out state text field.");
			lblStateAns.setForeground(Color.RED);		
		}
		}
	protected void do_enterzipTextField_actionPerformed(ActionEvent e) {
		if(!(enterzipTextField.getText().isEmpty())) {
		lblZipAns.setText(enterzipTextField.getText());
		lblZipAns.setForeground(Color.BLACK);
	}
		else 
		{
			lblZipAns.setText("Fill out zip text field.");
			lblZipAns.setForeground(Color.RED);		
		}
	}
}
//homework: February 15, 2017