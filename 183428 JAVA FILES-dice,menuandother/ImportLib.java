import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ImportLib {
    public static void main(String[] args) {
        // Example usage of JOptionPane
        String input = JOptionPane.showInputDialog("Enter a number:");
        if (input != null) {
            try {
                int number = Integer.parseInt(input);
                JOptionPane.showMessageDialog(null, "You entered: " + number);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No input provided.");
        }
    }

}

