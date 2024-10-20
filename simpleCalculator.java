
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

        //buttons
        javax.swing.JButton button1 = new javax.swing.JButton("1");
        button1.setBounds(50, 100, 50, 50);
        frame.add(button1);
        


        
    }
}