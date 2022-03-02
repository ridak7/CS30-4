import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class breakerplate {

	private JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					breakerplate window = new breakerplate();
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
	public breakerplate()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{	
		ImageIcon pHolder = new ImageIcon("/placeholder.gif");//create and store icon
		ImageIcon plates1 = new ImageIcon("/plates_all_broken.gif");//create and store icon
		ImageIcon plates2 = new ImageIcon("/plates_two_broken.gif");//create and store icon
		ImageIcon plates3 = new ImageIcon("/plates.gif");//create and store icon
		ImageIcon sticker = new ImageIcon("/sticker.gif");//create and store icon
		ImageIcon tiger = new ImageIcon("/tiger_plush.gif");//create and store icon
		
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 446, 374);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel PlatDisplay = new JLabel("");
		PlatDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		PlatDisplay.setBounds(61, 47, 319, 105);
		panel.add(PlatDisplay);
		
		JLabel PrizDisplay = new JLabel("");
		PrizDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		PrizDisplay.setBounds(10, 247, 426, 116);
		panel.add(PrizDisplay);
		
		PlatDisplay.setIcon(plates1);
		PrizDisplay.setIcon(pHolder);
		
		JButton PButton = new JButton("PLAY!");
		PButton.setFont(new Font("Arial", Font.BOLD, 25));
		PButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//select random integers between 1 to 2
				int playGame = 1 + (int)( 2 * Math.random() );
				if (playGame == 1)//check for number if equal 1
				{
					PlatDisplay.setIcon(plates2);//generate random image
					PrizDisplay.setIcon(sticker);//generate random prize
					PButton.setText("PLAY AGAIN!");//display play again text
				}
				else if (playGame == 2)//check for number if equal 2
				{
					PlatDisplay.setIcon(plates3);//generate random image
					PrizDisplay.setIcon(tiger);//generate random prize
					PButton.setText("PLAY AGAIN!");//display play again text
				}
			}
		});
		PButton.setBounds(10, 163, 426, 79);
		panel.add(PButton);
		
		JLabel BTitle = new JLabel("Break A Plate");
		BTitle.setFont(new Font("Arial", Font.BOLD, 25));//massive button for mr.abdalla
		BTitle.setHorizontalAlignment(SwingConstants.CENTER);
		BTitle.setBounds(10, 11, 426, 35);
		panel.add(BTitle);
	}
}
