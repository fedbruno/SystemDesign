import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class BrunoPizza2 extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoPizza2 frame = new BrunoPizza2();
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
	public BrunoPizza2() {
		setTitle("Bruno Pizzaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBrunosPizzaria = new JLabel("Bruno's Pizzaria");
		lblBrunosPizzaria.setFont(new Font("Lucida Grande", Font.ITALIC, 20));
		lblBrunosPizzaria.setForeground(Color.RED);
		lblBrunosPizzaria.setBounds(144, 16, 177, 30);
		contentPane.add(lblBrunosPizzaria);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(6, 47, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblToppings = new JLabel("Toppings:");
		lblToppings.setBounds(6, 75, 77, 16);
		contentPane.add(lblToppings);
		
		JComboBox sizeComboBox = new JComboBox();
		sizeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Extra Large", "Large", "Medium", "Small", "Individual"}));
		sizeComboBox.setBounds(79, 43, 126, 27);
		contentPane.add(sizeComboBox);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		
		btnPlaceOrder.setBounds(79, 243, 117, 29);
		contentPane.add(btnPlaceOrder);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 80, 122, 153);
		contentPane.add(scrollPane);
		
		JList toppingsList = new JList();
		scrollPane.setViewportView(toppingsList);
		toppingsList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Extra Cheese", "Pepperoni", "Mushrooms", "Olives", "Onions", "Spinach", "Bacon", "Anchovies", "Pineapples"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(213, 75, 61, 16);
		contentPane.add(lblName);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(266, 69, 134, 28);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JTextArea orderTextArea = new JTextArea();
		orderTextArea.setBounds(213, 103, 223, 100);
		contentPane.add(orderTextArea);
		
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(nameTextField.getText().isEmpty())) {
				orderTextArea.append(nameTextField.getText() + " " + "you ordered a(n) " + sizeComboBox.getSelectedItem().toString() + " " + "pizza\n");
				orderTextArea.append("with the following toppings:\n");
				Object[] chosenList = toppingsList.getSelectedValues();
				for (int i=0; i< chosenList.length; i++)		
					orderTextArea.append(chosenList[i].toString() + "\n");
				}
				else { //homework3
					orderTextArea.append("You did not enter name.");
				}
				
				}
		});
	}
}