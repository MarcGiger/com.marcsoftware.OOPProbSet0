package paddyspackage;

import javax.swing.*;

public class CountLoop {
    public static void main(String[] args) {

        String random = JOptionPane.showInputDialog("enter a random Number or end with (q)");

int zero=0, neg=0, pos=0;

        while(!random.equals("q")) {
int input = Integer.parseInt(random);

if(input == 0) {
    zero++;
}
else if(input>0){
    pos++;
}
else{
    neg++;
}
            random = JOptionPane.showInputDialog("enter a random Number or end with (q)");

        }

        if(zero+pos+neg==0) {
            JOptionPane.showMessageDialog(null, "You have not entered any value", "Error", JOptionPane.ERROR_MESSAGE);
        }
            else{JOptionPane.showMessageDialog(null, "You entered\n"+"Zero: "+zero+"\nNegative: "+neg+"\nPositive: "+pos, "Results", JOptionPane.INFORMATION_MESSAGE);

            }



    }

}
