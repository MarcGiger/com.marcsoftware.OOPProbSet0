package paddyspackage;

import javax.swing.*;

public class TaxCalculation {

    public static void main(String[] args) {

String name = JOptionPane.showInputDialog("Enter Name");
Integer income = Integer.parseInt(JOptionPane.showInputDialog("Enter your Income without comma"));

   double tax = 0;

   if(income>=0&&income<=20000) {
       tax = 0;
   }

   else if (income>20000&&income<=36000) {
       tax = 0.2;
   }

   else {
       tax = 0.41;
   }

JOptionPane.showMessageDialog(null,name+"\n"+"Tax due: "+income*tax+" EUR");

    }
}
