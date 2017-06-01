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

public class FlashingLabels extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlashingLabels frame = new FlashingLabels();
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
	public FlashingLabels() {
		setTitle("Bruno Flashing Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCmpt = new JLabel("CMPT 330 Rocks");
		lblCmpt.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCmpt.setForeground(Color.MAGENTA);
		lblCmpt.setBounds(127, 32, 200, 66);
		contentPane.add(lblCmpt);
		
		JLabel lblDBM = new JLabel("So Does DBM");
		lblDBM.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDBM.setForeground(Color.BLUE);
		lblDBM.setBounds(137, 110, 140, 25);
		contentPane.add(lblDBM);
		
		JButton btnFancy = new JButton("Fancy");
		
		btnFancy.setBounds(31, 183, 117, 29);
		contentPane.add(btnFancy);
		
		JButton btnFancier = new JButton("Fancier");
		
		btnFancier.setBounds(233, 183, 117, 29);
		contentPane.add(btnFancier);
		
			btnFancy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				lblDBM.setVisible(!lblDBM.isVisible());
			}
			});
			
			btnFancier.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			
					lblCmpt.setVisible(!lblCmpt.isVisible());
					lblDBM.setVisible(!lblDBM.isVisible());
				
				}
			});
		
	}
}
