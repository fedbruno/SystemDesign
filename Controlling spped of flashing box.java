import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class BrunoFlashingBoxFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel box = new JLabel("");
	private final JButton btnFlash = new JButton("Flash");

	/**
	 * Timer timer = new Timer(100, new ActionListener() {
	        //1st parameter is the delay (millisecond)
	         //2nd parameter is a new method
	            public void actionPerformed(ActionEvent e) {
	                  //put your code here
	            }
	}); //brace-parenthesis-semicolon
	//bracket closes method, parenthesis closes parameters, and semicolon ends timer
	 */
	
	Timer flashtimer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	flashtimer.setDelay(slider.getValue());
            	box.setVisible(!box.isVisible());
            }
});
	private final JSlider slider = new JSlider();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoFlashingBoxFrame frame = new BrunoFlashingBoxFrame();
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
	public BrunoFlashingBoxFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Flashing Box");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		box.setBackground(Color.MAGENTA);
		box.setOpaque(true);
		box.setBounds(178, 60, 70, 56);
		contentPane.add(box);
		
		btnFlash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFlash_actionPerformed(e);
			}
		});
		
		btnFlash.setBounds(154, 140, 117, 29);
		contentPane.add(btnFlash);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(25);
		slider.setBounds(116, 198, 190, 29);
		
		contentPane.add(slider);
	}
	protected void do_btnFlash_actionPerformed(ActionEvent e) {
	if (!flashtimer.isRunning()) {
		flashtimer.start();
	}
	else {
		flashtimer.stop();
		}
	}
}