package paddyspackage;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class SwitchTask {
    public static void main(String[] args) {

        String letter = showInputDialog("enter Char A, D, M, S").toUpperCase();
        char ch= letter.charAt(0);

        Integer num1 = Integer.parseInt(showInputDialog("Enter Value 1"));
        Integer num2 = Integer.parseInt(showInputDialog("Enter Value 2"));

float result = 0;

switch(ch){
            case 'A':
            case 'a':
                result = num1+num2;
                break;
            case 'D':
                result = num1/num2;
                break;
            case 'M':
                result = num1*num2;
                break;
            case 'S':
                result = num1-num2;
                break;

            default:
                JOptionPane.showMessageDialog(null,"Wrong Statement Entered", "Error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }

JOptionPane.showMessageDialog(null,"The result is: "+String.format("%.3f",result));

    }
}
