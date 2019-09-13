package paddyspackage;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class SwitchTask2 {
    public static void main(String[] args) {

          String letter = showInputDialog("enter Char A, D, M, S").toUpperCase();
        char ch= letter.charAt(0);

        float result = Integer.parseInt(showInputDialog("Enter Value 1"));
        float num2 = Integer.parseInt(showInputDialog("Enter Value 2"));

        while(ch!='q'){


        }


switch(ch){
            case 'A':
            case 'a':
                result = result+num2;
                break;
            case 'D':
                result = result/num2;
                break;
            case 'M':
                result = result*num2;
                break;
            case 'S':
                result = result-num2;
                break;

            default:
                JOptionPane.showMessageDialog(null,"Wrong Statement Entered", "Error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }

JOptionPane.showMessageDialog(null,"The result is: "+String.format("%.3f",result));



    }
}
