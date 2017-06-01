import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ByCategoryFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblFillOutYour = new JLabel("<html>\r\nSelect any category/catagories from the list below you would like to view. \r\n</html>\r\n");
	private final JLabel lblCategory = new JLabel("Category:");
	private final JButton btnFilter = new JButton("Filter");
	private final JButton btnCancel = new JButton("Cancel");
	private final JComboBox selectedCategoryCB = new JComboBox();
	
	public ByCategoryFrame() {
		jbInit();
	
	}
	private void jbInit() {
		setTitle("Filter By Category Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblFillOutYour.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFillOutYour.setBounds(61, 11, 282, 52);
		
		contentPane.add(lblFillOutYour);
		lblCategory.setBounds(90, 105, 71, 23);
		
		contentPane.add(lblCategory);
		btnFilter.setToolTipText("<html>\r\nApplies the selected category<br>\r\nfilter to be displayed in inventory\r\n</html>");
		btnFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnFilter_actionPerformed(arg0);
			}
		});
		btnFilter.setBounds(90, 201, 89, 23);
		
		contentPane.add(btnFilter);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnCancel_actionPerformed(arg0);
			}
		});
		btnCancel.setBounds(189, 201, 89, 23);
		
		contentPane.add(btnCancel);
		selectedCategoryCB.setToolTipText("<html>\r\nSelect a category from<br>\r\nthe dropdown list\r\n</html>");
		selectedCategoryCB.setModel(new DefaultComboBoxModel(new String[] {"Humor", "Biography", "Autobiography", "Literature", "Mystery", "Graphic Novel", "Young Adult", "Romance", "SciFi", "Other"}));
		selectedCategoryCB.setBounds(170, 105, 109, 22);
		
		contentPane.add(selectedCategoryCB);
	}
	
	//makes it possible to transfer the selected category from the drop down to the main frame where it can be displayed in the table
	protected void do_btnFilter_actionPerformed(ActionEvent arg0) {
		BrunoBookFaceFrame frame = new BrunoBookFaceFrame();
		String categoryOption = selectedCategoryCB.getSelectedItem().toString();
		frame.selectedCategory = " AND Category = '"+categoryOption+"'";
		this.dispose();
	}
	
	//cloes the CategoryFrame without updating any data
	protected void do_btnCancel_actionPerformed(ActionEvent arg0) {
	this.dispose();
	}
}
