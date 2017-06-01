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

public class BrunoMoveItFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel ball = new JLabel("");
	private final JButton btnRightDownDiagonal = new JButton("↘\n");
	private final JButton btnMoveItLeft = new JButton("←\n");
	private final JButton btnMoveItRight = new JButton("→");
	private final JButton btnLeftUpDiagonal = new JButton(" ↖\n");
	private final JButton btnMoveItUp = new JButton(" ↑\n");
	private final JButton btnMoveItDown = new JButton("↓\n");
	private final JButton btnRightUpDiagonal = new JButton("↗\n");
	private final JButton btnLeftDownDiagonal = new JButton("↙\n");

	Timer movetimer = new Timer(70, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	ball.setLocation(ball.getX() + 5, ball.getY());
        
        	if (ball.getX() + ball.getWidth() >= contentPane.getWidth()) {
        		movetimer.stop();
        	}
        }
});
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrunoMoveItFrame frame = new BrunoMoveItFrame();
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
	public BrunoMoveItFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Bruno Move It!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ball.setBackground(new Color(0, 204, 0));
		ball.setBounds(192, 148, 81, 75);
		
		contentPane.add(ball);
		ball.setOpaque(true);
		btnRightDownDiagonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnRightDownDiagonal_actionPerformed(e);
			}
		});
		btnRightDownDiagonal.setToolTipText("<html>\nmoves the green box<br>\ndiagonally right\n</html>");
		btnRightDownDiagonal.setBounds(352, 72, 57, 43);
		
		contentPane.add(btnRightDownDiagonal);
		btnMoveItLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveItLeft_actionPerformed(e);
			}
		});
		btnMoveItLeft.setBounds(41, 54, 57, 43);
		
		contentPane.add(btnMoveItLeft);
		btnMoveItRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveItRight_actionPerformed(e);
			}
		});
		btnMoveItRight.setBounds(95, 54, 63, 43);
		
		contentPane.add(btnMoveItRight);
		btnLeftUpDiagonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnLeftUpDiagonal_actionPerformed(e);
			}
		});
		btnLeftUpDiagonal.setToolTipText("<html>\nmoves the green box<br>\ndiagonally left\n</html>");

		btnLeftUpDiagonal.setBounds(294, 29, 58, 43);
		
		contentPane.add(btnLeftUpDiagonal);
		btnMoveItUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveItUp_actionPerformed(e);
			}
		});
		btnMoveItUp.setBounds(69, 6, 57, 43);
		
		contentPane.add(btnMoveItUp);
		btnMoveItDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnMoveItDown_actionPerformed(e);
			}
		});
		btnMoveItDown.setBounds(69, 104, 57, 43);
		
		contentPane.add(btnMoveItDown);
		btnRightUpDiagonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnRightUpDiagonal_actionPerformed(e);
			}
		});
		btnRightUpDiagonal.setBounds(352, 29, 57, 43);
		
		contentPane.add(btnRightUpDiagonal);
		btnLeftDownDiagonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnLeftDownDiagonal_actionPerformed(e);
			}
		});
		btnLeftDownDiagonal.setBounds(295, 72, 57, 43);
		
		contentPane.add(btnLeftDownDiagonal);
	}
	
	protected void do_btnMoveItLeft_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX() - 2, ball.getY());
	}

	protected void do_btnMoveItRight_actionPerformed(ActionEvent e) {
		if (movetimer.isRunning() == false) {
			movetimer.start();
		}
		else 
		{
			movetimer.stop();
		}
	}
	protected void do_btnMoveItUp_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX(), ball.getY() -2);
	}
	
	protected void do_btnMoveItDown_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX() , ball.getY() + 2);
	}
	
	protected void do_btnLeftUpDiagonal_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX() - 2, ball.getY() - 2);
	}
	
	protected void do_btnRightUpDiagonal_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX() + 2, ball.getY() -2);
	}
	
	protected void do_btnLeftDownDiagonal_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX() - 2, ball.getY() + 2);
	}
	
	protected void do_btnRightDownDiagonal_actionPerformed(ActionEvent e) {
		ball.setLocation(ball.getX() + 2, ball.getY() +2 );
	}
}
