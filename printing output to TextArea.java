import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BrunoTextExampleHomework2 extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField phoneTextField;
	private JTextField emailTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoTextExampleHomework2 frame = new BrunoTextExampleHomework2();
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
	public BrunoTextExampleHomework2() {
		setTitle("Text Example Homework 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(47, 54, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(47, 82, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setBounds(47, 110, 119, 16);
		contentPane.add(lblPhoneNumber);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(160, 48, 134, 28);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(160, 76, 134, 28);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		phoneTextField = new JTextField();
		phoneTextField.setBounds(160, 104, 134, 28);
		contentPane.add(phoneTextField);
		phoneTextField.setColumns(10);
		
		JButton btnPrint = new JButton("Print");
		
		btnPrint.setBounds(49, 150, 117, 29);
		contentPane.add(btnPrint);
		
		JTextArea outputTextArea = new JTextArea();
		outputTextArea.setBounds(170, 144, 271, 117);
		contentPane.add(outputTextArea);
	
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			boolean x = false;
				if((!(nameTextField.getText().isEmpty())) && (!(emailTextField.getText().isEmpty()))  && (!(phoneTextField.getText().isEmpty())))
				{
					x = true;
					outputTextArea.append("Hello there" + " " + nameTextField.getText() + "\n");
					outputTextArea.append("This is your email:" + " " + emailTextField.getText() + "\n");
					outputTextArea.append("This is your phone number:" + " " + phoneTextField.getText() + "\n");
		
				} 
				else {
					outputTextArea.append("Fill out all textboxes");
					}
			}
		});	
	
	}
}