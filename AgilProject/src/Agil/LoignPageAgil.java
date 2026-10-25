    package Agil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoignPageAgil extends JFrame implements ActionListener {

    HashMap<String, String> loginInfo;

    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel message = new JLabel(" ", SwingConstants.CENTER);

    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JButton create = new JButton("Create Account");

    public LoignPageAgil(HashMap<String, String> loginInfo) {
        this.loginInfo = loginInfo;

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JLabel heading = new JLabel("Login to Your Account", SwingConstants.CENTER);
        heading.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        add(heading, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridLayout(4, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(15, 30, 15, 30));

        form.add(new JLabel("Username:"));
        form.add(username);
        form.add(new JLabel("Password:"));
        form.add(password);
        form.add(login);
        form.add(reset);
        form.add(create);
        form.add(new JLabel(""));

        add(form, BorderLayout.CENTER);
        message.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
        add(message, BorderLayout.SOUTH);

        login.addActionListener(this);
        reset.addActionListener(this);
        create.addActionListener(this);

        getRootPane().setDefaultButton(login);
        setSize(460, 360);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            checkLogin();
        }
        if (e.getSource() == reset) {
            username.setText("");
            password.setText("");
            message.setText(" ");
        }
        if (e.getSource() == create) {
            new CreateAnAccount(loginInfo);
            dispose();
        }
    }
    //Error of Commit So new COmmit 
    private void checkLogin() {
        String user = username.getText().trim();
        String pass = new String(password.getPassword());

        if (!loginInfo.containsKey(user)) {
            message.setForeground(Color.RED);
            message.setText("Username not found");
        } else if (!loginInfo.get(user).equals(pass)) {
            message.setForeground(Color.RED);
            message.setText("Wrong password");
        } else {
            new WelcomePage(user);
            dispose();
        }
    }
}
