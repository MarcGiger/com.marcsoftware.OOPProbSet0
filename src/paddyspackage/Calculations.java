package paddyspackage;

import javax.swing.*;

public class Calculations {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Name");
        String name2 = JOptionPane.showInputDialog("Enter Family name");
        Integer amount = Integer.parseInt(JOptionPane.showInputDialog("Enter cycled distance"));
        double price;
        if(amount<=10) {
            price = amount*0.07;
        }
        else {
            price = (10 * 0.07) + (amount-10)*0.1;
        }

        JOptionPane.showMessageDialog(null, name+" "+name2+"\n"+"Cycled Distance "+amount+" km"+"\nMoney due is: "+price+" EUR");
    }
}
