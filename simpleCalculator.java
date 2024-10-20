
import javax.swing.JFrame;


public class simpleCalculator {

    public static void main(String[] args) {
        //creating jframe
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        //text field
        javax.swing.JTextField textField = new javax.swing.JTextField();
        textField.setBounds(50, 50, 150, 20);
        frame.add(textField);

        //buttons for numbers and operations
        javax.swing.JButton button1 = new javax.swing.JButton("1");
        button1.setBounds(50, 100, 50, 50);
        frame.add(button1);

        javax.swing.JButton button2 = new javax.swing.JButton("2");
        button2.setBounds(100, 100, 50, 50);
        frame.add(button2);

        javax.swing.JButton button3 = new javax.swing.JButton("3");
        button3.setBounds(150, 100, 50, 50);
        frame.add(button3);

        javax.swing.JButton button4 = new javax.swing.JButton("4");
        button4.setBounds(50, 150, 50, 50);
        frame.add(button4);

        javax.swing.JButton button5 = new javax.swing.JButton("5");
        button5.setBounds(100, 150, 50, 50);
        frame.add(button5);

        javax.swing.JButton button6 = new javax.swing.JButton("6");
        button6.setBounds(150, 150, 50, 50);
        frame.add(button6);


        javax.swing.JButton button7 = new javax.swing.JButton("7");
        button7.setBounds(50, 200, 50, 50);
        frame.add(button7);

        javax.swing.JButton button8 = new javax.swing.JButton("8");
        button8.setBounds(100, 200, 50, 50);
        frame.add(button8);

        javax.swing.JButton button9 = new javax.swing.JButton("9");

        button9.setBounds(150, 200, 50, 50);
        frame.add(button9);

        javax.swing.JButton button0 = new javax.swing.JButton("0");

        button0.setBounds(100, 250, 50, 50);
        frame.add(button0);

        javax.swing.JButton buttonPlus = new javax.swing.JButton("+");
        buttonPlus.setBounds(200, 100, 50, 50);
        frame.add(buttonPlus);

        javax.swing.JButton buttonMinus = new javax.swing.JButton("-");
        buttonMinus.setBounds(200, 150, 50, 50);
        frame.add(buttonMinus);

        javax.swing.JButton buttonMultiply = new javax.swing.JButton("*");
        buttonMultiply.setBounds(200, 200, 50, 50);
        frame.add(buttonMultiply);

        javax.swing.JButton buttonDivide = new javax.swing.JButton("/");

        buttonDivide.setBounds(200, 250, 50, 50);
        frame.add(buttonDivide);

        javax.swing.JButton buttonEqual = new javax.swing.JButton("=");
        buttonEqual.setBounds(150, 250, 50, 50);
        frame.add(buttonEqual);

        javax.swing.JButton buttonClear = new javax.swing.JButton("C");
        buttonClear.setBounds(50, 250, 50, 50);
        frame.add(buttonClear);

        frame.setVisible(true);

        //action listener for buttons
        button1.addActionListener((java.awt.event.ActionEvent evt) -> {
            textField.setText(textField.getText() + "1");
        });

        button2.addActionListener((java.awt.event.ActionEvent evt) -> {
            textField.setText(textField.getText() + "2");
        });

        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "3");
            }
        });

        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "4");
            }
        });

        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "5");
            }
        });

        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "6");
            }
        });

        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "7");
            }
        });

        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "8");
            }
        });

        button9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "9");
            }
        });

        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "0");
            }
        });

        buttonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "+");
            }
        });

        buttonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "-");
            }
        });

        buttonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "*");
            }
        });

        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText(textField.getText() + "/");
            }
        });

        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField.setText("");
            }
        });

        buttonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String exp = textField.getText();
                String[] numbers = exp.split("[+\\-*/]");
                int num1 = Integer.parseInt(numbers[0]);
                int num2 = Integer.parseInt(numbers[1]);
                int result = 0;
                if (exp.contains("+")) {
                    result = num1 + num2;
                } else if (exp.contains("-")) {
                    result = num1 - num2;
                } else if (exp.contains("*")) {
                    result = num1 * num2;
                } else if (exp.contains("/")) {
                    result = num1 / num2;
                }
                textField.setText(result + "");
            }
        });

        










    
       






        
    }
}