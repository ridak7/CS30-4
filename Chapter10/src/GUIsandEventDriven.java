import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class GUIsandEventDriven {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					GUIsandEventDriven window = new GUIsandEventDriven();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIsandEventDriven()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton FNLNSubmit = new JButton("Submit");
		FNLNSubmit.setBounds(23, 124, 383, 126);
		FNLNSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	
				String msg = FN.getText();
				String msg = LN.getText();
				FNLNSubmit.setText(msg);
				
			}
		});
		panel.add(FNLNSubmit);
		
		FN = new JTextField();
		FN.setBounds(94, 22, 97, 33);
		panel.add(FN);
		FN.setColumns(10);
		FN.setColumns(10);
		
		JComboBox SS = new JComboBox();
		SS.setModel(new DefaultComboBoxModel(new String[] {"Select", "Crescent Heights High School", "Nose Creek School", "Joe Mama High School", "Potato PC School", "Tomato Portable Technologies High School", "Bob School"}));
		SS.setBounds(309, 91, 97, 22);
		panel.add(SS);
		
		JComboBox GS = new JComboBox();
		GS.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "Other"}));
		GS.setBounds(38, 91, 97, 22);
		panel.add(GS);
		
		JLabel GradeLabel = new JLabel("Select Grade:");
		GradeLabel.setBounds(38, 66, 97, 14);
		panel.add(GradeLabel);
		
		JLabel FNLabel = new JLabel("First Name:");
		FNLabel.setBounds(23, 31, 61, 14);
		panel.add(FNLabel);
		
		LN = new JTextField();
		LN.setColumns(10);
		LN.setBounds(309, 22, 97, 33);
		panel.add(LN);
		
		JLabel LNLabel = new JLabel("Last Name:");
		LNLabel.setBounds(238, 31, 61, 14);
		panel.add(LNLabel);
		
		JLabel SchoolLabel = new JLabel("Select School:");
		SchoolLabel.setBounds(309, 66, 97, 14);
		panel.add(SchoolLabel);
	}
}
