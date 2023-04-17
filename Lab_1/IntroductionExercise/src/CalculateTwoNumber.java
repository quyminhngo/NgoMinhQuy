import javax.swing.*;
public class CalculateTwoNumber {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number:",
                "NgoMinhQuy20215238 - Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ",
                "NgoMinhQuy20215238 - Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null,num1 + num2,
                "The sum of two double number!",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,num1 - num2,
                "The different of two double number!",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,num1 * num2,
                "The product of two double number!",JOptionPane.INFORMATION_MESSAGE);
        if(num2 == 0)
        {
            JOptionPane.showMessageDialog(null,"The divisor is equal to 0!\nIt must be not equal 0!");
        }
        else {
            JOptionPane.showMessageDialog(null,num1 / num2,
                    "The product of two double number!",JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
