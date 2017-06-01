import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BrunoHwMainFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblUserID = new JLabel("UserID:");
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblGpa = new JLabel("GPA:");
	private final JTextField userIDTF = new JTextField();
	private final JTextField nameTF = new JTextField();
	private final JTextField gpaTF = new JTextField();
	private final JButton btnAdd = new JButton("Add");
	private final Item theItem = new Item(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoHwMainFrame frame = new BrunoHwMainFrame();
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
	public BrunoHwMainFrame() {
		gpaTF.setBounds(105, 139, 134, 28);
		gpaTF.setColumns(10);
		nameTF.setBounds(105, 88, 134, 28);
		nameTF.setColumns(10);
		userIDTF.setBounds(105, 33, 134, 28);
		userIDTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUserID.setBounds(29, 39, 61, 16);
		
		contentPane.add(lblUserID);
		lblName.setBounds(28, 94, 61, 16);
		
		contentPane.add(lblName);
		lblGpa.setBounds(28, 145, 61, 16);
		
		contentPane.add(lblGpa);
		
		contentPane.add(userIDTF);
		
		contentPane.add(nameTF);
		
		contentPane.add(gpaTF);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdd_actionPerformed(e);
			}
		});
		btnAdd.setBounds(68, 202, 117, 29);
		
		contentPane.add(btnAdd);
	}
	protected void do_btnAdd_actionPerformed(ActionEvent e) {
	
	}
}
