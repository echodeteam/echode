package echode;

import echode.api.Echode;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class EchodeGUI {
	private static JFrame frame;
        private static Echode instance;
        static JTextPane tpane;
	public static void main() {
                instance = new Echode(System.out);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (    UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
		add(frame.getContentPane());
	
	}
	public static void add(Container pane) {
	tpane = new JTextPane();
        tpane.setPreferredSize(new Dimension(200, 100));
        pane.add(tpane, BorderLayout.CENTER);
	}

	
}
