import java.awt.Color;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Zac
 *
 */
public class brighterProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		Color myColor = new Color(50, 100, 150);
		System.out.println(myColor.brighter());
		frame.getContentPane().setBackground(myColor.brighter());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
