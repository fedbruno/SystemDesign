import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class BrunoMenuandMoreFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoMenuandMoreFrame frame = new BrunoMenuandMoreFrame();
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
	public BrunoMenuandMoreFrame() {
	

		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Menus and More");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		
		menuBar.add(mnFile);
		
		JMenu mnMenue = new JMenu("New");
		mnFile.add(mnMenue);
		
		JMenuItem mntmFirst = new JMenuItem("Java Project");
		mnMenue.add(mntmFirst);
		
		JMenuItem mntmSecondd = new JMenuItem("Project...");
		mnMenue.add(mntmSecondd);
		
		JMenuItem mntmClose_1 = new JMenuItem("Open File");
		mnFile.add(mntmClose_1);
		
		JMenuItem mntmClose_2 = new JMenuItem("Close");
		mnFile.add(mntmClose_2);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmCopy = new JMenuItem("Undo Typing");
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Redo");
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mntmPaste.setEnabled(false);
		mnEdit.add(mntmPaste);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnEdit.add(mntmClose);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(16, 37, 86, 16);
		contentPane.add(lblUsername);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(90, 31, 134, 28);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(16, 73, 73, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(90, 65, 134, 28);
		contentPane.add(passwordField);
		
		JButton Loginbutton = new JButton("Login");
		
		Loginbutton.setBounds(90, 117, 117, 29);
		contentPane.add(Loginbutton);
		
		JLabel lblAnswer = new JLabel("Account:");
		lblAnswer.setBounds(16, 176, 208, 16);
		contentPane.add(lblAnswer);
		
		Loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginbutton.getText();
				lblAnswer.setText(usernameTextField.getText() + passwordField.getPassword());	
			}
		});
	}
}
