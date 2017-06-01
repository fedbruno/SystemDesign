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

public class BrunoSharingDataMainFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblName = new JLabel("Name:");
	private final JTextField nameTF = new JTextField();
	private final JLabel lblNum = new JLabel("Num:");
	private final JTextField numTF = new JTextField();
	private final JLabel lblNamevalue = new JLabel("NameValue:");
	private final JTextField namevalueTF = new JTextField();
	private final JLabel lblNumvalue = new JLabel("NumValue:");
	private final JTextField numvalueTF = new JTextField();
	private final JButton btnAdd = new JButton("Add");
	private final Item theItem = new Item();
	private final JButton btnUpdate = new JButton("Update");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoSharingDataMainFrame frame = new BrunoSharingDataMainFrame();
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
	public BrunoSharingDataMainFrame() {
		numvalueTF.setBounds(310, 89, 134, 28);
		numvalueTF.setColumns(10);
		namevalueTF.setBounds(310, 37, 134, 28);
		namevalueTF.setColumns(10);
		numTF.setBounds(72, 89, 134, 28);
		numTF.setColumns(10);
		nameTF.setBounds(72, 37, 134, 28);
		nameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Sharing Data Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblName.setBounds(20, 43, 61, 16);
		
		contentPane.add(lblName);
		
		contentPane.add(nameTF);
		lblNum.setBounds(20, 95, 61, 16);
		
		contentPane.add(lblNum);
		
		contentPane.add(numTF);
		lblNamevalue.setBounds(218, 43, 105, 16);
		
		contentPane.add(lblNamevalue);
		
		contentPane.add(namevalueTF);
		lblNumvalue.setBounds(218, 95, 68, 16);
		
		contentPane.add(lblNumvalue);
		
		contentPane.add(numvalueTF);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdd_actionPerformed(e);
			}
		});
		btnAdd.setBounds(111, 146, 117, 29);
		
		contentPane.add(btnAdd);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnUpdate_actionPerformed(e);
			}
		});
		btnUpdate.setBounds(265, 146, 117, 29);
		
		contentPane.add(btnUpdate);
	}
	protected void do_btnAdd_actionPerformed(ActionEvent e) {
		if (! nameTF.getText().isEmpty()){
			theItem.setName(nameTF.getText());
		}
		
		if (!numTF.getText().isEmpty()) {
			theItem.setNum(Integer.parseInt(numTF.getText()));
			}
		
		this.dispose();
		AddFrame addFrame = new AddFrame(theItem);
		addFrame.setVisible(true);
		
	}
	protected void do_btnUpdate_actionPerformed(ActionEvent e) {
	lblNamevalue.setText(theItem.getMyName());
	lblNumvalue.setText(theItem.getMyNum() + "");
	}
}
