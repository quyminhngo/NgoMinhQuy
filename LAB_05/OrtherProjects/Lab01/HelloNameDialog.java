// create the first javac programimport javax.swing.JOptionPane;
import javax.swing.JOptionPane; //importing the JOptionPane class from the javax.swing package
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
    }
}
