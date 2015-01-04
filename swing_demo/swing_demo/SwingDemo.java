package swing_demo;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Demonstrates the Java Swing package. This is the Java package used for creating user interfaces. 
 * Code from Java 7 for Absolute Beginners
 * @author tjohnson
 *
 */
public class SwingDemo {

  private JFrame frame = new JFrame("SwingDemo");

  private void createAndShowGUI() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(200, 200));
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingDemo swingDemo = new SwingDemo();
    swingDemo.createAndShowGUI();
  }
}