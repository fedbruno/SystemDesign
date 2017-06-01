import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BrunoInputMaskFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblSsn = new JLabel("SSN:");
	private final JFormattedTextField ssnFTF = new JFormattedTextField();
	MaskFormatter ssnMask = createFormatter("###-##-####");
	private final JLabel lblTele = new JLabel("Telephone:");
	private final JFormattedTextField telephoneFTF = new JFormattedTextField();
	MaskFormatter telephoneMask = createFormatter("(###)-###-####");
	private final JLabel lblZip = new JLabel("Zip:");
	private final JFormattedTextField zipFTF = new JFormattedTextField();
	MaskFormatter zipMask = createFormatter("######");
	private final JLabel lblState = new JLabel("State:");
	private final JFormattedTextField stateFTF = new JFormattedTextField();
	MaskFormatter stateMask = createFormatter("UU");
	private final JLabel lblSSNAns = new JLabel("");
	private final JLabel lblTeleAns = new JLabel("");
	private final JLabel lblZipAns = new JLabel("");
	private final JLabel lblStateAns = new JLabel("");
	MaskFormatter firstnumMask= createFormatter("####"); // creates firstnum as a mask to use # placeholders
	MaskFormatter secondnumMask= createFormatter("####");
	
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
					BrunoInputMaskFrame frame = new BrunoInputMaskFrame();
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
	public BrunoInputMaskFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Input Mask");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSsn.setBounds(22, 37, 61, 16);
		contentPane.add(lblSsn);
		ssnFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_ssnFTF_focusLost(e);
			}
		});
		
		ssnFTF.setBounds(128, 34, 150, 22);
		ssnMask.setPlaceholderCharacter('#');
		ssnMask.install(ssnFTF);
		contentPane.add(ssnFTF);
		
		lblTele.setBounds(22, 65, 94, 16);
		contentPane.add(lblTele);
		telephoneFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_telephoneFTF_focusLost(e);
			}
		});
		
		telephoneFTF.setBounds(128, 59, 150, 28);
		telephoneMask.setPlaceholderCharacter('#');
		telephoneMask.install(telephoneFTF);
		contentPane.add(telephoneFTF);
		
		lblZip.setBounds(22, 90, 61, 16);
		contentPane.add(lblZip);
		zipFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_zipFTF_focusLost(e);
			}
		});
		
		zipFTF.setBounds(128, 87, 150, 22);
		zipMask.setPlaceholderCharacter('#');
		zipMask.install(zipFTF);
		contentPane.add(zipFTF);
		
		lblState.setBounds(22, 118, 61, 16);
		contentPane.add(lblState);
		stateFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_stateFTF_focusLost(e);
			}
		});
		
		stateFTF.setBounds(128, 112, 150, 22);
		stateMask.setPlaceholder("");
		stateMask.install(stateFTF);
		contentPane.add(stateFTF);
		firstnumMask.setPlaceholder("0");
		secondnumMask.setPlaceholder("0");
		lblSSNAns.setBounds(318, 37, 101, 16);
		
		contentPane.add(lblSSNAns);
		lblTeleAns.setBounds(318, 65, 101, 16);
		
		contentPane.add(lblTeleAns);
		lblZipAns.setBounds(318, 90, 101, 16);
		
		contentPane.add(lblZipAns);
		lblStateAns.setBounds(318, 118, 101, 16);
		
		contentPane.add(lblStateAns);
	}
	
	protected void do_ssnFTF_focusLost(FocusEvent e) {
	lblSSNAns.setText(ssnFTF.getText());
	}
	protected void do_telephoneFTF_focusLost(FocusEvent e) {
		lblTeleAns.setText(telephoneFTF.getText());
	}
	protected void do_zipFTF_focusLost(FocusEvent e) {
		lblZipAns.setText(zipFTF.getText());
	}
	protected void do_stateFTF_focusLost(FocusEvent e) {
		lblStateAns.setText(stateFTF.getText());
	}
}