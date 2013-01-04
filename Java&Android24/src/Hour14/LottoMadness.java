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
	JLabel got4Label = new JLabel("4 of 6: ", JLabel.RIGHT);
	JTextField got4 = new JTextField("0");
	JLabel got5Label = new JLabel("5 of 6: ", JLabel.RIGHT);
	JTextField got5 = new JTextField("0");
	JLabel got6Label = new JLabel("6 of 6: ", JLabel.RIGHT);
	JTextField got6 = new JTextField("0");
	JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
	JTextField drawings = new JTextField("0");
	JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
	JTextField years = new JTextField();
	
	public LottoMadness() {
		super("Lotto Madness");
		setLookAndFeel();
		setSize(550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout layout = new GridLayout(5, 1, 10, 10);
		setLayout(layout);
		
		FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		option.add(quickpick);
		option.add(personal);
		row1.setLayout(layout1);
		row1.add(quickpick);
		row1.add(personal);
		add(row1);
		
		
		
		
		
		
		
	}

	private void setLookAndFeel() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
