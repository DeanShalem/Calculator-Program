package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//(Width, Height)
//Buttons (34.2,26.6)
//Screen (186.2,49.4)

public class Calculator extends JFrame {
    
    JButton b;
    JPanel p;

        Calculator()
        {
            setTitle("Calculator");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    public static void main(String[] args) {
        Calculator ob = new Calculator();
        ob.setVisible(true);
    }
}
