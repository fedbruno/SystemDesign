import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BrunoCalculatorFrame extends JFrame {

	private JPanel contentPane;
	private final JFormattedTextField firstnumFTF = new JFormattedTextField();
	MaskFormatter firstnumMask= createFormatter("####");
	private final JLabel label = new JLabel("+");
	private final JFormattedTextField secondnumFTF = new JFormattedTextField();
	MaskFormatter secondnumMask= createFormatter("####");
	private final JLabel label_1 = new JLabel("=");
	private final JTextField sumFTF = new JTextField();
	private final JButton btnAddCalc = new JButton("Add Calc");
	
	public MaskFormatter createFormatter(String s) {
	     MaskFormatter formatter = null;
	     try {
	          formatter = new MaskFormatter(s);
	         } 
	     catch (java.text.ParseException exc) {
		          System.err.println("formatter is bad: " + exc.getMessage());
		          System.exit(-1);
		      }
	      return formatter;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoCalculatorFrame frame = new BrunoCalculatorFrame();
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
	public BrunoCalculatorFrame() {
		sumFTF.setBounds(310, 31, 105, 28);
		sumFTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Calculator Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstnumFTF.setBounds(17, 31, 105, 28);
		firstnumMask.setPlaceholder("0");
		firstnumMask.install(firstnumFTF);
		contentPane.add(firstnumFTF);
		
		label.setBounds(133, 37, 18, 16);
		contentPane.add(label);
		
		secondnumFTF.setBounds(165, 31, 105, 28);
		secondnumMask.setPlaceholder("0"); // creates placeholder symbol in java 
		secondnumMask.install(secondnumFTF); // installs numFTF into numMask
		contentPane.add(secondnumFTF); // adds to content pane
		
		label_1.setBounds(286, 37, 18, 16);
		contentPane.add(label_1);
		
		contentPane.add(sumFTF);
		btnAddCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAddCalc_actionPerformed(e);
			}
		});
		
		btnAddCalc.setBounds(143, 65, 117, 29);
		contentPane.add(btnAddCalc);
	}
	
	//Homework due Wednesday 2/8:
	// make two formated text field and have them add to each other when you press calculate button
	// limit each digit to four digits
	
	protected void do_btnAddCalc_actionPerformed(ActionEvent e) {
		int firstnum = Integer.parseInt(firstnumFTF.getText()); // converts FTF into an int value
		int secondnum = Integer.parseInt(secondnumFTF.getText());
		int sum = firstnum + secondnum; // gets sum of 2 int values
		
		String finalSum = Integer.toString(sum); //converts int sum answers to string so it can be an output
		sumFTF.setText(finalSum); // outputs the sum as a string
	}
}
