package Hour14;

import java.awt.*;
import javax.swing.*;

public class Crisis3 extends JFrame {
	JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	public Crisis3() {
		super("Crisis3");
		setLookAndFeel();
		setSize(348,128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout crisisLayout = new BorderLayout();
		setLayout(crisisLayout);
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		add(panicButton,BorderLayout.NORTH);
		add(dontPanicButton,BorderLayout.SOUTH);
		add(blameButton,BorderLayout.EAST);
		add(mediaButton,BorderLayout.WEST);
		add(saveButton,BorderLayout.CENTER);
		setVisible(true);
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			//ignore the error
		}
	}
	
	public static void main(String[] arguments) {
		Crisis3 cr = new Crisis3();
	}
}
