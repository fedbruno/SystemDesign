import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;


public class BrunoAddBookFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblBookID = new JLabel("BookID:");
	private final JLabel lblBookName = new JLabel("BookName:");
	private final JTextField booknameTF = new JTextField();
	private final JLabel lblAuthorName = new JLabel("AuthorName:");
	private final JTextField authornameTF = new JTextField();
	private final JLabel lblCategory = new JLabel("Category:");
	private final JLabel lblWholeSalePrice = new JLabel("WholeSalePrice:");
	private final JLabel lblRetailPrice = new JLabel("RetailPrice:");
	private final JLabel lblQOH = new JLabel("QOH:");
	private final JLabel lblMinQuant = new JLabel("MinQuant:");
	private final JButton btnInsert = new JButton("Insert");
	private final JLabel lblEnterOrComplete = new JLabel("Enter or complete each field to add information for a new book");
	private final JComboBox categoryCB = new JComboBox();
	private final JButton btnCancel = new JButton("Cancel");
	private final JFormattedTextField idFTF = new JFormattedTextField();
	private final JFormattedTextField wholepriceFTF = new JFormattedTextField();
	private final JFormattedTextField retailpriceFTF = new JFormattedTextField();
	private final JFormattedTextField qohFTF = new JFormattedTextField();
	private final JFormattedTextField minquantFTF = new JFormattedTextField();

	
	/**
	 * Create the frame.
	 */
	public BrunoAddBookFrame() {
		authornameTF.setToolTipText("<html>\r\nPlease enter the name of the author<br>\r\n(Limited to 20 characters)\r\n</html>");
		authornameTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				do_authornameTF_keyTyped(arg0);
			}
		});
		authornameTF.setBounds(186, 156, 103, 20);
		authornameTF.setColumns(10);
		booknameTF.setToolTipText("<html>\r\nPlease enter a unique book title<br>\r\n(limited to 20 chracters)\r\n</html>");
		booknameTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				do_booknameTF_keyTyped(arg0);
			}
		});
		booknameTF.setBounds(186, 113, 103, 20);
		booknameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Add Book Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBookID.setBounds(45, 78, 46, 14);
		contentPane.add(lblBookID);
		
		lblBookName.setBounds(45, 119, 75, 14);
		contentPane.add(lblBookName);
		contentPane.add(booknameTF);
		
		lblAuthorName.setBounds(45, 159, 75, 14);
		contentPane.add(lblAuthorName);
		contentPane.add(authornameTF);
		
		lblCategory.setBounds(45, 202, 75, 14);
		contentPane.add(lblCategory);
		categoryCB.setToolTipText("Please select a category from the dropdown list");
		categoryCB.setModel(new DefaultComboBoxModel(new String[] {"Humor", "Biography", "Autobiography", "Literature", "Mystery", "Graphic Novel", "Young Adult", "Romance", "SciFi", "Other"}));
		categoryCB.setBounds(186, 196, 103, 20);
		contentPane.add(categoryCB);
		
		lblWholeSalePrice.setBounds(43, 245, 103, 14);
		contentPane.add(lblWholeSalePrice);
		
		lblRetailPrice.setBounds(45, 288, 80, 14);
		contentPane.add(lblRetailPrice);
		lblQOH.setToolTipText("Quantity On Hand");
		
		lblQOH.setBounds(45, 327, 46, 14);
		contentPane.add(lblQOH);
		lblMinQuant.setToolTipText("Minimum Quantity Allowed");
		
		lblMinQuant.setBounds(45, 370, 75, 14);
		contentPane.add(lblMinQuant);
		
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnInsert_actionPerformed(arg0);
			}
		});
		btnInsert.setBounds(45, 410, 89, 23);
		contentPane.add(btnInsert);
		
		lblEnterOrComplete.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterOrComplete.setBounds(45, 26, 428, 14);
		contentPane.add(lblEnterOrComplete);
		idFTF.setToolTipText("<html>\r\nPlease enter a unique<br>\r\nID number<br>\r\n(must be positive)\r\n</html>");
		
		idFTF.setBounds(186, 72, 103, 20);
		contentPane.add(idFTF);
		wholepriceFTF.setToolTipText("Please enter a positive wholesale price");
		
		wholepriceFTF.setBounds(186, 242, 103, 20);
		contentPane.add(wholepriceFTF);
		retailpriceFTF.setToolTipText("<html>\r\nPlease enter a positive retail price <br>\r\n(Should be greater than the wholesale price)\r\n</html>");
		
		retailpriceFTF.setBounds(186, 282, 103, 20);
		contentPane.add(retailpriceFTF);
		qohFTF.setToolTipText("Please enter positive quantity on hand");
		
		qohFTF.setBounds(186, 324, 103, 20);
		contentPane.add(qohFTF);
		minquantFTF.setToolTipText("Please enter minimum quantity allowed");
		
		minquantFTF.setBounds(186, 367, 103, 20);
		contentPane.add(minquantFTF);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnCancel_actionPerformed(arg0);
			}
		});
		btnCancel.setBounds(186, 410, 89, 23);	
		contentPane.add(btnCancel);

		//Load the Driver
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//Cancel button
	protected void do_btnCancel_actionPerformed(ActionEvent arg0) {
	this.dispose();
	}
	

protected void do_btnInsert_actionPerformed(ActionEvent arg0) {
	
if (idFTF.getText().isEmpty() || booknameTF.getText().isEmpty() || authornameTF.getText().isEmpty() || wholepriceFTF.getText().isEmpty() || retailpriceFTF.getText().isEmpty() || qohFTF.getText().isEmpty() || minquantFTF.getText().isEmpty()){
	JOptionPane.showMessageDialog(this, "All fields must be filled.", "Missing Data", JOptionPane.ERROR_MESSAGE);
}

else {
			Statement stmt = null;
			ResultSet rs = null;
			String insQuery = "";
			String dupCheck = null;
			
			try{
				
				//Establish connection
				Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Public/BrunoBookFace.accdb"); 
				
				//Create statement for duplicate
				stmt = conn.createStatement();
				dupCheck = "SELECT * FROM Inventory WHERE Inventory.BookID= "+ idFTF.getValue() + " OR Inventory.BookName= "+ "'" +booknameTF.getText().trim()+ "'";
					
				//Execute statement for duplicate		
				rs = stmt.executeQuery(dupCheck);	
				
				if(rs.next())
					JOptionPane.showMessageDialog(this, "The entered BookID or BookName already in use.\nPlease enter a different BookID or BookName", "No Duplicates Allowed", JOptionPane.ERROR_MESSAGE);
				else {
				
				//Create statement for insert
				stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); 
				
				//INSERT
				insQuery = "INSERT INTO Inventory (BookID, BookName, AuthorName, Category, WholeSalePrice, RetailPrice, QOH, MinQuant) VALUES(";
				insQuery += idFTF.getText() + ", ";
				insQuery += "'" + booknameTF.getText().trim() + "',";
				insQuery += "'" + authornameTF.getText().trim() + "', ";
				insQuery += "'" + categoryCB.getSelectedItem() + "', ";
				insQuery += wholepriceFTF.getText() + ", ";
				insQuery += retailpriceFTF.getText() + ", ";
				insQuery += qohFTF.getText() + ", ";
				insQuery += minquantFTF.getText() + ");";
				
				//Execute
				stmt.executeUpdate(insQuery);
				
				
				//Clean Up
				rs.close();
				conn.close();	
								
		}		
			} catch (SQLException ex) { 
				System.out.println("SQL Exception: " + ex.getMessage());
				System.out.println("SQL State: " + ex.getSQLState());
				System.out.println("Vendor Error: " + ex.getErrorCode());
				ex.printStackTrace();
			} //catch
		
this.dispose();
	}
}
	//limits book name to 20 characters 
	protected void do_booknameTF_keyTyped(KeyEvent arg0) {
		if(booknameTF.getText().length()>= 20) {  
			JOptionPane.showMessageDialog(this, "The entered Book Name exceeds the maximum number of characters", "Input Warning", JOptionPane.WARNING_MESSAGE);
			booknameTF.setText(booknameTF.getText().substring(0,19));
	}
}
	//limits author name to 20 characters 
	protected void do_authornameTF_keyTyped(KeyEvent arg0) {
		if(authornameTF.getText().length()>=20) {  
			JOptionPane.showMessageDialog(this, "The entered Author Name exceeds the maximum number of characters", "Input Warning", JOptionPane.WARNING_MESSAGE);
			authornameTF.setText(authornameTF.getText().substring(0,19));	
		}
	}
}