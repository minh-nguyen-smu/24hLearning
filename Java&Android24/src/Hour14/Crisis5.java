package Hour14;

import java.awt.*;
import javax.swing.*;

public class Crisis5 extends JFrame {
	JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	public Crisis5() {
		super("Crisis");
		setLookAndFeel();
		setSize(348,128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		add(panicButton);
		add(dontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(saveButton);
		setVisible(true);
	}
	
	public Insets getInsets() {
		Insets squeeze = new Insets(50,15,10,15);
		return squeeze;
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			//ignore the error
		}
	}
	
	public static void main(String[] arguments) {
		Crisis5 cr = new Crisis5();
	}
}
