import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class BrunoGroupsAndMoreFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoGroupsAndMoreFrame frame = new BrunoGroupsAndMoreFrame();
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
	public BrunoGroupsAndMoreFrame() {
		setTitle("Bruno Radio Groups And More");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnOne = new JRadioButton("One");
		//action removed
		buttonGroup.add(rdbtnOne);
		rdbtnOne.setBounds(24, 41, 141, 23);
		contentPane.add(rdbtnOne);
		
		JRadioButton rdbtnTwo = new JRadioButton("Two");
		//removed action
		
		buttonGroup.add(rdbtnTwo);
		rdbtnTwo.setBounds(24, 65, 141, 23);
		contentPane.add(rdbtnTwo);
		
		JRadioButton rdbtnThree = new JRadioButton("Three");
		//removed action
		
		buttonGroup.add(rdbtnThree);
		rdbtnThree.setBounds(24, 89, 141, 23);
		contentPane.add(rdbtnThree);
		
		JRadioButton rdbtnFour = new JRadioButton("Four");
		//action removed
		
		buttonGroup.add(rdbtnFour);
		rdbtnFour.setBounds(24, 110, 141, 23);
		contentPane.add(rdbtnFour);
		
		JLabel lblChooseOne = new JLabel("Choose One");
		lblChooseOne.setBounds(24, 18, 104, 16);
		contentPane.add(lblChooseOne);
		
		JLabel lblChoice = new JLabel("New label");
		lblChoice.setBounds(157, 45, 61, 16);
		contentPane.add(lblChoice);
		
		JCheckBox chckbxFirst = new JCheckBox("First");
		//action removed
		
		chckbxFirst.setBounds(24, 146, 128, 23);
		contentPane.add(chckbxFirst);
		
		JCheckBox chckbxSecond = new JCheckBox("Second");
		//action removed
		
		chckbxSecond.setBounds(24, 170, 128, 23);
		contentPane.add(chckbxSecond);
		
		JCheckBox chckbxThird = new JCheckBox("Third");
		//action removed
		
		chckbxThird.setBounds(24, 194, 128, 23);
		contentPane.add(chckbxThird);
		
		JTextArea checkboxTextArea = new JTextArea();
		checkboxTextArea.setBounds(165, 150, 115, 93);
		contentPane.add(checkboxTextArea);
		
		JSlider slider = new JSlider();
		
		
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setBounds(151, 87, 255, 44);
		contentPane.add(slider);
		
		JLabel lblSliderValue = new JLabel("Slider Value:");
		lblSliderValue.setBounds(286, 45, 120, 16);
		contentPane.add(lblSliderValue);
	
		rdbtnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChoice.setText("One");
			}
		});
	
		rdbtnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChoice.setText("Two");
			}
		});
		
		rdbtnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChoice.setText("Three");
			}
		});
		
		rdbtnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblChoice.setText("Four");
			}
		});
		
		chckbxFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxFirst.isSelected()) {
					checkboxTextArea.append(chckbxFirst.getText() + "\n");
				}
				else {
					checkboxTextArea.setText(null);
				}
			}
		});
	
		chckbxSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSecond.isSelected()) {
					checkboxTextArea.append(chckbxSecond.getText() + "\n");
				}
				else {
					
					checkboxTextArea.setText(null);
				}
			}
		});
		
		chckbxThird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkboxTextArea.setText("");
				if (chckbxThird.isSelected()) 
					checkboxTextArea.append(chckbxThird.getText() + "\n");
				if (chckbxFirst.isSelected()) 
					checkboxTextArea.append(chckbxFirst.getText() + "\n");
				if (chckbxSecond.isSelected()) 
					checkboxTextArea.append(chckbxSecond.getText() + "\n");
						
			}
	
	});

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			lblSliderValue.setText("Slider Value:"  + slider.getValue());
			
			}
		});
		
		
//homework: spinner control: show how to use spinner
		
		
	}
}
//homework: if you uncheck one checkbox, it removes itself from the text area