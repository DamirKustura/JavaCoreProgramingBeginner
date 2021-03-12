package mypackage;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Jeff", "Kim", "Kobe", "James", "John", "Brown"};

        String enterNumberText = JOptionPane.showInputDialog("Enter one number from 1 to 6 to find a Person..");

        int enterNumber = Integer.parseInt(enterNumberText);

        switch (enterNumber) {
            case 1:
                JOptionPane.showMessageDialog(null, names[0]);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, names[1]);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, names[2]);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, names[3]);
                break;
            case 5:
                JOptionPane.showMessageDialog(null,names[4]);
                break;
            case 6:
                JOptionPane.showMessageDialog(null,names[5]);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Unesi ponovo neki broj");
        }
    }
}
