import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
//import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;

public class BrunoBookFaceFrame extends JFrame {

	private JPanel contentPane;
	private final JTable inventoryTable = new JTable();
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnTools = new JMenu("Tools");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmAddBook = new JMenuItem("Add Book");
	private final JMenu mnSetSort = new JMenu("Set Sort");
	private final JMenuItem mntmByBookName = new JMenuItem("By Book Name");
	private final JMenuItem mntmByRetailPrice = new JMenuItem("By Retail Price");
	private final JMenuItem mntmByCategory = new JMenuItem("By Category");
	private final JMenu mnSetFilter = new JMenu("Set Filter");
	private final JButton btnQuery = new JButton("Query");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblCurrentFilter = new JLabel("Current Filter:");
	private final JLabel lblCurrentSort = new JLabel("Current Sort:");
	private final JButton btnRemoveSort = new JButton("Remove Current Sort");
	private final JButton btnRemoveFilter = new JButton("Remove Current Filter");
	private static String SortOption = "BookID";
	private final JLabel lblSortOption = new JLabel("BookID (Default)");
	public final JLabel lblFilterOption = new JLabel("None");
	private final JCheckBoxMenuItem chckbxmntmByRetauilPrice = new JCheckBoxMenuItem("By Retail Price");
	private final JCheckBoxMenuItem chckbxmntmByCategory = new JCheckBoxMenuItem("By Category");
	private final JMenuItem mntmHelp = new JMenuItem("Help");
	
	//creates the variables to be shared to the RetailPriceFrame
	public static String minFilter = "";
	public static String maxFilter = "";
	public static String rangeFilter = ""; 
	
	//creates the variable to be shared to the CategoryFrame 
	public static String selectedCategory = "";
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoBookFaceFrame frame = new BrunoBookFaceFrame();
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
	public BrunoBookFaceFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("BrunoBookFaceFrame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1269, 776);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmExit_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnTools);
		mntmAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmAddBook_actionPerformed(arg0);
			}
		});
		
		mnTools.add(mntmAddBook);
		
		mnTools.add(mnSetSort);
		mntmByBookName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmByBookName_actionPerformed(arg0);
			}
		});
		
		mnSetSort.add(mntmByBookName);
		mntmByRetailPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmByRetailprice_actionPerformed(arg0);
			}
		});
		
		mnSetSort.add(mntmByRetailPrice);
		mntmByCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmByCategory_actionPerformed(arg0);
			}
		});
		
		mnSetSort.add(mntmByCategory);
		
		mnTools.add(mnSetFilter);
		chckbxmntmByRetauilPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_chckbxmntmByRetauilPrice_actionPerformed(arg0);
			}
		});
		
		mnSetFilter.add(chckbxmntmByRetauilPrice);
		chckbxmntmByCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_chckbxmntmByCategory_actionPerformed(arg0);
			}
		});
		
		mnSetFilter.add(chckbxmntmByCategory);
		
		menuBar.add(mnHelp);
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(24, 128, 1153, 415);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(inventoryTable);
		
		inventoryTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"BookID", "BookName", "AuthorName", "Category", "WholeSalePrice", "RetailPrice", "QOH", "MinQuant"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Float.class, Float.class, Integer.class, Integer.class
			};
			

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		/*
		inventoryTable.getColumnModel().getColumn(0).setResizable(false);
		inventoryTable.getColumnModel().getColumn(1).setResizable(false);
		inventoryTable.getColumnModel().getColumn(2).setResizable(false);
		inventoryTable.getColumnModel().getColumn(3).setResizable(false);
		inventoryTable.getColumnModel().getColumn(4).setResizable(false);
		inventoryTable.getColumnModel().getColumn(5).setResizable(false);
		inventoryTable.getColumnModel().getColumn(6).setResizable(false);
		inventoryTable.getColumnModel().getColumn(7).setResizable(false);
		*/
		btnQuery.setToolTipText("Displays table results");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnQuery_actionPerformed(arg0);
			}
		});
	
		btnQuery.setBounds(516, 554, 89, 23);
		
		contentPane.add(btnQuery);
	
		//Load the Driver
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblCurrentFilter.setBounds(20, 666, 96, 14);
		
		contentPane.add(lblCurrentFilter);
		lblCurrentSort.setBounds(20, 621, 96, 14);
		
		contentPane.add(lblCurrentSort);
		btnRemoveSort.setToolTipText("Removes current sort");
		btnRemoveSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnRemoveCurrentSort_actionPerformed(arg0);
			}
		});
		
		btnRemoveSort.setBounds(337, 617, 179, 23);
		contentPane.add(btnRemoveSort);
		btnRemoveFilter.setToolTipText("Removes current filter");
		btnRemoveFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnRemoveCurrentFilter_actionPerformed(arg0);
			}
		});
		
		btnRemoveFilter.setBounds(337, 662, 179, 23);
		contentPane.add(btnRemoveFilter);
		
		lblSortOption.setBounds(110, 621, 179, 14);
		
		contentPane.add(lblSortOption);
		lblFilterOption.setBounds(110, 666, 179, 14);
		
		contentPane.add(lblFilterOption);
	
	}	
	
	//Menu Bar File > Exist  
	protected void do_mntmExit_actionPerformed(ActionEvent arg0) {
	this.dispose();
	}
	
	//Menu Bar Tools > AddBook pop-up window 
	protected void do_mntmAddBook_actionPerformed(ActionEvent arg0) {
		BrunoAddBookFrame frame = new BrunoAddBookFrame();
		frame.setVisible(true);
	}

	
	//Main Query generator with appending sql statements corresponding to different static variables  
	public void queryJTable(){
	
		ResultSet rs = null;
		Statement stmt = null;
		String theQuery = "SELECT BookID, BookName, AuthorName, Category, WholeSalePrice, RetailPrice, QOH, MinQuant FROM Inventory WHERE 1=1 ";
		
		theQuery += selectedCategory; //query append for the CategoryFrame
		
		//query append for the RetailPriceFrame
		theQuery += minFilter ;
		theQuery += maxFilter;
		theQuery += rangeFilter;
	
		theQuery += " ORDER BY " + SortOption; //query append for the Sort operation 
		
		try {
			//Establish the connection 
			Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Public/BrunoBookFace.accdb");
			//Create the statement
			stmt = conn.createStatement();
			//Execute the statement
			rs = stmt.executeQuery(theQuery);
			
			//Remove previously added rows from JTable
			while (inventoryTable.getRowCount() > 0)
				((DefaultTableModel) inventoryTable.getModel()).removeRow(0);
			
			int numColumns = rs.getMetaData().getColumnCount();
			
			while(rs.next())
			{
				//create an object to hold a record
				Object[] row = new Object[numColumns];
				
				//grab the fields from the records and put into row
				for (int i = 0; i < numColumns; i++)
				{
					row[i] = rs.getObject(i+1);
				}//for
			
				//insert this row into JTable
				((DefaultTableModel) inventoryTable.getModel()).insertRow(rs.getRow() -1, row);
			
			}//while
		
			//clean up
			rs.close();
			conn.close();
		}//try 
		
		catch (SQLException ex)
		{
			System.out.println("SQL Exception: " + ex.getMessage());
			System.out.println("SQL State: " + ex.getSQLState());
			System.out.println("Vendor Error: " + ex.getErrorCode());
			ex.printStackTrace();
		} //catch	
	}
	
	public void do_btnQuery_actionPerformed(ActionEvent arg0) {
		
		if (!(selectedCategory ==  "")){
			lblFilterOption.setText("Category Filter");
		}
			queryJTable();
	}
	//Sorts items by RetailPrice
	protected void do_mntmByRetailprice_actionPerformed(ActionEvent arg0) {
		SortOption = "Inventory.RetailPrice";
		queryJTable();
		lblSortOption.setText("Retail Price");
		btnRemoveSort.setEnabled(true);
	}
	
	//Sorts items by Category
	protected void do_mntmByCategory_actionPerformed(ActionEvent arg0) {
		SortOption = "Inventory.Category";
		queryJTable();
		lblSortOption.setText("Category");
		btnRemoveSort.setEnabled(true);
	}
	
	//Sorts items by BookName
	protected void do_mntmByBookName_actionPerformed(ActionEvent arg0) {
		SortOption = "Inventory.BookName";
		queryJTable();
		lblSortOption.setText("Book Name");
		btnRemoveSort.setEnabled(true);
	}
	
	//Removes sort by setting it back to default(BookID)
	protected void do_btnRemoveCurrentSort_actionPerformed(ActionEvent arg0) {
		SortOption = "Inventory.BookID";
		queryJTable();
		lblSortOption.setText("BookID (Default)");
	}

	//removes filter by setting static variables to empty text string 
	protected void do_btnRemoveCurrentFilter_actionPerformed(ActionEvent arg0) {
	lblFilterOption.setText("None");
	minFilter = "";
	maxFilter = "";
	rangeFilter = "";
	selectedCategory = "";
	}

	//creates RetailPriceFrame pop=up window 
	protected void do_chckbxmntmByRetauilPrice_actionPerformed(ActionEvent arg0) {
	ByRetailPriceFrame frame = new ByRetailPriceFrame();
	frame.setVisible(true);
	}
	
	//creates CategoryFrame pop-up window
	protected void do_chckbxmntmByCategory_actionPerformed(ActionEvent arg0) {
		ByCategoryFrame frame = new ByCategoryFrame();
		frame.setVisible(true);
	}
	
	//creates Help dialog pop-up message 
	protected void do_mntmHelp_actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "This program is used to access a database containing a collection of books.\n\nThe Query button at the bottom of the screen displays the contents of the database.\n\nThe Tool menu bar item contains operations to help with organizing the database.\n\nThe AddBook menu item under Tools opens a pop-up window that allows you to enter a new record into the database.\nMake sure that every field is filled before clicking the insert button. Be sure to enter a unique positive number for the BookID,\nand positive numbers for WholeSalePrice, RetailPrice, QOH, and MinQuant. Be sure too add unique values for both BookID\nand BookName for the database does not allow duplicates, and too limit the BookName and AuthorName to 20 characters.\n\nThe Sort menu item under Tools allows you to order the results according to the sort option. 'By Book Name' sorts the database\nby book name aphabetically. 'By Retail Price' sorts the database by price from least to greatest. 'By Category' sorts the database by\ncategory alphabetically. If you wish to remove this sort option, click the 'Remove Current Sort' button.\n\nThe Filter menu item under Tools allows you to choose from either two options: 'By Retail Price', and 'By Category'.\nThe Retail Price pop-up window allows you to input your desired pricing parameters and filter the contents of the database.\nTo query your results, press the corresponding fitler buttons next to your filter options ('By Minimum Price', 'By Maximum Price', or\n'By Range') and then press the 'Query' button on the main screen to display the inventory.The Category option allows you to select\n your desired genre and have it appear on the table. If you wish to remove a filter, simply select the 'Remove Current Filter' button.", "Help", JOptionPane.INFORMATION_MESSAGE);
	}
}