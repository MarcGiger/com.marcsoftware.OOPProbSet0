package paddyspackage;

import javax.swing.*;

public class Canteen {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Name");
        String name2 = JOptionPane.showInputDialog("Enter Class Name");
        Integer amountm = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of muffin"));
        Integer amounts = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of mineral"));
        Integer price = (amountm+amounts)*2;

        JOptionPane.showMessageDialog(null, name+" "+name2+"\n"+amountm+" Muffin and "+amounts+" Mineral"+"\nPrice is: "+price+" EUR");
    }
}
