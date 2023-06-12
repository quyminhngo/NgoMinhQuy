import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String StrNotification = "You have entered: ";
        strNum1 = JOptionPane.showInputDialog(null,
                "Enter the first number: ",
                "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Enter the second number: ",
                "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        StrNotification += strNum1 + " and " + strNum2;
        JOptionPane.showMessageDialog(null, StrNotification,
                "The numbers you entered", JOptionPane.INFORMATION_MESSAGE);
    }
}
