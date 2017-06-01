import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ByRetailPriceFrame extends JFrame {

	NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
	
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblViewItemsLess = new JLabel("<html>\r\nFill out the textboxes below to view items less than a certain price, more than a certain price, or in a range of prices.\r\n<html>");
	private final JLabel lblMinPrice = new JLabel("Minimum Price:");
	private final JLabel lblMaxPrice = new JLabel("Maximum Price:");
	private final JFormattedTextField minFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField maxFTF = new JFormattedTextField(moneyFormat);
	private final JButton btnCancelFilter = new JButton("Cancel");

	private final JButton btnMaxFilter = new JButton("Filter");
	private final JLabel lblRange = new JLabel("Range:");
	private final JLabel lblAnd = new JLabel("and");
	private final JButton btnMinFilter = new JButton("Filter");
	private final JFormattedTextField rangeMinFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField rangeMaxFTF = new JFormattedTextField(moneyFormat);
	private final JButton btnFilter = new JButton("Filter");

	private double price = 0.0;
	
	public ByRetailPriceFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Filter By Retail Price Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(23, 24, 46, 14);
		
		contentPane.add(lblNewLabel);
		lblViewItemsLess.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblViewItemsLess.setBounds(23, 24, 429, 45);
		
		contentPane.add(lblViewItemsLess);
		lblMinPrice.setBounds(23, 122, 106, 14);
		
		contentPane.add(lblMinPrice);
		lblMaxPrice.setBounds(23, 169, 112, 14);
		
		contentPane.add(lblMaxPrice);
		
		minFTF.setBounds(143, 119, 89, 20);
		minFTF.setValue(price);
		contentPane.add(minFTF);
		
		maxFTF.setBounds(143, 166, 89, 20);
		maxFTF.setValue(price);
		contentPane.add(maxFTF);
		btnCancelFilter.setToolTipText("");
		
		btnCancelFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnCancelFilter_actionPerformed(arg0);
			}
		});
		btnCancelFilter.setBounds(188, 340, 89, 23);
		
		contentPane.add(btnCancelFilter);
	
		//Load the Driver
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnMaxFilter.setToolTipText("Applies maximum price filter");
		btnMaxFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnMaxFilter_actionPerformed(arg0);
			}
		});
		btnMaxFilter.setBounds(276, 165, 89, 23);
		
		contentPane.add(btnMaxFilter);
		lblRange.setBounds(23, 217, 46, 14);
		
		contentPane.add(lblRange);
		lblAnd.setBounds(179, 245, 33, 14);
		
		contentPane.add(lblAnd);
		btnMinFilter.setToolTipText("Applies minimum price filter");
		btnMinFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnMinFilter_actionPerformed(arg0);
			}
		});
		btnMinFilter.setBounds(276, 118, 89, 23);
		
		contentPane.add(btnMinFilter);
		rangeMinFTF.setToolTipText("Enter minimum price");
		
		rangeMinFTF.setBounds(143, 214, 89, 20);
		rangeMinFTF.setValue(price);
		contentPane.add(rangeMinFTF);
		rangeMaxFTF.setToolTipText("Enter maximum price");
		
		rangeMaxFTF.setBounds(143, 273, 89, 20);
		rangeMaxFTF.setValue(price);
		contentPane.add(rangeMaxFTF);
		btnFilter.setToolTipText("<html>\r\nApplies range of pricing between<br>\r\nminimum and maximum value<br>\r\nto the table\r\n</html>");
		
		btnFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnFilter_actionPerformed(arg0);
			}
		});
		btnFilter.setBounds(276, 229, 89, 23);
		
		contentPane.add(btnFilter);
	} 
	protected void do_btnMinFilter_actionPerformed(ActionEvent arg0) {
		BrunoBookFaceFrame frame = new BrunoBookFaceFrame();
		String minPrice = minFTF.getValue().toString();
		frame.minFilter = "AND RetailPrice >= " + minPrice;
		this.dispose();
	}
	
	protected void do_btnMaxFilter_actionPerformed(ActionEvent arg0) {
		BrunoBookFaceFrame frame = new BrunoBookFaceFrame();
		String maxPrice = maxFTF.getValue().toString();
		frame.maxFilter = "AND RetailPrice <= " + maxPrice;
		this.dispose();
	}
	
	protected void do_btnCancelFilter_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}

	protected void do_btnFilter_actionPerformed(ActionEvent arg0) {
		BrunoBookFaceFrame frame = new BrunoBookFaceFrame();
		String rangeMinPrice = rangeMinFTF.getValue().toString();
		String rangeMaxPrice = rangeMaxFTF.getValue().toString();
		frame.rangeFilter = "AND RetailPrice <= "+rangeMaxPrice+" AND RetailPrice >="+rangeMinPrice;
		this.dispose();
	}

}