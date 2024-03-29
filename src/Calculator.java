import java.awt.Cursor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

public class Calculator {

    private JFrame window;              // This is the main window
    private JTextField display;         // Input Text
    private JButton btnC, btnBack, btnMod, btnDiv,
                    btn7, btn8, btn9, btnMul,
                    btn4, btn5, btn6, btnRes,
                    btn1, btn2, btn3, btnSum,
                    btnDot, btn0, btnEqual, btnColor;
    private char operation = ' ';           // Operation flag (+,*,-,/,%)
    private boolean canOperate = true,      // Can operate two values
                    canAddDigits = true,    // Can write more digits
                    colorFlag = false;
    private double val = 0;                 // Storage Values For Calcule
    /*    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   C  <-   %   /   |   y[1]
        |   7   8   9   *   |   y[2]
        |   4   5   6   -   |   y[3]
        |   1   2   3   +   |   y[4]
        |   .   0     =     |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */

    public Calculator() {
        window = new JFrame("Calculator");
        window.setSize(410,600);            // Height And Width Of Window
        window.setLocationRelativeTo(null); // Move Window To Center
        
        Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
        
        btnColor = new JButton();
        btnColor.setBounds(200, 30, 140, 18);
        btnColor.setText("Toggle colors");
        btnColor.setBackground(Color.GREEN.darker());
        btnColor.setForeground(Color.WHITE);
        btnColor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnColor.addActionListener(event -> System.out.println("Hi"));
        window.add(btnColor);

        int widthBtn = 80;
        int heightBtn = 70;
        int marginX = 20;
        int marginY = 60;
        
        int[] x = {marginX, marginX+(10+widthBtn), marginX+2*(10+widthBtn), marginX+3*(10+widthBtn)};
        int[] y = {marginY, marginY+(10+heightBtn), marginY+2*(10+heightBtn), marginY+3*(10+heightBtn), marginY+4*(10+heightBtn), marginY+5*(10+heightBtn)};
        // int[] x = {20, 110, 200, 290};
        // int[] y = {60, 160, 240, 320, 400, 480};
        
        display = new JTextField("0");
        display.setBounds(x[0],y[0],350,70);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        window.add(display);
        
        btnC = new JButton("C");
        btnC.setBounds(x[0],y[1],widthBtn,heightBtn);
        btnC.setFont(btnFont);
        btnC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(btnC);
                
        btnBack = new JButton("<-");
        btnBack.setBounds(x[1],y[1],widthBtn,heightBtn);
        btnBack.setFont(btnFont);
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(btnBack);
        
        btnMod = new JButton("%");
        btnMod.setBounds(x[2],y[1],widthBtn,heightBtn);
        btnMod.setFont(btnFont);
        btnMod.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(btnMod);
        
        btnDiv = new JButton("/");
        btnDiv.setBounds(x[3],y[1],widthBtn,heightBtn);
        btnDiv.setFont(btnFont);
        btnDiv.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(btnDiv);
        
        btn7 = new JButton("7");
        btn7.setBounds(x[0],y[2],widthBtn,heightBtn);
        btn7.setFont(btnFont);
        btn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(btn7);
        
        btn8 = new JButton("8");
        btn8.setBounds(x[1],y[2],widthBtn,heightBtn);
        btn8.setFont(btnFont);
        btn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        window.add(btn8);
        
        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If Click into The Red Button => End The Calculator process
        window.setVisible(true);
    }
}