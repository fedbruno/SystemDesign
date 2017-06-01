import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BrunoSwapHideJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoSwapHideJFrame frame = new BrunoSwapHideJFrame();
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
	public BrunoSwapHideJFrame() {
		setTitle("Swap and Hide Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHello = new JLabel("Hello");
		lblHello.setFont(new Font("Curlz MT", Font.PLAIN, 40));
		lblHello.setForeground(Color.MAGENTA);
		lblHello.setBounds(104, 28, 106, 32);
		contentPane.add(lblHello);
		
		JLabel lblItsMe = new JLabel("It's Me");
		lblItsMe.setFont(new Font("Lucida Handwriting", Font.PLAIN, 30));
		lblItsMe.setForeground(Color.ORANGE);
		lblItsMe.setBounds(202, 72, 162, 42);
		contentPane.add(lblItsMe);
		
		JLabel lblAdele = new JLabel("Adele");
		lblAdele.setFont(new Font("Braggadocio", Font.PLAIN, 50));
		lblAdele.setForeground(Color.BLUE);
		lblAdele.setBounds(70, 126, 201, 53);
		contentPane.add(lblAdele);
		
		JButton btnSwap = new JButton("Swap");
		
		btnSwap.setBounds(144, 224, 117, 29);
		contentPane.add(btnSwap);
		
		btnSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//String temp= lblHello.getText();
				//lblHello.setText(lblGoodbye.getText());
				//lblGoodbye.setText(temp);
			
					//Homework 1/23/17
					String temp = lblHello.getText();
					String temp2 = lblAdele.getText();
					lblHello.setText(lblItsMe.getText());
					lblItsMe.setText(temp2);
					lblAdele.setText(temp);
						
			}
		});
	
	lblHello.setVisible(!lblHello.isVisible());
		
	}
}
