package Hour14;

import java.awt.*;
import javax.swing.*;

public class LottoMadness extends JFrame {

	//set up row 1
	JPanel row1 = new JPanel();
	ButtonGroup option = new ButtonGroup();
	JCheckBox quickpick = new JCheckBox("Quick Pick", false);
	JCheckBox  personal = new JCheckBox("Personal", true);
	//set up row 2
	JPanel row2 = new JPanel();
	JLabel numbersLabel = new JLabel("Your picks:", JLabel.RIGHT);
	JTextField[] numbers = new JTextField[6];
	JLabel winnersLabel = new JLabel("Winners:", JLabel.RIGHT);
	JTextField[] winners = new JTextField[6];
	//set up row 3
	JPanel row3 = new JPanel();
	JButton stop = new JButton("Stop");
	JButton play = new JButton("Play");
	JButton reset = new JButton("Reset");
	//set up row 4
	JPanel row4 = new JPanel();
	JLabel got3Label = new JLabel("3 of 6: ", JLabel.RIGHT);
	JTextField got3 = new JTextField("0");
	
}
