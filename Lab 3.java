import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BrunoDialogFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblPleaseEnterA = new JLabel("Please Enter a Postive Number:");
	private final JTextField posnumTF = new JTextField();
	private final JButton btnProcess = new JButton("Process");
	private final JLabel lblResultPos = new JLabel("Result:");
	private final JButton btnExit = new JButton("Exit");
	private final JLabel lblNewLabel = new JLabel("Please Enter a Negative Number:");
	private final JTextField negnumTF = new JTextField();
	private final JLabel lblResultNeg = new JLabel("Result:");
	private final JButton btn1 = new JButton("Click Here");
	private final JButton btn2 = new JButton("Click Here");
	private final JButton btn3 = new JButton("Click Here");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoDialogFrame frame = new BrunoDialogFrame();
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
	public BrunoDialogFrame() {
	
		negnumTF.setText("0");
		negnumTF.setBounds(247, 60, 109, 28);
		negnumTF.setColumns(10);
		
		posnumTF.setText("0");
		posnumTF.setBounds(247, 32, 109, 28);
		posnumTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Dialog Examples");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblPleaseEnterA.setBounds(21, 38, 193, 16);
		
		contentPane.add(lblPleaseEnterA);
		
		contentPane.add(posnumTF);
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnProcess_actionPerformed(e);
			}
		});
		btnProcess.setBounds(74, 102, 117, 29);
		
		contentPane.add(btnProcess);
		lblResultPos.setBounds(368, 38, 61, 16);
		
		contentPane.add(lblResultPos);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnExit_actionPerformed(e);
			}
		});
		btnExit.setBounds(234, 102, 117, 29);
		
		contentPane.add(btnExit);
		lblNewLabel.setBounds(21, 66, 210, 16);
		
		contentPane.add(lblNewLabel);
		
		contentPane.add(negnumTF);
		lblResultNeg.setBounds(368, 72, 61, 16);
		
		contentPane.add(lblResultNeg);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		btn1.setBounds(48, 169, 117, 29);
		
		contentPane.add(btn1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn2_actionPerformed(e);
			}
		});
		btn2.setBounds(164, 169, 139, 29);
		
		contentPane.add(btn2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn3_actionPerformed(e);
			}
		});
		btn3.setBounds(302, 169, 131, 29);
		
		contentPane.add(btn3);
	}
	
	protected void do_btnExit_actionPerformed(ActionEvent e) {
		this.dispose();
	}

	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Object[] options = {"Not really", "Maybe", "Yes!"};
		int x = JOptionPane.showOptionDialog(this, "Do you like System Design?", "Show Option Dialog Example 1", 
		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		
		if (x ==2)
		{
			JOptionPane.showMessageDialog(this, "Awesome!");
		}
	}
	
	protected void do_btn2_actionPerformed(ActionEvent e) {
	
		Object[] possibilities = {"New York", "Lousiana", "California"};
		Icon icon = null;
		String s = (String)JOptionPane.showInputDialog(this,"What is the best state  out of these three choices", 
				"Show Input Dialog Example 2", JOptionPane.PLAIN_MESSAGE, icon, possibilities, "New York");
		if (s == "Lousiana")
		{
			JOptionPane.showMessageDialog(this, "Good answer!");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Try again!");
			JOptionPane.showInputDialog(this,"What is the best state  out of these three choices", 
			"Show Input Dialog Example 2", JOptionPane.PLAIN_MESSAGE, icon, possibilities, "New York");
		}
	}	
	protected void do_btn3_actionPerformed(ActionEvent e) {
	String s = (String) JOptionPane.showInputDialog(this, "Enter a number between 1 and 5", "Show Input Dialog", JOptionPane.PLAIN_MESSAGE);
	if (s.isEmpty())
	{
		JOptionPane.showMessageDialog(this, "Type in a number.");
		JOptionPane.showInputDialog(this, "Enter a number between 1 and 5", "Show Input Dialog", JOptionPane.PLAIN_MESSAGE);
		
	}
	else if(Integer.parseInt(s) >5 || Integer.parseInt(s)<1)
	{
		JOptionPane.showMessageDialog(this, "Try again.");
		JOptionPane.showInputDialog(this, "Enter a number between 1 and 5", "Show Input Dialog", JOptionPane.PLAIN_MESSAGE);
	}
	}
	
	protected void do_btnProcess_actionPerformed(ActionEvent e) {
		if (Integer.parseInt(posnumTF.getText()) <= 0)
		{
			JOptionPane.showMessageDialog(this, "Must be positive");
		}
		else {
				lblResultPos.setText(posnumTF.getText());
		}
		
		if (Integer.parseInt(negnumTF.getText()) > 0)
		{
			JOptionPane.showMessageDialog(this, "Must be negative");
		}
		else lblResultNeg.setText(negnumTF.getText());
	
		}	
}