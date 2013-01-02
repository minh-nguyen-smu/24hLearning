package Hour14;

import java.awt.*;
import javax.swing.*;

public class Crisis4 extends JFrame {
	JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	public Crisis4() {
		super("Crisis4");
		setLookAndFeel();
		setSize(128,160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		
		JPanel pane = new JPanel();
		BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(box);
		pane.add(panicButton);
		pane.add(dontPanicButton);
		pane.add(blameButton);
		pane.add(mediaButton);
		pane.add(saveButton);
		add(pane);
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
		Crisis4 cr = new Crisis4();
	}
}
