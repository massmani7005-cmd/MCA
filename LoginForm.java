import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Secure Login");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(30, 50, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(130, 50, 120, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(30, 100, 100, 30);
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(130, 100, 120, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 160, 80, 30);

        JLabel status = new JLabel("");
        status.setBounds(30, 210, 250, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = t1.getText();
                String pass = new String(p1.getPassword());
                
                // Logic: username "admin" and password "123"
                if (user.equals("admin") && pass.equals("123")) {
                    status.setText("Login Success! Welcome.");
                } else {
                    status.setText("Invalid Username or Password!");
                }
            }
        });

        f.add(l1); f.add(t1); f.add(l2); f.add(p1); f.add(b); f.add(status);
        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
