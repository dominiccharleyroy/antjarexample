import javax.swing.SwingUtilities;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import app.frame.Frame;

/**
 * An example Application which shows a simple Frame.
 * It is meant to be used as an example project for
 * compiling a Jar.
 */
public class TestApp {
	
	/**
	 * The standard application entry point.
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger l = Logger.getLogger("TestApp");
		l.info("Application starting...");
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Frame();
			}
		});
		l.info("Application started...");
	}
}
