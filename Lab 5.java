import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BrunoInputVerifiersFrame extends JFrame {

	private JPanel contentPane;
	
	//before declared objects
	NumberFormat numFormat = NumberFormat.getNumberInstance(); //declare class NumberFormat; getNumberInstance class on class
	NumberFormat numFormatMoney = NumberFormat.getNumberInstance().getCurrencyInstance(); 
	NumberFormat numFormatPercent = NumberFormat.getNumberInstance().getPercentInstance(); 
	
	private final JFormattedTextField num1FTF = new JFormattedTextField(numFormat);
	private final JFormattedTextField num2FTF = new JFormattedTextField(numFormatMoney);
	private final JFormattedTextField num3FTF = new JFormattedTextField(numFormatPercent); //add constructor to objects
	
	private final JLabel lblNum1text = new JLabel("Num1text");
	private final JLabel lblNum1value = new JLabel("Num1value");
	private final JLabel lblNum2text = new JLabel("Num2text");
	private final JLabel lblNum2value = new JLabel("Num2value");
	private final JLabel lblNum3text = new JLabel("Num3text");
	private final JLabel lblNum3value = new JLabel("Num3value");
	
	private double num1 = 1; //declaring num1 as a double sets value as 1.0
	private double num2 = 2;
	private double num3 = 3;
	
	private final JFormattedTextField firstFTF = new JFormattedTextField();
	private final JLabel label = new JLabel("-");
	private final JFormattedTextField secondFTF = new JFormattedTextField();
	private final JLabel label_1 = new JLabel("=");
	private final JFormattedTextField diffFTF = new JFormattedTextField();
	
	private double firstnum = 0;
	private double secondnum = 0;
	private double diff = 0;
	private final JButton btnCalculate = new JButton("Calculate");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //queue first in last out / stack last in first out
			public void run() {
				try {
					BrunoInputVerifiersFrame frame = new BrunoInputVerifiersFrame();
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
	public BrunoInputVerifiersFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Input Verifiers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		num1FTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_num1FTF_propertyChange(evt);
			}
		});
		
		num1FTF.setBounds(29, 52, 104, 28);
		num1FTF.setValue(num1);
		contentPane.add(num1FTF);
		num2FTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_num2FTF_propertyChange(evt);
			}
		});
		
		num2FTF.setBounds(29, 92, 104, 28);
		num2FTF.setValue(num2);
		contentPane.add(num2FTF);
		num3FTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_num3FTF_propertyChange(evt);
			}
		});
	
		//when we associate a main with an object, a listener is created
		
		num3FTF.setBounds(29, 132, 104, 28);
		num3FTF.setValue(num3);
		contentPane.add(num3FTF);
		
		lblNum1text.setBounds(172, 58, 86, 16);
		contentPane.add(lblNum1text);
		
		lblNum1value.setBounds(296, 58, 93, 16);
		contentPane.add(lblNum1value);
		lblNum2text.setBounds(172, 98, 70, 16);
		
		contentPane.add(lblNum2text);
		lblNum2value.setBounds(296, 98, 80, 16);
		
		contentPane.add(lblNum2value);
		lblNum3text.setBounds(172, 138, 70, 16);
		
		contentPane.add(lblNum3text);
		lblNum3value.setBounds(296, 138, 80, 16);
		
		contentPane.add(lblNum3value);
		
		firstFTF.setBounds(29, 189, 98, 28);
		firstFTF.setValue(firstnum);
		contentPane.add(firstFTF);
		
		label.setBounds(139, 195, 8, 16);
		contentPane.add(label);
		
		secondFTF.setBounds(172, 189, 86, 28);
		secondFTF.setValue(secondnum);
		contentPane.add(secondFTF);
		
		label_1.setBounds(274, 195, 10, 16);
		
		contentPane.add(label_1);
		
		diffFTF.setBounds(296, 189, 93, 28);
		diffFTF.setValue(diff);
		contentPane.add(diffFTF);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCalculate_actionPerformed(e);
			}
		});
		btnCalculate.setBounds(155, 231, 117, 29);
		
		contentPane.add(btnCalculate);
	}
	protected void do_num1FTF_propertyChange(PropertyChangeEvent evt) {
	lblNum1text.setText(num1FTF.getText());
	lblNum1value.setText(num1FTF.getValue().toString());
	}
//num1text will display numbers and characters and num1value will only display number
//verifier doing its job
	
	protected void do_firstFTF_propertyChange(PropertyChangeEvent evt) {
	firstnum = ((Number) firstFTF.getValue()).doubleValue();
	secondnum = ((Number) secondFTF.getValue()).doubleValue();
		
	}
	protected void do_num2FTF_propertyChange(PropertyChangeEvent evt) {
		lblNum2text.setText(num2FTF.getText());
		lblNum2value.setText(num2FTF.getValue().toString());
	}
	protected void do_num3FTF_propertyChange(PropertyChangeEvent evt) {
		lblNum3text.setText(num3FTF.getText());
		lblNum3value.setText(num3FTF.getValue().toString());
	}
	protected void do_btnCalculate_actionPerformed(ActionEvent e) {
		firstnum = ((Number) firstFTF.getValue()).doubleValue();
		secondnum = ((Number) secondFTF.getValue()).doubleValue();
		diff = firstnum - secondnum;
		
		if (diff < 0)
		diffFTF.setForeground(Color.RED);
		else diffFTF.setForeground(Color.BLACK);
	}
}
