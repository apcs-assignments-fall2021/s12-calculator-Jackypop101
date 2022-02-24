import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quadratic {
    JFrame frame;
    LTPanel aPanel, bPanel, cPanel, answerPanel;
    JPanel formulaPanel, buttonPanel;
    JLabel formulaLabel;
    JButton clearButton, calculateButton;
    public Quadratic() {
        // Set up the frame
        frame = new JFrame("Quadratic Formula");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up and add the panels
        formulaPanel = new JPanel();
        aPanel = new LTPanel("a =", 10);
        bPanel = new LTPanel("b =", 10);
        cPanel = new LTPanel("c =", 10);
        buttonPanel = new JPanel();
        answerPanel = new LTPanel("Answer:", 10);

        frame.add(formulaPanel);
        frame.add(aPanel);
        frame.add(bPanel);
        frame.add(cPanel);
        frame.add(buttonPanel);
        frame.add(answerPanel);

        // Set up individual panels
        // formulaPanel code
        formulaLabel = new JLabel("ax^2 + bx + c = 0");
        formulaPanel.add(formulaLabel);

        // buttonPanel code
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                aPanel.setText("");
                bPanel.setText("");
                cPanel.setText("");
            }
        });

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Potentially a lot of code here
                // But just add code to call quadForm

                quadForm();
            }
        });

        buttonPanel.add(clearButton);
        buttonPanel.add(calculateButton);

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public void quadForm() {
        double w = ((Double.parseDouble(bPanel.getText()) * -1) + (Math.sqrt(Math.pow(Double.parseDouble(bPanel.getText()), 2) - (4 * Double.parseDouble(aPanel.getText()) * Double.parseDouble(cPanel.getText())))))/(2*Double.parseDouble(aPanel.getText()));
        answerPanel.setText("" + w);
    }

    public static void main(String[] args) {
        Quadratic q = new Quadratic();
    }
}
