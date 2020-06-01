package Calculator;

import javax.swing.JOptionPane;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  String input;     // To hold String input.
      int    length;    // To hold length.
      int    width;     // To hold width.
      int    area;      // To hold area.

      // Prompt user to input length.
      input = JOptionPane.showInputDialog("Enter First Value");

      // Convert the String input to an int.
      length = Integer.parseInt(input);

      // Prompt user to input width.
      input = JOptionPane.showInputDialog("Enter Second value");

      // Convert the String input to an int.
      width = Integer.parseInt(input);

      // Calculate area of rectangle.
      area = length * width;

      // Display area of rectangle.
      JOptionPane.showMessageDialog(null,
                                    "Area of rectangle is " + area+"\n Thanks for using this calculator");
      JOptionPane.showMessageDialog(null,
              "Keep in mind that the area of rectangle is " + area);
  }
}
