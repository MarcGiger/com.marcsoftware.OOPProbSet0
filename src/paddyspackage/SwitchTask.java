package paddyspackage;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class SwitchTask {
    public static void main(String[] args) {

        String letter = showInputDialog("enter Char A, D, M, S");

        Integer num1 = Integer.parseInt(showInputDialog("Enter Value1"));
        Integer num2 = Integer.parseInt(showInputDialog("Enter Value2"));

Integer result = null;

switch(letter){
            case "A":
                result = num1+num2;
            case "D":
                result = num1/num2;
            case "M":
                result = num1*num2;
            case "S":
                result = num1-num2;

            default:
                JOptionPane.showMessageDialog(null,"Wrong Statement Entered", "Error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }

JOptionPane.showMessageDialog(null,"The result is: "+String.format("%.3f",result));

    }
}
