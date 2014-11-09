package app.frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The Application frame, which contains an image.
 */
public class Frame extends JFrame {
	public Frame() {
		setSize(640, 480);
		setTitle("Hello, world!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		ImageIcon i = new ImageIcon(Frame.class.getResource("/download.jpg"));
		add(new JLabel(i));
	}
}
