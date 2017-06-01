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

public class BrunoHwAddFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblUserID = new JLabel("UserID:");
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblGpa = new JLabel("GPA:");
	private final JButton btnClose = new JButton("Close");
	private final Item theItem = new Item(); 
	private final JLabel lblUserIDAns = new JLabel("_____");
	private final JLabel lblNameAns = new JLabel("_____");
	private final JLabel lblGPAans = new JLabel("_____");

	public BrunoHwAddFrame() {
		jbInit();
	}
	
	private void jbInit() {
		setTitle("Add Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblUserID.setBounds(29, 54, 61, 16);
		
		contentPane.add(lblUserID);
		lblName.setBounds(29, 106, 61, 16);
		
		contentPane.add(lblName);
		lblGpa.setBounds(29, 158, 61, 16);
		
		contentPane.add(lblGpa);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnClose_actionPerformed(e);
			}
		});
		btnClose.setBounds(55, 215, 117, 29);
		
		contentPane.add(btnClose);
		lblUserIDAns.setBounds(122, 54, 61, 16);
		
		contentPane.add(lblUserIDAns);
		lblNameAns.setBounds(122, 106, 61, 16);
		
		contentPane.add(lblNameAns);
		lblGPAans.setBounds(122, 158, 61, 16);
		
		contentPane.add(lblGPAans);
	}

	protected void do_btnClose_actionPerformed(ActionEvent e) {
	}
}
