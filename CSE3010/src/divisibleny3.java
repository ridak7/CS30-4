import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class divisibleny3 {

	private JFrame frame;
	private JTextField IntegerTF;
	private JLabel DisplayL;
	private JTextField BackgroundTF;

	/** 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					divisibleny3 window = new divisibleny3();
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
	public divisibleny3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel EnterLabel = new JLabel("Enter an integer:");
		EnterLabel.setBounds(33, 51, 141, 32);
		panel.add(EnterLabel);
		
		IntegerTF = new JTextField();
		IntegerTF.setBounds(184, 51, 155, 32);
		panel.add(IntegerTF);
		IntegerTF.setColumns(10);
		
		DisplayL = new JLabel("");
		DisplayL.setBounds(184, 123, 185, 32);
		panel.add(DisplayL);
		
		BackgroundTF = new JTextField();
		BackgroundTF.setBounds(184, 123, 185, 32);
		panel.add(BackgroundTF);
		BackgroundTF.setColumns(10);
		
		JButton CheckButton = new JButton("Check");
		CheckButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int num;//declare number
				num = Integer.parseInt(IntegerTF.getText());//get text from the field
			    if(num%3==0)//check if number divisible by 3
			    {
			    	DisplayL.setText("The integer is divisible by 3.");
			    	//display divisible by 3 message
			    }
			    else
			    {
			    	DisplayL.setText("The integer is not divisible by 3.");
			    	//display else statement
			    }
				
			}
		});
		CheckButton.setBounds(33, 123, 91, 32);
		panel.add(CheckButton);
	}
}