package examMarksDetactor;

import javax.swing.*;

class Calculator {
    private int marks;

    Calculator(int marks) {
        this.marks = marks;
    }

    void assignGrade() {
        if (marks>100 || marks<0) {
            JOptionPane.showMessageDialog(null, "your marks is not in range.try agin ");
            System.exit(0);
        }
        if (marks > 75) {
            JOptionPane.showMessageDialog(null, "A+");
        } else if (marks == 75) {
            JOptionPane.showMessageDialog(null, "A");
        } else if (marks > 70) {
            JOptionPane.showMessageDialog(null, "A-");
        } else if (marks > 65) {
            JOptionPane.showMessageDialog(null, "B+");
        } else if (marks == 65) {
            JOptionPane.showMessageDialog(null, "B");
        } else if (marks > 60) {
            JOptionPane.showMessageDialog(null, "B-");
        } else if (marks > 55) {
            JOptionPane.showMessageDialog(null, "C+");
        } else if (marks == 55) {
            JOptionPane.showMessageDialog(null, "C");
        } else if (marks > 50) {
            JOptionPane.showMessageDialog(null, "C-");
        } else if (marks > 40) {
            JOptionPane.showMessageDialog(null, "E+");
        } else if (marks == 40) {
            JOptionPane.showMessageDialog(null, "E");
        } else {
            JOptionPane.showMessageDialog(null, "E-");
        }

    }
}

public class Test {
    public static void main(String[] args) {
        do {
            try {
                String inputStr = JOptionPane.showInputDialog("Enter your marks: ");

                if (inputStr==null || inputStr.equals("")) {
                    System.exit(0);
                }

                int input = Integer.parseInt(inputStr);
                Calculator cal = new Calculator(input);
                cal.assignGrade();
                System.exit(0);
                // break;               
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer. Try again.");
            }
        } while (true);
    }
}
