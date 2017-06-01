import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class BrunoSACAPFrame extends JFrame {

	NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(); //creates money Format for income and expenses
	
	//Menu Bar 
	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu menuFile = new JMenu("File");
	private final JMenuItem menuitemStartNewForm = new JMenuItem("Start New Form");
	private final JMenuItem menuitemExit = new JMenuItem("Exit");
	private final JMenu menuHelp = new JMenu("Help");
	private final JMenuItem mntmApplicantInformation = new JMenuItem("Applicant Information");
	private final JMenuItem mntmChildInformation = new JMenuItem("Child Information");
	private final JMenuItem mntmFinancialInformation = new JMenuItem("Financial Information");
	//Tabs 
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel Applicantpanel = new JPanel();
	private final JPanel Childpanel = new JPanel();
	private final JPanel Financialpanel = new JPanel();
	private final JTextField firstnameTF = new JTextField();
	private final JLabel lblFirstName = new JLabel("First Name:");
	private final JTextField lastnameTF = new JTextField();
	private final JLabel lblLastName = new JLabel("Last Name:");
	private final JLabel lblAddress = new JLabel("Address:");
	private final JTextField addressTF = new JTextField();
	private final JLabel lblZipCode = new JLabel("Zip Code:");
	private final JLabel lblCounty = new JLabel("County:");
	private final JComboBox countyList = new JComboBox();
	private final JLabel lblTel = new JLabel("Tel/Cel:");
	private final JFormattedTextField telFTF = new JFormattedTextField();
	MaskFormatter telMask = createFormatter ("(###)-(###)-(####)"); //input mask for telphone number
	private final JLabel lblEmail = new JLabel("Email:");
	private final JTextField emailTF = new JTextField();
	private final JFormattedTextField zipFTF = new JFormattedTextField();
	MaskFormatter zipcodeMask = createFormatter ("#####"); //input mask for postal code
	private final JLabel lblNumbAdults = new JLabel("# of Adults:");
	private final JLabel lblNumbChildren18 = new JLabel("# of Children 18 +:");
	private final JLabel lblNumbChildren = new JLabel("# of Children 0-17:");
	private final JComboBox children17List = new JComboBox();
	private final JComboBox children18List = new JComboBox();
	private final JComboBox AdultsList = new JComboBox();
	//Child Information Tab
	private final JLabel lblCFN = new JLabel("First Name:");
	private final JTextField cfnTF = new JTextField();
	private final JLabel lblGender = new JLabel("Gender:");
	private final JRadioButton radioMale = new JRadioButton("Male");
	private final JRadioButton radioFemale = new JRadioButton("Female");
	private final JLabel lblBirth = new JLabel("Birthdate:");
	private final JFormattedTextField birthFTF = new JFormattedTextField();
	MaskFormatter birthMask = createFormatter ("##/##/##");
	private final JLabel lblAge = new JLabel("Age:");
	private final JComboBox ageList = new JComboBox();
	private final JLabel lblClothSize = new JLabel("Clothing Size:");
	private final JComboBox clothsizeList = new JComboBox();
	private final JLabel lblShoeSize = new JLabel("Shoe Size:");
	private final JLabel lblCoatSize = new JLabel("Coat Size:");
	private final JTextField shoesizeTF = new JTextField();
	private final JLabel lblGames = new JLabel("What game system do you have?");
	private final JComboBox gamesList = new JComboBox();
	private final JLabel lblnterests = new JLabel("What are your child's interests?");
	private final JComboBox interestsList = new JComboBox();
	private final JTextField othercountyTF = new JTextField();
	private final JTextField otherinterestsTF = new JTextField();
	private final JLabel lblCFN2 = new JLabel("First Name:");
	private final JTextField cfnTF2 = new JTextField();
	private final JSeparator separator_1 = new JSeparator();
	private final JLabel lblGender2 = new JLabel("Gender:");
	private final JRadioButton radioMale2 = new JRadioButton("Male");
	private final JRadioButton radioFemale2 = new JRadioButton("Female");
	private final JLabel lblBirth2 = new JLabel("Birthdate:");
	private final JFormattedTextField birthFTF2 = new JFormattedTextField();
	MaskFormatter birth2Mask = createFormatter ("##/##/##");
	private final JLabel lblAge2 = new JLabel("Age:");
	private final JComboBox ageList2 = new JComboBox();
	private final JLabel lblClothSize2 = new JLabel("Clothing Size:");
	private final JComboBox clothsizeList2 = new JComboBox();
	private final JLabel lblShoeSize2 = new JLabel("Shoe Size:");
	private final JLabel lblCoatSize2 = new JLabel("Coat Size:");
	private final JTextField shoesizeTF2 = new JTextField();
	private final JLabel lblGames2 = new JLabel("What game system do you have?");
	private final JComboBox gamesList2 = new JComboBox();
	private final JLabel lblInterests2 = new JLabel("What are your child's interests?");
	private final JComboBox interestsList2 = new JComboBox();
	private final JButton btnAdd = new JButton("Add Child");
	private final JTextField otherinterestsTF2 = new JTextField();
	private final JSeparator separator_2 = new JSeparator();
	private final JLabel lblCFN3 = new JLabel("First Name:");
	private final JTextField cfnTF3 = new JTextField();
	private final JLabel lblGender3 = new JLabel("Gender:");
	private final JRadioButton radioMale3 = new JRadioButton("Male");
	private final JRadioButton radioFemale3 = new JRadioButton("Female");
	private final JLabel lblBirth3 = new JLabel("Birthdate:");
	private final JFormattedTextField birthFTF3 = new JFormattedTextField();
	MaskFormatter birth3Mask = createFormatter ("##/##/##");
	private final JLabel lblAge3 = new JLabel("Age:");
	private final JComboBox ageList3 = new JComboBox();
	private final JLabel lblClothSize3 = new JLabel("Clothing Size:");
	private final JComboBox clothsizeList3 = new JComboBox();
	private final JLabel lblShoeSize3 = new JLabel("Shoe Size:");
	private final JLabel lblCoatSize3 = new JLabel("Coat Size:");
	private final JTextField shoesizeTF3 = new JTextField();
	private final JLabel lblGames3 = new JLabel("What game system do you have?");
	private final JComboBox gamesList3 = new JComboBox();
	private final JLabel lblInterests3 = new JLabel("What are your child's interests?");
	private final JComboBox interestsList3 = new JComboBox();
	private final JTextField otherinterestsTF3 = new JTextField();
	private final JButton btnAdd2 = new JButton("Add Child");
	private final JButton btnAdd3 = new JButton("Add Child");
	private final JSeparator separator_3 = new JSeparator();
	private final JLabel lblCFN4 = new JLabel("First Name:");
	private final JTextField cfnTF4 = new JTextField();
	private final JLabel lblGender4 = new JLabel("Gender:");
	private final JRadioButton radioMale4 = new JRadioButton("Male");
	private final JRadioButton radioFemale4 = new JRadioButton("Female");
	private final JLabel lblBirth4 = new JLabel("Birthdate:");
	private final JFormattedTextField birthFTF4 = new JFormattedTextField();
	MaskFormatter birth4Mask = createFormatter ("##/##/##");
	private final JLabel lblAge4 = new JLabel("Age:");
	private final JComboBox ageList4 = new JComboBox();
	private final JLabel lblClothSize4 = new JLabel("Clothing Size:");
	private final JComboBox clothsizeList4 = new JComboBox();
	private final JLabel lblShoeSize4 = new JLabel("Shoe Size:");
	private final JLabel lblCoatSize4 = new JLabel("Coat Size:");
	private final JTextField shoesizeTF4 = new JTextField();
	private final JComboBox coatsizeList = new JComboBox();
	private final JComboBox coatsizeList2 = new JComboBox();
	private final JComboBox coatsizeList3 = new JComboBox();
	private final JComboBox coatsizeList4 = new JComboBox();
	private final JLabel lblGames4 = new JLabel("What game system do you have?");
	private final JComboBox gamesList4 = new JComboBox();
	private final JLabel lblInterests4 = new JLabel("What are your child's interests?");
	private final JComboBox interestsList4 = new JComboBox();
	private final JTextField otherinterestsTF4 = new JTextField();
	private final JButton btnAdd4 = new JButton("Add Child");
	private final JSeparator separator_4 = new JSeparator();
	private final JLabel lblCFN5 = new JLabel("First Name:");
	private final JTextField cfnTF5 = new JTextField();
	private final JLabel lblGender5 = new JLabel("Gender:");
	private final JRadioButton radioMale5 = new JRadioButton("Male");
	private final JRadioButton radioFemale5 = new JRadioButton("Female");
	private final JLabel lblBirth5 = new JLabel("Birthdate:");
	private final JFormattedTextField birthFTF5 = new JFormattedTextField();
	MaskFormatter birth5Mask = createFormatter ("##/##/##");
	private final JLabel lblAge5 = new JLabel("Age:");
	private final JComboBox ageList5 = new JComboBox();
	private final JLabel lblClothSize5 = new JLabel("Clothing Size:");
	private final JComboBox clothsizeList5 = new JComboBox();
	private final JLabel lblCoatSize5 = new JLabel("Coat Size:");
	private final JComboBox coatsizeList5 = new JComboBox();
	private final JLabel lblShoeSize5 = new JLabel("Shoe Size:");
	private final JTextField shoesizeTF5 = new JTextField();
	private final JLabel lblGames5 = new JLabel("What game system do you have?");
	private final JComboBox gamesList5 = new JComboBox();
	private final JLabel lblInterests5 = new JLabel("What are your child's interests?");
	private final JComboBox interestsList5 = new JComboBox();
	private final JTextField otherinterestsTF5 = new JTextField();
	private final JButton btnAdd5 = new JButton("Add Child");
	private final JSeparator separator_5 = new JSeparator();
	private final JLabel lblCFN6 = new JLabel("First Name:");
	private final JTextField cfnTF6 = new JTextField();
	private final JLabel lblClothSize6 = new JLabel("Clothing Size:");
	private final JComboBox clothsizeList6 = new JComboBox();
	private final JLabel lblGender6 = new JLabel("Gender:");
	private final JRadioButton radioMale6 = new JRadioButton("Male");
	private final JRadioButton radioFemale6 = new JRadioButton("Female");
	private final JLabel lblBirth6 = new JLabel("Birthdate:");
	private final JFormattedTextField birthFTF6 = new JFormattedTextField();
	MaskFormatter birth6Mask = createFormatter ("##/##/##");
	private final JLabel lblAge6 = new JLabel("Age:");
	private final JComboBox ageList6 = new JComboBox();
	private final JLabel lblCoatSize6 = new JLabel("Coat Size:");
	private final JComboBox coatsizeList6 = new JComboBox();
	private final JLabel lblShoeSize6 = new JLabel("Shoe Size:");
	private final JTextField shoesizeTF6 = new JTextField();
	private final JLabel lblGames6 = new JLabel("What game system do you have?");
	private final JComboBox gamesList6 = new JComboBox();
	private final JLabel lblInterests6 = new JLabel("What are your child's interests?");
	private final JComboBox interestsList6 = new JComboBox();
	private final JTextField otherinterestsTF6 = new JTextField();
	private final ButtonGroup malefemaleButtonGroup = new ButtonGroup();
	
	//Financial Tab
		private double numSetter = 0;
	
		private double employTotal = 0;
		private double supportTotal = 0;
		private double ontarioTotal = 0;
		private double disabilityTotal = 0;
		private double pensionTotal = 0;
		private double incomeTotal = 0;
		
		private double rentmortTotal = 0;
		private double gashydroTotal = 0;
		private double phonetvTotal = 0;
		private double careTotal = 0;
		private double transitgasTotal = 0;
		private double loansinsuranceTotal = 0;
		private double expensesTotal = 0;
		
		private double net = 0;
	
		private final JLabel lblEmployment = new JLabel("Employment (total):");
		private final JLabel lblIncome = new JLabel("INCOME");
		private final JLabel lblSupport = new JLabel("Child/Spousal Support:");
		private final JLabel lblOntarioWorks = new JLabel("Ontario Works:");
		private final JLabel lblDisability = new JLabel("E.I. or Disability:");
		private final JLabel lblPension = new JLabel("Pension Income:");
		private final JLabel lblChildTaxCredits = new JLabel("Child Tax Credits:");
		private final JFormattedTextField employmentFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField supportFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField ontarioFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField disabilityFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField pensionFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField childtaxFTF = new JFormattedTextField(moneyFormat);
		private final JLabel lblExpenses = new JLabel("EXPENSES");
		private final JCheckBox chckbxRent = new JCheckBox("Rent:");
		private final JCheckBox chckbxMort = new JCheckBox("Mortgage:");
		private final JLabel lblGasHydro = new JLabel("Gas + Hydro:");
		private final JLabel lblPhoneTv = new JLabel("Phone + TV:");
		private final JLabel lblCare = new JLabel("Child Care:");
		private final JLabel lblLoansInsurance = new JLabel("Loans + Insurance:");
		private final JCheckBox chckbxTransit = new JCheckBox("Transit:");
		private final JCheckBox chckbxGas = new JCheckBox("Gas:");
		private final JFormattedTextField rentmortFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField gashydroFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField phonetvFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField careFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField transitgasFTF = new JFormattedTextField(moneyFormat);
		private final JFormattedTextField loansinsuranceFTF = new JFormattedTextField(moneyFormat);
		private final JSeparator separator = new JSeparator();
		private final JLabel lblTotalIncome = new JLabel("TOTAL INCOME:");
		private final JFormattedTextField totalincomeFTF = new JFormattedTextField(moneyFormat);
		private final JLabel lblExpensesTotal = new JLabel("TOTAL EXPENSES:");
		private final JFormattedTextField totalexpensesFTF = new JFormattedTextField(moneyFormat);
		private final ButtonGroup rentmortgageButtonGroup = new ButtonGroup();
		private final ButtonGroup transitgasButtonGroup = new ButtonGroup();
		private final JLabel lblNet = new JLabel("NET INCOME:");
		private final JFormattedTextField netFTF = new JFormattedTextField(moneyFormat);
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoSACAPFrame frame = new BrunoSACAPFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
	 * Create the frame.
	 */
	public BrunoSACAPFrame() {
		otherinterestsTF2.setToolTipText("Please enter your child's other interest in this text field.");
		otherinterestsTF2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_otherinterestsTF2_focusLost(arg0);
			}
		});
		otherinterestsTF2.setBounds(247, 524, 134, 24);
		otherinterestsTF2.setColumns(10);
		Childpanel.add(otherinterestsTF2);
		otherinterestsTF2.setVisible(false);
		otherinterestsTF.setToolTipText("Please enter your child's other interest in this text field.");
		otherinterestsTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_otherinterestsTF_focusLost(arg0);
			}
		});
		
		otherinterestsTF.setBounds(6, 520, 134, 28);
		otherinterestsTF.setColumns(10);
		otherinterestsTF.setVisible(false);
		Childpanel.add(otherinterestsTF);
		othercountyTF.setToolTipText("Please enter your county in this text field.");
		
		othercountyTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_othercountyTF_focusLost(arg0);
			}
		});
		othercountyTF.setBounds(243, 173, 134, 28);
		othercountyTF.setColumns(10);
		shoesizeTF.setToolTipText("Please enter your child's shoe size in this text field.");
		shoesizeTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_shoesizeTF_focusLost(arg0);
			}
		});
		
		shoesizeTF.setBounds(85, 327, 134, 28);
		shoesizeTF.setColumns(10);
		cfnTF.setToolTipText("Please enter your child's first name in this text field.");
		cfnTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_cfn1TF_focusLost(arg0);
			}
		});
		
		cfnTF.setBounds(85, 17, 134, 28);
		cfnTF.setColumns(10);
		emailTF.setToolTipText("Please enter your email in this text field.");
		emailTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_emailTF_focusLost(arg0);
			}
		});
		
		emailTF.setBounds(101, 302, 134, 28);
		emailTF.setColumns(10);
		addressTF.setToolTipText("Please enter your address in this text field.");
		addressTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_addressTF_focusLost(arg0);
			}
		});
		
		addressTF.setBounds(101, 132, 134, 28);
		addressTF.setColumns(10);
		lastnameTF.setToolTipText("Please enter your last name in this text field.");
		lastnameTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_lastnameTF_focusLost(arg0);
			}
		});
		
		lastnameTF.setBounds(101, 89, 134, 28);
		lastnameTF.setColumns(10);
		firstnameTF.setToolTipText("Please enter your first name in this text field.");
		firstnameTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_firstnameTF_focusLost(arg0);
			}
		});
		
		firstnameTF.setBounds(101, 42, 134, 28);
		firstnameTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("The Salvation Army 2016 Christmas Assistance Program");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1615, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		menuBar.setBounds(6, 11, 1322, 22);
		
		contentPane.add(menuBar);
		
		menuBar.add(menuFile);
		menuitemStartNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_menuitemStartNewForm_actionPerformed(e);
			}
		});
		
		menuFile.add(menuitemStartNewForm);
		menuitemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_menuitemExit_actionPerformed(e);
			}
		});
		
		menuFile.add(menuitemExit);
		
		menuBar.add(menuHelp);
		mntmApplicantInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmApplicantInformation_actionPerformed(e);
			}
		});
		
		menuHelp.add(mntmApplicantInformation);
		mntmChildInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmChildInformation_actionPerformed(e);
			}
		});
		
		menuHelp.add(mntmChildInformation);
		mntmFinancialInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmFinancialInformation_actionPerformed(e);
			}
		});
		
		menuHelp.add(mntmFinancialInformation);
		tabbedPane.setBounds(6, 40, 1583, 667);
		
		contentPane.add(tabbedPane);
		Applicantpanel.setToolTipText("");
		
		tabbedPane.addTab("Applicant Information", null, Applicantpanel, null);
		Applicantpanel.setLayout(null);
		
		Applicantpanel.add(firstnameTF);
		lblFirstName.setBounds(12, 48, 79, 16);
		
		Applicantpanel.add(lblFirstName);
		
		Applicantpanel.add(lastnameTF);
		lblLastName.setBounds(12, 95, 79, 16);
		
		Applicantpanel.add(lblLastName);
		lblAddress.setBounds(10, 138, 61, 16);
		
		Applicantpanel.add(lblAddress);
		
		Applicantpanel.add(addressTF);
		lblZipCode.setBounds(10, 224, 79, 16);
		
		Applicantpanel.add(lblZipCode);
		lblCounty.setBounds(10, 179, 61, 16);
		
		Applicantpanel.add(lblCounty);
		countyList.setToolTipText("<html>\r\nPlease select the county in which you reside in. <br>\r\nIf not listed, select \"Other\" and enter your county in the text field.\r\n</html>");
		
		countyList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_countyComboBox_actionPerformed(e);
			}
		});
		countyList.setModel(new DefaultComboBoxModel(new String[] {"Auroa", "Bradford", "East Gwillmbury", "Georgina/Keswick", "Holland Landing", "Markham", "Mount Albert", "Newmarket", "Queensville", "Richmond Hill", "Schomberg", "Sharon", "Stouffville", "Vaughan", "Other"}));
		countyList.setBounds(101, 174, 134, 27);
		
		Applicantpanel.add(countyList);
		
		Applicantpanel.add(othercountyTF);
		othercountyTF.setVisible(false);
		
		lblTel.setBounds(10, 265, 61, 16);
		Applicantpanel.add(lblTel);
		
		lblEmail.setBounds(10, 314, 61, 16);
		Applicantpanel.add(lblEmail);
		Applicantpanel.add(emailTF);
		telFTF.setToolTipText("Please enter your telphone or celphone number in this text field.");
		telFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_telFTF_focusLost(arg0);
			}
		});
		
		
		telFTF.setBounds(101, 260, 135, 27);
		telMask.setPlaceholderCharacter('#');
		telMask.install(telFTF);
		Applicantpanel.add(telFTF);
		zipFTF.setToolTipText("Please enter your zip code in this text field.");
		zipFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_zipFTF_focusLost(arg0);
			}
		});
		
		zipFTF.setBounds(101, 218, 135, 28);
		zipcodeMask.setPlaceholderCharacter('#');
		zipcodeMask.install(zipFTF);
		Applicantpanel.add(zipFTF);
		lblNumbAdults.setBounds(10, 458, 120, 16);
		
		Applicantpanel.add(lblNumbAdults);
		lblNumbChildren18.setBounds(10, 415, 120, 16);
		
		Applicantpanel.add(lblNumbChildren18);
		lblNumbChildren.setBounds(10, 371, 130, 16);
		
		Applicantpanel.add(lblNumbChildren);
		children17List.setToolTipText("If applicable, please select the number of children under the age of 17 residing in your household.");
		children17List.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		children17List.setBounds(152, 367, 83, 27);
		
		Applicantpanel.add(children17List);
		children18List.setToolTipText("If applicable, please select the number of children 18 years or older residing in your household.");
		children18List.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		children18List.setBounds(152, 411, 83, 27);
		
		Applicantpanel.add(children18List);
		AdultsList.setToolTipText("Please select the number of adults residing in your household, including yourself.");
		AdultsList.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		AdultsList.setBounds(152, 454, 82, 27);
		
		Applicantpanel.add(AdultsList);
		Applicantpanel.setFocusCycleRoot(true); //Tabbed order
		Applicantpanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{firstnameTF, lastnameTF, addressTF, countyList, othercountyTF, zipFTF, telFTF, emailTF, children17List, children18List, AdultsList}));
				
		
				birthMask.setPlaceholderCharacter('#');
				birth2Mask.setPlaceholderCharacter('#');
				birth3Mask.setPlaceholderCharacter('#');
				birth4Mask.setPlaceholderCharacter('#');
				birth5Mask.setPlaceholderCharacter('#');
				birth6Mask.setPlaceholderCharacter('#');
		
		tabbedPane.addTab("Child Information", null, Childpanel, null);
		Childpanel.setLayout(null);
		
		lblCFN.setBounds(6, 23, 87, 16);
		Childpanel.add(lblCFN);
		Childpanel.add(cfnTF);
		lblGender.setToolTipText("Please select your child's gender.");
		
		lblGender.setBounds(6, 77, 61, 16);
		Childpanel.add(lblGender);
		malefemaleButtonGroup.add(radioMale);
		radioMale.setToolTipText("");
		radioMale.setBounds(85, 74, 61, 23);
		
		Childpanel.add(radioMale);
		malefemaleButtonGroup.add(radioFemale);
		radioFemale.setBounds(156, 74, 76, 23);
		
		Childpanel.add(radioFemale);
		
		lblBirth.setBounds(6, 128, 61, 16);
		Childpanel.add(lblBirth);
		birthFTF.setToolTipText("Please enter your child's birthdate in this text field.");
		birthFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_birthFTF_focusLost(arg0);
			}
		});
		
				
				birthFTF.setBounds(85, 118, 134, 26);
				birthMask.install(birthFTF);
				Childpanel.add(birthFTF);
				lblAge.setToolTipText("");
				
				lblAge.setBounds(6, 184, 61, 16);
				Childpanel.add(lblAge);
				ageList.setToolTipText("Please select your child's age from the drop down list.");
				
				ageList.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
				ageList.setBounds(85, 179, 134, 28);
				Childpanel.add(ageList);
				
				lblClothSize.setBounds(6, 237, 87, 16);
				Childpanel.add(lblClothSize);
				clothsizeList.setToolTipText("Please select your child's clothing size.");
				
				clothsizeList.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
				clothsizeList.setBounds(85, 231, 134, 28);
				Childpanel.add(clothsizeList);
				
				lblShoeSize.setBounds(6, 339, 87, 16);
				Childpanel.add(lblShoeSize);
				
				lblCoatSize.setBounds(6, 285, 76, 16);
				Childpanel.add(lblCoatSize);
				
				Childpanel.add(shoesizeTF);
				lblGames.setToolTipText("<html>\r\nPlease select your child's game system from the drop down list. <br>\r\nSelect all that apply. <br>\r\n</html>");
				
				lblGames.setBounds(6, 390, 209, 16);
				Childpanel.add(lblGames);
				
				gamesList.setModel(new DefaultComboBoxModel(new String[] {"Xbox 360", "Xbox 1", "Computer", "PS3", "PS4", "PSP", "Wii", "Wii U", "Nintendo DS"}));
				gamesList.setBounds(6, 406, 134, 23);
				Childpanel.add(gamesList);
				lblnterests.setToolTipText("<html>\r\nPlease select your child's interests from the drop down list. <br>\r\nSelect all that apply. <br>\r\nIf interest not available, please select \"Other\" and enter interest in text field.<br>\r\n</html>");
				
				lblnterests.setBounds(6, 477, 202, 16);
				Childpanel.add(lblnterests);
				
				interestsList.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						do_interestsComboBox_actionPerformed(e);
					}
				});
				interestsList.setModel(new DefaultComboBoxModel(new String[] {"Arts/Crafts", "Drawing", "Action Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"}));
				interestsList.setBounds(6, 493, 134, 23);
				Childpanel.add(interestsList);
				
				lblCFN2.setBounds(247, 23, 76, 16);
				lblCFN2.setVisible(false);
				Childpanel.add(lblCFN2);
				
				cfnTF2.setToolTipText("Please enter your child's first name in this text field.");
				cfnTF2.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent arg0) {
						do_cfnTF2_focusLost(arg0);
					}
				});
				cfnTF2.setColumns(10);
				cfnTF2.setBounds(330, 17, 134, 28);
				cfnTF2.setVisible(false);
				Childpanel.add(cfnTF2);
				
				separator_1.setOrientation(SwingConstants.VERTICAL);
				separator_1.setBounds(238, 11, 12, 614);
				Childpanel.add(separator_1);
				
				lblGender2.setToolTipText("Please select your child's gender.");
				lblGender2.setBounds(247, 77, 61, 16);
				lblGender2.setVisible(false);
				Childpanel.add(lblGender2);
				
				radioMale2.setBounds(325, 74, 76, 23);
				radioMale2.setVisible(false);
				Childpanel.add(radioMale2);
				
				radioFemale2.setBounds(403, 74, 67, 23);
				radioFemale2.setVisible(false);
				Childpanel.add(radioFemale2);
				
				lblBirth2.setBounds(247, 128, 61, 16);
				lblBirth2.setVisible(false);
				Childpanel.add(lblBirth2);
				
				birthFTF2.setToolTipText("Please enter your child's birthdate in this text field.");
				birthFTF2.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent arg0) {
						do_birthFTF2_focusLost(arg0);
					}
				});
				
				birthFTF2.setBounds(330, 118, 134, 26);
				birth2Mask.install(birthFTF2);
				birthFTF2.setVisible(false);
				Childpanel.add(birthFTF2);
				
				lblAge2.setToolTipText("");
				lblAge2.setBounds(247, 179, 61, 16);
				lblAge2.setVisible(false);
				Childpanel.add(lblAge2);
				
				ageList2.setToolTipText("Please select your child's age from the drop down list.");
				ageList2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
				ageList2.setBounds(330, 176, 134, 29);
				ageList2.setVisible(false);
				Childpanel.add(ageList2);
				
				lblClothSize2.setBounds(247, 237, 87, 16);
				lblClothSize2.setVisible(false);
				Childpanel.add(lblClothSize2);
					
				clothsizeList2.setToolTipText("Please select your child's clothing size from the drop down list.");
				clothsizeList2.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
				clothsizeList2.setBounds(330, 231, 134, 26);
				clothsizeList2.setVisible(false);
				Childpanel.add(clothsizeList2);
					
				lblShoeSize2.setBounds(247, 339, 87, 16);
				lblShoeSize2.setVisible(false);
				Childpanel.add(lblShoeSize2);
				
				lblCoatSize2.setBounds(247, 285, 76, 16);
				lblCoatSize2.setVisible(false);
				Childpanel.add(lblCoatSize2);
				shoesizeTF2.setToolTipText("Please enter your child's shoe size in this text field.");
				
				shoesizeTF2.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_shoesizeTF2_focusLost(arg0);
						}
					});
					shoesizeTF2.setColumns(10);
					shoesizeTF2.setVisible(false);
					shoesizeTF2.setBounds(330, 327, 134, 28);
					Childpanel.add(shoesizeTF2);
					lblGames2.setToolTipText("<html>\r\nPlease select your child's game system from the drop down list. <br>\r\nSelect all that apply. <br>\r\n</html>");
					
					lblGames2.setBounds(247, 390, 209, 16);
					lblGames2.setVisible(false);
					Childpanel.add(lblGames2);
					
					gamesList2.setModel(new DefaultComboBoxModel(new String[] {"Xbox 360", "Xbox 1", "Computer", "PS3", "PS4", "PSP", "Wii", "Wii U", "Nintendo DS"}));
					gamesList2.setBounds(247, 406, 134, 23);
					gamesList2.setVisible(false);
					Childpanel.add(gamesList2);
					lblInterests2.setToolTipText("<html>\r\nPlease select your child's interests from the drop down list. <br>\r\nSelect all that apply. <br>\r\nIf interest not available, please select \"Other\" and enter interest in text field.<br>\r\n</html>");
					
					lblInterests2.setBounds(247, 477, 202, 16);
					lblInterests2.setVisible(false);
					Childpanel.add(lblInterests2);
					
					interestsList2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_interestsComboBox2_actionPerformed(arg0);
						}
					});
					interestsList2.setModel(new DefaultComboBoxModel(new String[] {"Arts/Crafts", "Drawing", "Action Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"}));
					interestsList2.setBounds(247, 493, 134, 23);
					interestsList2.setVisible(false);
					Childpanel.add(interestsList2);
					
					btnAdd.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_btnAddChild_actionPerformed(arg0);
						}
					});
					btnAdd.setBounds(6, 592, 89, 23);
					Childpanel.add(btnAdd);	
					
					separator_2.setOrientation(SwingConstants.VERTICAL);
					separator_2.setBounds(482, 11, 2, 617);
					separator_2.setVisible(false);
					Childpanel.add(separator_2);
					
					lblCFN3.setBounds(493, 24, 76, 16);
					lblCFN3.setVisible(false);
					Childpanel.add(lblCFN3);
					
					cfnTF3.setToolTipText("Please enter your child's first name in this text field.");
					cfnTF3.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_cfnTF3_focusLost(arg0);
						}
					});
					cfnTF3.setColumns(10);
					cfnTF3.setBounds(579, 21, 134, 28);
					cfnTF3.setVisible(false);
					Childpanel.add(cfnTF3);
					
					lblGender3.setToolTipText("Please select your child's gender.");
					lblGender3.setBounds(494, 77, 61, 16);
					lblGender3.setVisible(false);
					Childpanel.add(lblGender3);
					
					radioMale3.setBounds(579, 74, 61, 23);
					radioMale3.setVisible(false);
					Childpanel.add(radioMale3);
					
					radioFemale3.setBounds(646, 74, 67, 23);
					radioFemale3.setVisible(false);
					Childpanel.add(radioFemale3);
					
					lblBirth3.setBounds(494, 129, 61, 16);
					lblBirth3.setVisible(false);
					Childpanel.add(lblBirth3);
					
					birthFTF3.setToolTipText("Please enter your child's birthdate in this text field.");
					birthFTF3.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_birthFTF3_focusLost(arg0);
						}
					});
					birthFTF3.setBounds(579, 123, 134, 26);
					birth3Mask.install(birthFTF3);
					birthFTF3.setVisible(false);
					Childpanel.add(birthFTF3);
					
					lblAge3.setToolTipText("");
					lblAge3.setBounds(494, 179, 61, 16);
					lblAge3.setVisible(false);
					Childpanel.add(lblAge3);
					
					ageList3.setToolTipText("Please select your child's age from the drop down list.");
					ageList3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
					ageList3.setBounds(579, 176, 134, 29);
					ageList3.setVisible(false);
					Childpanel.add(ageList3);
					
					lblClothSize3.setBounds(493, 237, 87, 16);
					lblClothSize3.setVisible(false);
					Childpanel.add(lblClothSize3);
					
					clothsizeList3.setToolTipText("Please select your child's clothing size from the drop down list.");
					clothsizeList3.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					clothsizeList3.setBounds(579, 232, 134, 26);
					clothsizeList3.setVisible(false);
					Childpanel.add(clothsizeList3);
					
					lblShoeSize3.setBounds(494, 339, 87, 16);
					lblShoeSize3.setVisible(false);
					Childpanel.add(lblShoeSize3);
					
					lblCoatSize3.setBounds(494, 291, 76, 16);
					lblCoatSize3.setVisible(false);
					Childpanel.add(lblCoatSize3);
					shoesizeTF3.setToolTipText("Please enter your child's shoe size in this text field.");
					
					shoesizeTF3.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_shoesizeTF3_focusLost(arg0);
						}
					});
					shoesizeTF3.setColumns(10);
					shoesizeTF3.setBounds(579, 333, 134, 28);
					shoesizeTF3.setVisible(false);
					Childpanel.add(shoesizeTF3);
					lblGames3.setToolTipText("<html>\r\nPlease select your child's game system from the drop down list. <br>\r\nSelect all that apply. <br>\r\n</html>");
					
					lblGames3.setBounds(494, 391, 209, 16);
					lblGames3.setVisible(false);
					Childpanel.add(lblGames3);
					
					gamesList3.setModel(new DefaultComboBoxModel(new String[] {"Xbox 360", "Xbox 1", "Computer", "PS3", "PS4", "PSP", "Wii", "Wii U", "Nintendo DS"}));
					gamesList3.setBounds(494, 407, 134, 23);
					gamesList3.setVisible(false);
					Childpanel.add(gamesList3);
					lblInterests3.setToolTipText("<html>\r\nPlease select your child's interests from the drop down list. <br>\r\nSelect all that apply. <br>\r\nIf interest not available, please select \"Other\" and enter interest in text field.<br>\r\n</html>");
					
					lblInterests3.setBounds(494, 478, 202, 16);
					lblInterests3.setVisible(false);
					Childpanel.add(lblInterests3);
					
					interestsList3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_interestsComboBox3_actionPerformed(arg0);
						}
					});
					interestsList3.setModel(new DefaultComboBoxModel(new String[] {"Arts/Crafts", "Drawing", "Action Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"}));
					interestsList3.setBounds(494, 494, 134, 23);
					interestsList3.setVisible(false);
					Childpanel.add(interestsList3);
					otherinterestsTF3.setToolTipText("Please enter your child's other interest in this text field.");
					
					otherinterestsTF3.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_otherinterestsTF3_focusLost(arg0);
						}
					});
					otherinterestsTF3.setColumns(10);
					otherinterestsTF3.setBounds(494, 524, 134, 24);
					otherinterestsTF3.setVisible(false);
					Childpanel.add(otherinterestsTF3);
					btnAdd2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_btnAdd2_actionPerformed(arg0);
						}
					});
					
					btnAdd2.setBounds(247, 592, 89, 23);
					btnAdd2.setVisible(false);
					Childpanel.add(btnAdd2);
					
					btnAdd3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_btnAdd3_actionPerformed(arg0);
						}
					});
					
					btnAdd3.setBounds(494, 592, 89, 23);
					btnAdd3.setVisible(false);
					Childpanel.add(btnAdd3);
					
					separator_3.setOrientation(SwingConstants.VERTICAL);
					separator_3.setBounds(736, 17, 2, 611);
					separator_3.setVisible(false);
					Childpanel.add(separator_3);
					
					lblCFN4.setVisible(false);
					lblCFN4.setBounds(748, 24, 76, 16);
					
					Childpanel.add(lblCFN4);
					cfnTF4.setToolTipText("Please enter your child's first name in this text field.");
					cfnTF4.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_cfnTF4_focusLost(arg0);
						}
					});
					cfnTF4.setColumns(10);
					cfnTF4.setVisible(false);
					cfnTF4.setBounds(833, 21, 134, 28);
					
					Childpanel.add(cfnTF4);
					lblGender4.setToolTipText("Please select your child's gender.");
					lblGender4.setBounds(748, 78, 61, 16);
					lblGender4.setVisible(false);
					Childpanel.add(lblGender4);
					
					radioMale4.setBounds(833, 74, 61, 23);
					radioMale4.setVisible(false);
					Childpanel.add(radioMale4);
					
					radioFemale4.setBounds(900, 74, 67, 23);
					radioFemale4.setVisible(false);
					Childpanel.add(radioFemale4);
					
					lblBirth4.setBounds(748, 129, 61, 16);
					lblBirth4.setVisible(false);
					Childpanel.add(lblBirth4);
					
					birthFTF4.setToolTipText("Please enter your child's birthdate in this text field.");
					birthFTF4.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_birthFTF4_focusLost(arg0);
						}
					});
					birthFTF4.setBounds(833, 123, 134, 26);
					birth4Mask.install(birthFTF4);
					birthFTF4.setVisible(false);
					Childpanel.add(birthFTF4);
					
					lblAge4.setBounds(748, 183, 61, 16);
					lblAge4.setVisible(false);
					Childpanel.add(lblAge4);
					
					ageList4.setToolTipText("Please select your child's age from the drop down list.");
					ageList4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
					ageList4.setBounds(833, 177, 134, 28);
					ageList4.setVisible(false);
					Childpanel.add(ageList4);
					
					lblClothSize4.setBounds(748, 238, 87, 16);
					lblClothSize4.setVisible(false);
					Childpanel.add(lblClothSize4);
					
					clothsizeList4.setToolTipText("Please select your child's clothing size from the drop down list.");
					clothsizeList4.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					clothsizeList4.setBounds(833, 232, 134, 26);
					clothsizeList4.setVisible(false);
					Childpanel.add(clothsizeList4);
					
					lblShoeSize4.setBounds(748, 339, 87, 16);
					lblShoeSize4.setVisible(false);
					Childpanel.add(lblShoeSize4);
					
					lblCoatSize4.setBounds(748, 291, 76, 16);
					lblCoatSize4.setVisible(false);
					Childpanel.add(lblCoatSize4);
					shoesizeTF4.setToolTipText("Please enter your child's shoe size in this text field.");
					
					shoesizeTF4.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_shoesizeTF4_focusLost(arg0);
						}
					});
					shoesizeTF4.setColumns(10);
					shoesizeTF4.setBounds(833, 333, 134, 28);
					shoesizeTF4.setVisible(false);
					Childpanel.add(shoesizeTF4);
					coatsizeList.setToolTipText("Please select your child's coat size from the drop down list.");
					
					coatsizeList.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					coatsizeList.setBounds(85, 283, 134, 28);
					Childpanel.add(coatsizeList);
					coatsizeList2.setToolTipText("Please select your child's coat size from the drop down list.");
					
					coatsizeList2.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					coatsizeList2.setBounds(330, 279, 134, 28);
					coatsizeList2.setVisible(false);
					Childpanel.add(coatsizeList2);
					coatsizeList3.setToolTipText("Please select your child's coat size from the drop down list.");
					
					coatsizeList3.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					coatsizeList3.setBounds(579, 279, 134, 28);
					coatsizeList3.setVisible(false);
					Childpanel.add(coatsizeList3);
					coatsizeList4.setToolTipText("Please select your child's coat size from the drop down list.");
					
					coatsizeList4.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					coatsizeList4.setBounds(833, 279, 134, 28);
					coatsizeList4.setVisible(false);
					Childpanel.add(coatsizeList4);
					lblGames4.setToolTipText("<html>\r\nPlease select your child's game system from the drop down list. <br>\r\nSelect all that apply. <br>\r\n</html>");
					
					lblGames4.setBounds(747, 390, 209, 16);
					lblGames4.setVisible(false);
					Childpanel.add(lblGames4);
					
					gamesList4.setModel(new DefaultComboBoxModel(new String[] {"Xbox 360", "Xbox 1", "Computer", "PS3", "PS4", "PSP", "Wii", "Wii U", "Nintendo DS"}));
					gamesList4.setBounds(745, 407, 134, 23);
					gamesList4.setVisible(false);
					Childpanel.add(gamesList4);
					lblInterests4.setToolTipText("<html>\r\nPlease select your child's interests from the drop down list. <br>\r\nSelect all that apply. <br>\r\nIf interest not available, please select \"Other\" and enter interest in text field.<br>\r\n</html>");
					
					lblInterests4.setBounds(748, 478, 202, 16);
					lblInterests4.setVisible(false);
					Childpanel.add(lblInterests4);
					
					interestsList4.setModel(new DefaultComboBoxModel(new String[] {"Arts/Crafts", "Drawing", "Action Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"}));
					interestsList4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_interestsComboBox4_actionPerformed(arg0);
						}
					});
					interestsList4.setBounds(745, 494, 134, 23);
					interestsList4.setVisible(false);
					Childpanel.add(interestsList4);
					otherinterestsTF4.setToolTipText("Please enter your child's other interest in this text field.");
					
					otherinterestsTF4.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_otherinterestsTF4_focusLost(arg0);
						}
					});
					
					otherinterestsTF4.setColumns(10);
					otherinterestsTF4.setBounds(745, 524, 134, 24);
					otherinterestsTF4.setVisible(false);
					Childpanel.add(otherinterestsTF4);
					
					btnAdd4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_btnAdd4_actionPerformed(arg0);
						}
					});
					
					btnAdd4.setBounds(748, 592, 89, 23);
					btnAdd4.setVisible(false);
					Childpanel.add(btnAdd4);
					
					separator_4.setOrientation(SwingConstants.VERTICAL);
					separator_4.setBounds(989, 17, 2, 608);
					separator_4.setVisible(false);
					Childpanel.add(separator_4);
					
					lblCFN5.setBounds(1003, 23, 76, 16);
					lblCFN5.setVisible(false);
					Childpanel.add(lblCFN5);
					
					cfnTF5.setToolTipText("Please enter your child's first name in this text field.");
					cfnTF5.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_cfnTF5_focusLost(arg0);
						}
					});
					cfnTF5.setColumns(10);
					cfnTF5.setBounds(1089, 18, 134, 28);
					cfnTF5.setVisible(false);
					Childpanel.add(cfnTF5);
					
					lblGender5.setToolTipText("Please select your child's gender.");
					lblGender5.setBounds(1004, 78, 61, 16);
					lblGender5.setVisible(false);
					Childpanel.add(lblGender5);
					
					radioMale5.setBounds(1089, 74, 61, 23);
					radioMale5.setVisible(false);
					Childpanel.add(radioMale5);
					
					radioFemale5.setBounds(1156, 74, 67, 23);
					radioFemale5.setVisible(false);
					Childpanel.add(radioFemale5);
					
					lblBirth5.setBounds(1001, 129, 61, 16);
					lblBirth5.setVisible(false);
					Childpanel.add(lblBirth5);
					
					birthFTF5.setToolTipText("Please enter your child's birthdate in this text field.");
					birthFTF5.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_birthFTF5_focusLost(arg0);
						}
					});
					birthFTF5.setBounds(1089, 123, 134, 26);
					birth5Mask.install(birthFTF5);
					birthFTF5.setVisible(false);
					Childpanel.add(birthFTF5);
					
					lblAge5.setBounds(1004, 179, 61, 16);
					lblAge5.setVisible(false);
					Childpanel.add(lblAge5);
					
					ageList5.setToolTipText("Please select your child's age from the drop down list.\r\n");
					ageList5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
					ageList5.setBounds(1089, 173, 134, 28);
					ageList5.setVisible(false);
					Childpanel.add(ageList5);
					
					lblClothSize5.setBounds(1001, 237, 87, 16);
					lblClothSize5.setVisible(false);
					Childpanel.add(lblClothSize5);
					clothsizeList5.setToolTipText("Please select your child's clothing size from the drop down list.");
					
					clothsizeList5.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					clothsizeList5.setBounds(1089, 232, 134, 26);
					clothsizeList5.setVisible(false);
					Childpanel.add(clothsizeList5);
					
					lblCoatSize5.setBounds(1001, 291, 76, 16);
					lblCoatSize5.setVisible(false);
					Childpanel.add(lblCoatSize5);
					coatsizeList5.setToolTipText("Please select your child's coat size from the drop down list.");
					
					coatsizeList5.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					coatsizeList5.setBounds(1089, 283, 134, 28);
					coatsizeList5.setVisible(false);
					Childpanel.add(coatsizeList5);
					
					lblShoeSize5.setBounds(1001, 340, 87, 16);
					lblShoeSize5.setVisible(false);
					Childpanel.add(lblShoeSize5);
					shoesizeTF5.setToolTipText("Please enter your child's shoe size in this text field.");
					
					shoesizeTF5.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_shoesizeTF5_focusLost(arg0);
						}
					});
					shoesizeTF5.setColumns(10);
					shoesizeTF5.setBounds(1089, 333, 134, 28);
					shoesizeTF5.setVisible(false);
					Childpanel.add(shoesizeTF5);
					lblGames5.setToolTipText("<html>\r\nPlease select your child's game system from the drop down list. <br>\r\nSelect all that apply. <br>\r\n</html>");
					
					lblGames5.setBounds(1001, 391, 209, 16);
					lblGames5.setVisible(false);
					Childpanel.add(lblGames5);
					
					gamesList5.setModel(new DefaultComboBoxModel(new String[] {"Xbox 360", "Xbox 1", "Computer", "PS3", "PS4", "PSP", "Wii", "Wii U", "Nintendo DS"}));
					gamesList5.setBounds(1001, 407, 134, 23);
					gamesList5.setVisible(false);
					Childpanel.add(gamesList5);
					lblInterests5.setToolTipText("<html>\r\nPlease select your child's interests from the drop down list. <br>\r\nSelect all that apply. <br>\r\nIf interest not available, please select \"Other\" and enter interest in text field.<br>\r\n</html>");
					
					lblInterests5.setBounds(996, 477, 202, 16);
					lblInterests5.setVisible(false);
					Childpanel.add(lblInterests5);
					
					interestsList5.setModel(new DefaultComboBoxModel(new String[] {"Arts/Crafts", "Drawing", "Action Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"}));
					interestsList5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_interestsComboBox5_actionPerformed(arg0);
						}
					});
					interestsList5.setBounds(1001, 494, 134, 23);
					interestsList5.setVisible(false);
					Childpanel.add(interestsList5);
					otherinterestsTF5.setToolTipText("Please enter your child's other interest in this text field.");
					
					otherinterestsTF5.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_otherinterestsTF5_focusLost(arg0);
						}
					});
					
					otherinterestsTF5.setColumns(10);
					otherinterestsTF5.setBounds(1001, 524, 134, 24);
					otherinterestsTF5.setVisible(false);
					Childpanel.add(otherinterestsTF5);
					
					btnAdd5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_btnAdd5_actionPerformed(arg0);
						}
					});
					
					btnAdd5.setBounds(1001, 592, 89, 23);
					btnAdd5.setVisible(false);
					Childpanel.add(btnAdd5);
					
					separator_5.setOrientation(SwingConstants.VERTICAL);
					separator_5.setBounds(1242, 11, 2, 614);
					separator_5.setVisible(false);
					Childpanel.add(separator_5);
					
					lblCFN6.setVisible(false);
					lblCFN6.setBounds(1250, 24, 76, 16);
					Childpanel.add(lblCFN6);
					
					cfnTF6.setToolTipText("Please enter your child's first name in this text field.");
					cfnTF6.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_cfnTF6_focusLost(arg0);
						}
					});
					cfnTF6.setColumns(10);
					cfnTF6.setVisible(false);
					cfnTF6.setBounds(1324, 17, 134, 28);
					
					Childpanel.add(cfnTF6);
					lblClothSize6.setBounds(1250, 237, 87, 16);
					lblClothSize6.setVisible(false);
					Childpanel.add(lblClothSize6);
					clothsizeList6.setToolTipText("Please select your child's clothing size from the drop down list.");
					
					clothsizeList6.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					clothsizeList6.setBounds(1324, 232, 134, 26);
					clothsizeList6.setVisible(false);
					Childpanel.add(clothsizeList6);
					
					lblGender6.setToolTipText("Please select your child's gender.");
					lblGender6.setBounds(1250, 78, 61, 16);
					lblGender6.setVisible(false);
					Childpanel.add(lblGender6);
					
					radioMale6.setBounds(1321, 74, 61, 23);
					radioMale6.setVisible(false);
					Childpanel.add(radioMale6);
					
					radioFemale6.setBounds(1398, 74, 67, 23);
					radioFemale6.setVisible(false);
					Childpanel.add(radioFemale6);
					
					lblBirth6.setBounds(1250, 128, 61, 16);
					lblBirth6.setVisible(false);
					Childpanel.add(lblBirth6);
					
					birthFTF6.setToolTipText("Please enter your child's birthdate in this text field.");
					birthFTF6.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_birthFTF6_focusLost(arg0);
						}
					});
					birthFTF6.setBounds(1324, 123, 134, 26);
					birth6Mask.install(birthFTF6);
					birthFTF6.setVisible(false);
					Childpanel.add(birthFTF6);
					
					lblAge6.setBounds(1250, 179, 61, 16);
					lblAge6.setVisible(false);
					Childpanel.add(lblAge6);
					
					ageList6.setToolTipText("Please select your child's age from the drop down list.");
					ageList6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"}));
					ageList6.setBounds(1324, 173, 134, 28);
					ageList6.setVisible(false);
					Childpanel.add(ageList6);
					
					lblCoatSize6.setBounds(1250, 291, 76, 16);
					lblCoatSize6.setVisible(false);
					Childpanel.add(lblCoatSize6);
					coatsizeList6.setToolTipText("Please select your child's coat size from the drop down list.");
					
					coatsizeList6.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL", "2L"}));
					coatsizeList6.setBounds(1324, 279, 134, 28);
					coatsizeList6.setVisible(false);
					Childpanel.add(coatsizeList6);
					
					lblShoeSize6.setBounds(1250, 340, 87, 16);
					lblShoeSize6.setVisible(false);
					Childpanel.add(lblShoeSize6);
					shoesizeTF6.setToolTipText("Please enter your child's shoe size in this text field.");
					
					shoesizeTF6.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_shoesizeTF6_focusLost(arg0);
						}
					});
					shoesizeTF6.setColumns(10);
					shoesizeTF6.setBounds(1324, 333, 134, 28);
					shoesizeTF6.setVisible(false);
					Childpanel.add(shoesizeTF6);
					lblGames6.setToolTipText("<html>\r\nPlease select your child's game system from the drop down list. <br>\r\nSelect all that apply. <br>\r\n</html>");
					
					lblGames6.setBounds(1254, 390, 209, 16);
					lblGames6.setVisible(false);
					Childpanel.add(lblGames6);
					
					gamesList6.setModel(new DefaultComboBoxModel(new String[] {"Xbox 360", "Xbox 1", "Computer", "PS3", "PS4", "PSP", "Wii", "Wii U", "Nintendo DS"}));
					gamesList6.setBounds(1254, 406, 134, 23);
					gamesList6.setVisible(false);
					Childpanel.add(gamesList6);
					lblInterests6.setToolTipText("<html>\r\nPlease select your child's interests from the drop down list. <br>\r\nSelect all that apply. <br>\r\nIf interest not available, please select \"Other\" and enter interest in text field.<br>\r\n</html>");
					
					lblInterests6.setBounds(1256, 477, 202, 16);
					lblInterests6.setVisible(false);
					Childpanel.add(lblInterests6);
					
					interestsList6.setModel(new DefaultComboBoxModel(new String[] {"Arts/Crafts", "Drawing", "Action Heroes", "Cars/Trucks", "Planes/Trains", "Music", "Construction", "Lego/Duplo", "Outdoors", "Dolls", "Sports", "Other"}));
					interestsList6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							do_interestsComboBox6_actionPerformed(arg0);
						}
					});
					interestsList6.setBounds(1254, 494, 134, 23);
					interestsList6.setVisible(false);
					Childpanel.add(interestsList6);
					otherinterestsTF6.setToolTipText("Please enter your child's other interest in this text field.");
					
					otherinterestsTF6.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_otherinterestsTF6_focusLost(arg0);
						}
					});
					otherinterestsTF6.setColumns(10);
					otherinterestsTF6.setBounds(1254, 524, 134, 24);
					otherinterestsTF6.setVisible(false);
					Childpanel.add(otherinterestsTF6);
					Childpanel.setFocusCycleRoot(true); //Tabbed order
					Childpanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{cfnTF, radioMale, radioFemale, birthFTF, ageList, clothsizeList, coatsizeList, shoesizeTF, gamesList, interestsList, otherinterestsTF, btnAdd, cfnTF2, radioMale2, radioFemale2, birthFTF2, ageList2, clothsizeList2, coatsizeList2, shoesizeTF2, gamesList2, interestsList2, otherinterestsTF2, btnAdd2, cfnTF3, radioMale3, radioFemale3, birthFTF3, ageList3, clothsizeList3, coatsizeList3, shoesizeTF3, gamesList3, interestsList3, otherinterestsTF3, btnAdd3, cfnTF4, radioMale4, radioFemale4, birthFTF4, ageList4, clothsizeList4, coatsizeList4, shoesizeTF4, gamesList4, interestsList4, otherinterestsTF4, btnAdd4, cfnTF5, radioMale5, radioFemale5, birthFTF5, ageList5, clothsizeList5, coatsizeList5, shoesizeTF5, gamesList5, interestsList5, otherinterestsTF5, btnAdd5, cfnTF6, radioMale6, radioFemale6, birthFTF6, ageList6, clothsizeList6, coatsizeList6, shoesizeTF6, gamesList6, interestsList6, otherinterestsTF6}));
					Financialpanel.setToolTipText("");
					
					tabbedPane.addTab("Financial Information", null, Financialpanel, null);
					Financialpanel.setLayout(null);
					lblEmployment.setBounds(6, 31, 123, 16);
					
					Financialpanel.add(lblEmployment);
					lblIncome.setFont(new Font("Lucida Grande", Font.BOLD, 13));
					lblIncome.setBounds(116, 6, 61, 16);
					
					Financialpanel.add(lblIncome);
					lblSupport.setBounds(6, 71, 158, 16);
					
					Financialpanel.add(lblSupport);
					employmentFTF.setToolTipText("If applicable, please enter your total employment income in this text field.");
					employmentFTF.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_employmentFTF_focusLost(arg0);
						}
					});
					employmentFTF.setForeground(Color.BLACK);
					
					employmentFTF.setBounds(163, 28, 135, 28);
					employmentFTF.setValue(numSetter);
					Financialpanel.add(employmentFTF);
					supportFTF.setToolTipText("If applicable, please enter your child or spousal support income.");
					supportFTF.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_supportFTF_focusLost(arg0);
						}
					});
					supportFTF.setBounds(165, 65, 133, 30);
					supportFTF.setValue(numSetter);
					Financialpanel.add(supportFTF);
					
					lblOntarioWorks.setBounds(6, 109, 101, 16);
					Financialpanel.add(lblOntarioWorks);
					ontarioFTF.setToolTipText("If applicable, please enter your ontario works income.\r\n");
					ontarioFTF.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_ontarioFTF_focusLost(arg0);
						}
					});
					ontarioFTF.setBounds(165, 106, 133, 29);
					ontarioFTF.setValue(numSetter);
					Financialpanel.add(ontarioFTF);
					

					lblDisability.setBounds(6, 149, 135, 16);
					Financialpanel.add(lblDisability);
					disabilityFTF.setToolTipText("If applicable, please enter your E.I. or disaility income.");
					disabilityFTF.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_disabilityFTF_focusLost(arg0);
						}
					});
					disabilityFTF.setBounds(163, 146, 135, 28);
					disabilityFTF.setValue(numSetter);
					Financialpanel.add(disabilityFTF);
					
					lblPension.setBounds(6, 188, 109, 16);
					Financialpanel.add(lblPension);
					pensionFTF.setToolTipText("If applicable, please enter your pension income.");
					pensionFTF.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_pensionFTF_focusLost(arg0);
						}
					});
					pensionFTF.setBounds(163, 185, 135, 28);
					pensionFTF.setValue(numSetter);
					Financialpanel.add(pensionFTF);
					
					lblChildTaxCredits.setBounds(6, 230, 123, 16);
					Financialpanel.add(lblChildTaxCredits);
					childtaxFTF.setToolTipText("If applicable, please enter your child tax credit income.");
					childtaxFTF.addFocusListener(new FocusAdapter() {
						@Override
						public void focusLost(FocusEvent arg0) {
							do_childtaxFTF_focusLost(arg0);
						}
					});
					childtaxFTF.setBounds(163, 224, 135, 28);
					childtaxFTF.setValue(numSetter);
					Financialpanel.add(childtaxFTF);
					lblExpenses.setFont(new Font("Lucida Grande", Font.BOLD, 13));
					
					lblExpenses.setBounds(116, 307, 69, 16);
					Financialpanel.add(lblExpenses);
					
					rentmortgageButtonGroup.add(chckbxRent);
					chckbxRent.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							do_chckbxRent_actionPerformed(e);
						chckbxRent.setSelected(false);
						}
					});
					chckbxRent.setBounds(0, 330, 69, 23);
					Financialpanel.add(chckbxRent);
					
					
					rentmortgageButtonGroup.add(chckbxMort);
					chckbxMort.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							do_chckbxMortgage_actionPerformed(e);
							chckbxMort.setSelected(false);
						}
					});
					
					chckbxMort.setBounds(65, 330, 84, 23);
					Financialpanel.add(chckbxMort);
					
						
						lblGasHydro.setBounds(6, 373, 109, 16);
						Financialpanel.add(lblGasHydro);
						
						lblPhoneTv.setBounds(6, 413, 95, 16);
						Financialpanel.add(lblPhoneTv);
						
						lblCare.setBounds(6, 457, 111, 16);
						Financialpanel.add(lblCare);
						
						lblLoansInsurance.setBounds(6, 534, 143, 16);
						Financialpanel.add(lblLoansInsurance);
						
						transitgasButtonGroup.add(chckbxTransit);
						chckbxTransit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								do_chckbxTransit_actionPerformed(e);
							}
						});
						chckbxTransit.setBounds(0, 493, 80, 23);
						Financialpanel.add(chckbxTransit);
						
						transitgasButtonGroup.add(chckbxGas);
						chckbxGas.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								do_chckbxGas_actionPerformed(e);
							}
						});
						chckbxGas.setBounds(79, 493, 61, 23);
						Financialpanel.add(chckbxGas);
						rentmortFTF.setToolTipText("If applicable, please select rent or mortgage before entering the respectable expense in the text field.");
						rentmortFTF.addFocusListener(new FocusAdapter() {
							@Override
							public void focusLost(FocusEvent arg0) {
								do_rentmortFTF_focusLost(arg0);
							}
						});
						rentmortFTF.setEnabled(false);
						
						rentmortFTF.setForeground(Color.RED);
						rentmortFTF.setBounds(163, 331, 135, 28);
						rentmortFTF.setValue(numSetter);
						Financialpanel.add(rentmortFTF);
						gashydroFTF.setToolTipText("If applicable, please enter the sum of your gas and hydro expenses in this text field.");
						gashydroFTF.addFocusListener(new FocusAdapter() {
							@Override
							public void focusLost(FocusEvent arg0) {
								do_gashydroFTF_focusLost(arg0);
							}
						});
						
						gashydroFTF.setForeground(Color.RED);
						gashydroFTF.setBounds(163, 367, 133, 28);
						gashydroFTF.setValue(numSetter);
						Financialpanel.add(gashydroFTF);
						phonetvFTF.setToolTipText("If applicable, please enter the sum of your phone and T.V. expenses in this text field.");
						phonetvFTF.addFocusListener(new FocusAdapter() {
							@Override
							public void focusLost(FocusEvent arg0) {
								do_phonetvFTF_focusLost(arg0);
							}
						});
						
								
								phonetvFTF.setForeground(Color.RED);
								phonetvFTF.setBounds(163, 409, 135, 26);
								phonetvFTF.setValue(numSetter);
								Financialpanel.add(phonetvFTF);
								careFTF.setToolTipText("If applicable, please enter your child care expenses in this text field.\r\n");
								careFTF.addFocusListener(new FocusAdapter() {
									@Override
									public void focusLost(FocusEvent arg0) {
										do_careFTF_focusLost(arg0);
									}
								});
								
								careFTF.setForeground(Color.RED);
								careFTF.setBounds(163, 450, 133, 30);
								careFTF.setValue(numSetter);
								Financialpanel.add(careFTF);
								transitgasFTF.setToolTipText("If applicable, please select transit or gas before entering the respectable expense in the text field.");
								transitgasFTF.addFocusListener(new FocusAdapter() {
									@Override
									public void focusLost(FocusEvent arg0) {
										do_transitgasFTF_focusLost(arg0);
									}
								});
								
									
									transitgasFTF.setForeground(Color.RED);
									transitgasFTF.setBounds(163, 491, 133, 28);
									transitgasFTF.setValue(numSetter);
									Financialpanel.add(transitgasFTF);
									transitgasFTF.setEnabled(false);
									loansinsuranceFTF.setToolTipText("If applicable, please enter the sum of your loans and insurance expenses in this text field.");
									loansinsuranceFTF.addFocusListener(new FocusAdapter() {
										@Override
										public void focusLost(FocusEvent arg0) {
											do_loansinsuranceFTF_focusLost(arg0);
										}
									});
									
										
										loansinsuranceFTF.setForeground(Color.RED);
										loansinsuranceFTF.setBounds(163, 531, 135, 26);
										loansinsuranceFTF.setValue(numSetter);
										Financialpanel.add(loansinsuranceFTF);
										
										separator.setBounds(6, 298, 576, 9);
										Financialpanel.add(separator);
										lblTotalIncome.setFont(new Font("Lucida Grande", Font.BOLD, 13));
										
										lblTotalIncome.setBounds(6, 274, 123, 16);
										Financialpanel.add(lblTotalIncome);
										totalincomeFTF.setToolTipText("Your total income will display the sum of any income inputed in the text fields.");
										totalincomeFTF.addFocusListener(new FocusAdapter() {
											@Override
											public void focusLost(FocusEvent arg0) {
												do_totalincomeFTF_focusLost(arg0);
											}
										});
										totalincomeFTF.setBounds(163, 263, 135, 27);
										totalincomeFTF.setValue(numSetter);
										Financialpanel.add(totalincomeFTF);
										lblExpensesTotal.setFont(new Font("Lucida Grande", Font.BOLD, 13));
										
										lblExpensesTotal.setBounds(6, 580, 123, 16);
										Financialpanel.add(lblExpensesTotal);
										totalexpensesFTF.setToolTipText("Your total expenses will display the sum of any expenses inputed in the text fields.");
										totalexpensesFTF.addFocusListener(new FocusAdapter() {
											@Override
											public void focusLost(FocusEvent arg0) {
												do_totalexpensesFTF_focusLost(arg0);
											}
										});
										
										totalexpensesFTF.setForeground(Color.RED);
										totalexpensesFTF.setBounds(163, 575, 133, 28);
										totalexpensesFTF.setValue(numSetter);
										Financialpanel.add(totalexpensesFTF);
										lblNet.setFont(new Font("Lucida Grande", Font.BOLD, 13));
										lblNet.setBounds(334, 610, 95, 16);
										
										Financialpanel.add(lblNet);
										netFTF.setToolTipText("Your net income will display the sum of total income subtracted by the sum of total expenses.");
										netFTF.addFocusListener(new FocusAdapter() {
											@Override
											public void focusLost(FocusEvent arg0) {
												do_netFTF_focusLost(arg0);
											}
										});
										
										netFTF.setBounds(441, 604, 141, 22);
										netFTF.setValue(numSetter);
										Financialpanel.add(netFTF);
										Financialpanel.setFocusCycleRoot(true); //Tabbed order 
										Financialpanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{employmentFTF, supportFTF, ontarioFTF, disabilityFTF, pensionFTF, childtaxFTF, totalincomeFTF, chckbxRent, chckbxMort, rentmortFTF, gashydroFTF, phonetvFTF, careFTF, chckbxTransit, chckbxGas, transitgasFTF, loansinsuranceFTF, totalexpensesFTF, netFTF}));
				
	}
	
	
	//Financial Tab Information 
	private void FinancialMethod() {
	employTotal = (((Number) (employmentFTF.getValue())).doubleValue());
	supportTotal = (((Number) (supportFTF.getValue())).doubleValue());
	ontarioTotal = (((Number) (ontarioFTF.getValue())).doubleValue());
	disabilityTotal = (((Number) (disabilityFTF.getValue())).doubleValue());
	pensionTotal = (((Number) (pensionFTF.getValue())).doubleValue());
	incomeTotal = employTotal + supportTotal + ontarioTotal + disabilityTotal + pensionTotal;
	totalincomeFTF.setValue(incomeTotal);
	
	rentmortTotal = (((Number) (rentmortFTF.getValue())).doubleValue());
	gashydroTotal = (((Number) (gashydroFTF.getValue())).doubleValue());
	phonetvTotal = (((Number) (phonetvFTF.getValue())).doubleValue());
	careTotal = (((Number) (careFTF.getValue())).doubleValue());
	loansinsuranceTotal = (((Number) (loansinsuranceFTF.getValue())).doubleValue());
	expensesTotal = rentmortTotal + gashydroTotal + phonetvTotal + careTotal + loansinsuranceTotal;
	totalexpensesFTF.setValue(expensesTotal);
		
	net = incomeTotal - expensesTotal;
	netFTF.setValue(net);
	if (net < 0){
		netFTF.setForeground(Color.RED);
	}
	else {
		netFTF.setForeground(Color.BLACK);
	}
	
}
		
	
	//File section of Menu Bar -- click on Exit
	protected void do_menuitemExit_actionPerformed(ActionEvent e) {
	this.dispose();
	}
	// -- click on Start New form
	protected void do_menuitemStartNewForm_actionPerformed(ActionEvent e) {
		this.dispose();
		BrunoSACAPFrame frame = new BrunoSACAPFrame();
		frame.setVisible(true);
	}
	
	//Help section of Menu Bar -- dialogs for each tab
	protected void do_mntmApplicantInformation_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Be sure to complete all input fields of the Applicant Tab\n" + "before proceeding to the next tab. An error message will\n" + "appear if any fields are missed. Please note that proof\n" + "of address and I.D. for all family members is required.\n" + "Hover your mouse over any field for additioanl help.", "Applicant Information", JOptionPane.INFORMATION_MESSAGE);
	}
	protected void do_mntmChildInformation_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Be sure to complete all input fields of the Child Tab\n" + "before proceeding to the next tab. An error message will\n" + "appear if any fields are missed. If you would like\n" + "to add a child, please click the button below and\n" + "proceed filling out the input fields as you normally would.\n" + "Please note you may only add six children to the application.\n" + "Hover your mouse over any field for additional help.", "Child Information", JOptionPane.INFORMATION_MESSAGE);
	}
	protected void do_mntmFinancialInformation_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "The last section to this application is the Financial Tab.\n" + "Note that you may only fill out the inputs that are applicable to you.\n" + "Hover your mouse over any field for additioanl help.", "Financial Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Applicant Information tab -- dialog checking if any fields of Applicant tab are missing  
	protected void do_firstnameTF_focusLost(FocusEvent arg0) {
		if (firstnameTF.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			lblFirstName.setForeground(Color.RED);
			firstnameTF.grabFocus();
		}
		else {
			lblFirstName.setForeground(Color.BLACK);
		}
		}
		protected void do_lastnameTF_focusLost(FocusEvent arg0) {
			if (lastnameTF.getText().isEmpty()){
				JOptionPane.showMessageDialog(this, "Please Enter Your Last Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
				lblLastName.setForeground(Color.RED);
				lastnameTF.grabFocus();
			}
			else {
				lblLastName.setForeground(Color.BLACK);
			}
		}
		protected void do_addressTF_focusLost(FocusEvent arg0) {
			if (addressTF.getText().isEmpty()){
				JOptionPane.showMessageDialog(this, "Please Enter Your Address", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
				lblAddress.setForeground(Color.RED);
				addressTF.grabFocus();
			}
			else {
				lblAddress.setForeground(Color.BLACK);
			}
		}
		protected void do_othercountyTF_focusLost(FocusEvent arg0) {
		
			if (othercountyTF.getText().isEmpty()){
				JOptionPane.showMessageDialog(this, "Please Enter Your County", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
				lblCounty.setForeground(Color.RED);
				othercountyTF.grabFocus();
			}
			else {
				lblCounty.setForeground(Color.BLACK);
			}
		}
	
	protected void do_zipFTF_focusLost(FocusEvent arg0) {	
		if (zipFTF.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Zip Code", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			lblZipCode.setForeground(Color.RED);
			zipFTF.grabFocus();
		}
		else {
			lblZipCode.setForeground(Color.BLACK);
		}
	}
	protected void do_telFTF_focusLost(FocusEvent arg0) {
		if (telFTF.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your telphone or Celphone Number", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			lblTel.setForeground(Color.RED);
			telFTF.grabFocus();
		}
		else {
			lblTel.setForeground(Color.BLACK);
		}
	}

	protected void do_emailTF_focusLost(FocusEvent arg0) {
		if (emailTF.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Email", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			lblEmail.setForeground(Color.RED);
			emailTF.grabFocus();
		}
		else {
			lblEmail.setForeground(Color.BLACK);
		}
	}
	
	//-- enabling "Other County" text field when it is selected in the "County" drop down list
	protected void do_countyComboBox_actionPerformed(ActionEvent e) {
	int selectedcountylist = countyList.getSelectedIndex();
		if (selectedcountylist == 14 ){
			othercountyTF.setVisible(true);
		}
	}
	//Child Information tab -- enabling "Other Interests" text field when it is selected in the "Child Interests" drop down list
	protected void do_interestsComboBox_actionPerformed(ActionEvent e) {
		int selectedinterestslist = interestsList.getSelectedIndex();
		if (selectedinterestslist == 11 ){
			otherinterestsTF.setVisible(true);
	}
}

	protected void do_interestsComboBox2_actionPerformed(ActionEvent arg0) {
		int selectedinterestslist = interestsList2.getSelectedIndex();
		if (selectedinterestslist == 11 ){
			otherinterestsTF2.setVisible(true);
	}
	}
	protected void do_interestsComboBox3_actionPerformed(ActionEvent arg0) {
		int selectedinterestslist = interestsList3.getSelectedIndex();
		if (selectedinterestslist == 11 ){
			otherinterestsTF3.setVisible(true);
	}
	}
	protected void do_interestsComboBox4_actionPerformed(ActionEvent arg0) {
		int selectedinterestslist = interestsList4.getSelectedIndex();
		if (selectedinterestslist == 11 ){
			otherinterestsTF4.setVisible(true);
	}
	}
	protected void do_interestsComboBox5_actionPerformed(ActionEvent arg0) {
		int selectedinterestslist = interestsList5.getSelectedIndex();
		if (selectedinterestslist == 11 ){
			otherinterestsTF5.setVisible(true);
	}
	}
	protected void do_interestsComboBox6_actionPerformed(ActionEvent arg0) {
		int selectedinterestslist = interestsList6.getSelectedIndex();
		if (selectedinterestslist == 11 ){
			otherinterestsTF6.setVisible(true);
	}
	}
	// -- dialog checking if any fields of Child tab are missing 
	protected void do_cfn1TF_focusLost(FocusEvent arg0) {
		if (cfnTF.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			lblCFN.setForeground(Color.RED);
			cfnTF.grabFocus();
		}
		else{
			lblCFN.setForeground(Color.BLACK);
		}
	}
	
	protected void do_birthFTF_focusLost(FocusEvent arg0) {
		if (birthFTF.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Birthdate", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			birthFTF.grabFocus();
			lblBirth.setForeground(Color.RED);
		}
		else {
			lblBirth.setForeground(Color.BLACK);
		}
	}
	protected void do_shoesizeTF_focusLost(FocusEvent arg0) {
		if (shoesizeTF.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Child's Shoe Size", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			shoesizeTF.grabFocus();
			lblShoeSize.setForeground(Color.RED);
		}
		else {
			lblShoeSize.setForeground(Color.BLACK);
		}
	}
	protected void do_otherinterestsTF_focusLost(FocusEvent arg0) {
		if (otherinterestsTF.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Interests", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			otherinterestsTF.grabFocus();
		}
	}
	protected void do_cfnTF2_focusLost(FocusEvent arg0) {
		if (cfnTF2.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			cfnTF2.grabFocus();
			lblCFN2.setForeground(Color.RED);
		}
		else {
			lblCFN2.setForeground(Color.BLACK);
		}
	}
	protected void do_birthFTF2_focusLost(FocusEvent arg0) {
		if (birthFTF2.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Birthdate", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			birthFTF2.grabFocus();
			lblBirth2.setForeground(Color.RED);
		}
		else {
			lblBirth2.setForeground(Color.BLACK);
		}
	}
	protected void do_shoesizeTF2_focusLost(FocusEvent arg0) {
		if (shoesizeTF2.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Child's Shoe Size", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			shoesizeTF2.grabFocus();
			lblShoeSize2.setForeground(Color.RED);
		}
		else {
			lblShoeSize2.setForeground(Color.BLACK);
		}
	}
	protected void do_otherinterestsTF2_focusLost(FocusEvent arg0) {
		if (otherinterestsTF2.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Interests", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			otherinterestsTF2.grabFocus();
		}
	}
	protected void do_cfnTF3_focusLost(FocusEvent arg0) {
		if (cfnTF3.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			cfnTF3.grabFocus();
			lblCFN3.setForeground(Color.RED);
		}
		else {
			lblCFN3.setForeground(Color.BLACK);
		}
	}
	protected void do_birthFTF3_focusLost(FocusEvent arg0) {
		if (birthFTF3.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Birthdate", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			birthFTF3.grabFocus();
			lblBirth3.setForeground(Color.RED);
		}
		else {
			lblBirth3.setForeground(Color.BLACK);
		}
	}
	protected void do_shoesizeTF3_focusLost(FocusEvent arg0) {
		if (shoesizeTF3.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Child's Shoe Size", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			shoesizeTF3.grabFocus();
			lblShoeSize3.setForeground(Color.RED);
		}
		else {
			lblShoeSize3.setForeground(Color.BLACK);
		}
	}
	protected void do_otherinterestsTF3_focusLost(FocusEvent arg0) {
		if (otherinterestsTF3.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Interests", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			otherinterestsTF3.grabFocus();
		}
	}
	protected void do_cfnTF4_focusLost(FocusEvent arg0) {
		if (cfnTF4.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			cfnTF4.grabFocus();
			lblCFN4.setForeground(Color.RED);
		}
		else {
			lblCFN4.setForeground(Color.BLACK);
		}
	}
	protected void do_birthFTF4_focusLost(FocusEvent arg0) {
		if (birthFTF4.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Birthdate", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			birthFTF4.grabFocus();
			lblBirth4.setForeground(Color.RED);
		}
		else {
			lblBirth4.setForeground(Color.BLACK);
		}
	}
	protected void do_shoesizeTF4_focusLost(FocusEvent arg0) {
		if (shoesizeTF4.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Child's Shoe Size", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			shoesizeTF4.grabFocus();
			lblShoeSize4.setForeground(Color.RED);
		}
		else {
			lblShoeSize4.setForeground(Color.BLACK);
		}
	}
	protected void do_otherinterestsTF4_focusLost(FocusEvent arg0) {
		if (otherinterestsTF4.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Interests", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			otherinterestsTF4.grabFocus();
		}
	}
	protected void do_cfnTF5_focusLost(FocusEvent arg0) {
		if (cfnTF5.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			cfnTF5.grabFocus();
			lblCFN5.setForeground(Color.RED);
		}
		else {
			lblCFN5.setForeground(Color.BLACK);
		}
	}
	protected void do_birthFTF5_focusLost(FocusEvent arg0) {
		if (birthFTF5.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Birthdate", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			birthFTF5.grabFocus();
			lblBirth5.setForeground(Color.RED);
		}
		else {
			lblBirth5.setForeground(Color.BLACK);
		}
	}
	protected void do_shoesizeTF5_focusLost(FocusEvent arg0) {
		if (shoesizeTF5.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Child's Shoe Size", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			shoesizeTF5.grabFocus();
			lblShoeSize5.setForeground(Color.RED);
		}
		else {
			lblShoeSize5.setForeground(Color.BLACK);
		}
	}
	protected void do_otherinterestsTF5_focusLost(FocusEvent arg0) {
		if (otherinterestsTF5.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Interests", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			otherinterestsTF5.grabFocus();
		}
	}
	protected void do_cfnTF6_focusLost(FocusEvent arg0) {
		if (cfnTF6.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's First Name", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			cfnTF6.grabFocus();
			lblCFN6.setForeground(Color.RED);
		}
		else {
			lblCFN6.setForeground(Color.BLACK);
		}
	}
	protected void do_birthFTF6_focusLost(FocusEvent arg0) {
		if (birthFTF6.getText().contains("#")){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Birthdate", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			birthFTF6.grabFocus();
			lblBirth6.setForeground(Color.RED);
		}
		else {
			lblBirth6.setForeground(Color.BLACK);
		}
	}
	protected void do_shoesizeTF6_focusLost(FocusEvent arg0) {
		if (shoesizeTF6.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Child's Shoe Size", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			shoesizeTF6.grabFocus();
			lblShoeSize6.setForeground(Color.RED);
		}
		else {
			lblShoeSize6.setForeground(Color.BLACK);
		}
	}
	protected void do_otherinterestsTF6_focusLost(FocusEvent arg0) {
		if (otherinterestsTF6.getText().isEmpty()){
			JOptionPane.showMessageDialog(this, "Please Enter Your Child's Interests", "Empty Text Error", JOptionPane.ERROR_MESSAGE);	
			otherinterestsTF6.grabFocus();
		}
	}
// enabling other child fields when "Add Child" button is clicked
	protected void do_btnAddChild_actionPerformed(ActionEvent arg0) {
		lblCFN2.setVisible(true);
		cfnTF2.setVisible(true);
		lblGender2.setVisible(true);
		radioMale2.setVisible(true);
		radioFemale2.setVisible(true);
		lblBirth2.setVisible(true);
		birthFTF2.setVisible(true);
		lblAge2.setVisible(true);
		ageList2.setVisible(true);
		lblClothSize2.setVisible(true);
		clothsizeList2.setVisible(true);
		lblCoatSize2.setVisible(true);
		coatsizeList2.setVisible(true);
		lblShoeSize2.setVisible(true);
		shoesizeTF2.setVisible(true);
		lblGames2.setVisible(true);
		gamesList2.setVisible(true);
		lblInterests2.setVisible(true);
		interestsList2.setVisible(true);
		btnAdd2.setVisible(true);
		separator_2.setVisible(true);

	}
	protected void do_btnAdd2_actionPerformed(ActionEvent arg0) {
		lblCFN3.setVisible(true);
		cfnTF3.setVisible(true);
		lblGender3.setVisible(true);
		radioMale3.setVisible(true);
		radioFemale3.setVisible(true);
		lblBirth3.setVisible(true);
		birthFTF3.setVisible(true);
		lblAge3.setVisible(true);
		ageList3.setVisible(true);
		lblClothSize3.setVisible(true);
		clothsizeList3.setVisible(true);
		lblCoatSize3.setVisible(true);
		coatsizeList3.setVisible(true);
		lblShoeSize3.setVisible(true);
		shoesizeTF3.setVisible(true);
		lblGames3.setVisible(true);
		gamesList3.setVisible(true);
		lblInterests3.setVisible(true);
		interestsList3.setVisible(true);
		btnAdd3.setVisible(true);
		separator_3.setVisible(true);

	}
	 protected void do_btnAdd3_actionPerformed(ActionEvent arg0) {
			lblCFN4.setVisible(true);
			cfnTF4.setVisible(true);
			lblGender4.setVisible(true);
			radioMale4.setVisible(true);
			radioFemale4.setVisible(true);
			lblBirth4.setVisible(true);
			birthFTF4.setVisible(true);
			lblAge4.setVisible(true);
			ageList4.setVisible(true);
			lblClothSize4.setVisible(true);
			clothsizeList4.setVisible(true);
			lblCoatSize4.setVisible(true);
			coatsizeList4.setVisible(true);
			lblShoeSize4.setVisible(true);
			shoesizeTF4.setVisible(true);
			lblGames4.setVisible(true);
			gamesList4.setVisible(true);
			lblInterests4.setVisible(true);
			interestsList4.setVisible(true);
			btnAdd4.setVisible(true);
			separator_4.setVisible(true);
	} 

	protected void do_btnAdd4_actionPerformed(ActionEvent arg0) {
		lblCFN5.setVisible(true);
		cfnTF5.setVisible(true);
		lblGender5.setVisible(true);
		radioMale5.setVisible(true);
		radioFemale5.setVisible(true);
		lblBirth5.setVisible(true);
		birthFTF5.setVisible(true);
		lblAge5.setVisible(true);
		ageList5.setVisible(true);
		lblClothSize5.setVisible(true);
		clothsizeList5.setVisible(true);
		lblCoatSize5.setVisible(true);
		coatsizeList5.setVisible(true);
		lblShoeSize5.setVisible(true);
		shoesizeTF5.setVisible(true);
		lblGames5.setVisible(true);
		gamesList5.setVisible(true);
		lblInterests5.setVisible(true);
		interestsList5.setVisible(true);
		btnAdd5.setVisible(true);
		separator_5.setVisible(true);
	
	}
	
	protected void do_btnAdd5_actionPerformed(ActionEvent arg0) {
		lblCFN6.setVisible(true);
		cfnTF6.setVisible(true);
		lblGender6.setVisible(true);
		radioMale6.setVisible(true);
		radioFemale6.setVisible(true);
		lblBirth6.setVisible(true);
		birthFTF6.setVisible(true);
		lblAge6.setVisible(true);
		ageList6.setVisible(true);
		lblClothSize6.setVisible(true);
		clothsizeList6.setVisible(true);
		lblCoatSize6.setVisible(true);
		coatsizeList6.setVisible(true);
		lblShoeSize6.setVisible(true);
		shoesizeTF6.setVisible(true);
		lblGames6.setVisible(true);
		gamesList6.setVisible(true);
		lblInterests6.setVisible(true);
		interestsList6.setVisible(true);
	}	
	
	//Expenses section of Financial Information tab -- enabling formatted text field when check-boxes are selected
		protected void do_chckbxRent_actionPerformed(ActionEvent e) {
			if(chckbxRent.isSelected()) {
				rentmortFTF.setEnabled(true);
			}
		}
		protected void do_chckbxMortgage_actionPerformed(ActionEvent e) {
			if(chckbxMort.isSelected()) {
				rentmortFTF.setEnabled(true);
			}
		}
		protected void do_chckbxTransit_actionPerformed(ActionEvent e) {
			if(chckbxTransit.isSelected()) {
				transitgasFTF.setEnabled(true);
			}
		}
		
		protected void do_chckbxGas_actionPerformed(ActionEvent e) {
			if(chckbxGas.isSelected()) {
				transitgasFTF.setEnabled(true);
			}
		}
	
	//calling Financial Method for IncomeTotal and ExpensesTotal and NetTotal
	protected void do_employmentFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_supportFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_ontarioFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_disabilityFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_pensionFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_childtaxFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_totalincomeFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_rentmortFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_gashydroFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_phonetvFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_careFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_transitgasFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_loansinsuranceFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_totalexpensesFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
	protected void do_netFTF_focusLost(FocusEvent arg0) {
		FinancialMethod();
	}
}