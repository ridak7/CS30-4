import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class metricconversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					metricconversion window = new metricconversion();
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
	public metricconversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 362, 217);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 346, 178);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel CLabel = new JLabel("Select a converstion type:");
		CLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CLabel.setBounds(10, 11, 229, 26);
		panel.add(CLabel);
		
		JComboBox CBox = new JComboBox();
		CBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		CBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Inches to Centimeters", 
				"Feet to Meters", "Gallons to Liters", "Pound to Kilograms"}));
		CBox.setBounds(10, 48, 309, 26);
		panel.add(CBox);
		
		JTextArea CDisplay = new JTextArea();
		CDisplay.setBounds(10, 85, 309, 26);
		panel.add(CDisplay);
		
		JButton CButton = new JButton("Submit");//action button
		CButton.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) 
			{
				 String converstionType = " ";//set conversion type
				 if(CBox.getSelectedItem().equals("Inches to Centimeters"))//check for selected item
				 {
					 converstionType = "1 inch = 2.54 centimeters";//inches to centimeters formula
				 }
				 else if(CBox.getSelectedItem().equals("Feet to Meters"))//check for selected item
				 {
					 converstionType = "1 foot = 0.3048 meters";//feet to meters formula
				 }
				 else if(CBox.getSelectedItem().equals("Gallons to Liters"))//check for selected item
				 {
					 converstionType = "1 gallon = 4.5461 liters";//gallons to liters formula
				 }
				 else if(CBox.getSelectedItem().equals("Pound to Kilograms"))//check for selected item
				 {
					 converstionType = "1 pound = 0.4536 kilograms";//pound to kilograms formula
				 }
				 CDisplay.setText(converstionType);//display text
			}
		});
		CButton.setBounds(10, 122, 309, 45);
		panel.add(CButton);

	}
}

