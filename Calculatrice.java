package calculatrice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculatrice extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JButton bouton0, bouton1, bouton2, bouton3, bouton4, bouton5, bouton6, bouton7, bouton8, bouton9, boutonAdd, boutonSub, boutonMul, boutonDiv, boutonEgal, boutonPoint, boutonClear;
    private double chiffre1 = 0, chiffre2 = 0, resultat = 0;
    private String operation = "";

    public Calculatrice() {
    	setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
    	setForeground(new Color(0, 0, 0));
    	setBackground(new Color(0, 0, 0));
    	getContentPane().setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("Calculatrice");
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(7, 104, 184));

        textField = new JTextField();
        textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);

        bouton0 = new JButton("0");
        bouton0.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton0.setBackground(new Color(7, 104, 184));
        bouton0.setForeground(new Color(255, 255, 255));
        bouton0.setBounds(0, 204, 96, 68);
        bouton1 = new JButton("1");
        bouton1.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton1.setBackground(new Color(7, 104, 184));
        bouton1.setForeground(new Color(255, 255, 255));
        bouton1.setBounds(0, 136, 96, 68);
        bouton2 = new JButton("2");
        bouton2.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton2.setBackground(new Color(7, 104, 184));
        bouton2.setForeground(new Color(255, 255, 255));
        bouton2.setBounds(96, 136, 96, 68);
        bouton3 = new JButton("3");
        bouton3.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton3.setBackground(new Color(7, 104, 184));
        bouton3.setForeground(new Color(255, 255, 255));
        bouton3.setBounds(192, 136, 96, 68);
        bouton4 = new JButton("4");
        bouton4.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton4.setBackground(new Color(7, 104, 184));
        bouton4.setForeground(new Color(255, 255, 255));
        bouton4.setBounds(0, 68, 96, 68);
        bouton5 = new JButton("5");
        bouton5.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton5.setBackground(new Color(7, 104, 184));
        bouton5.setForeground(new Color(255, 255, 255));
        bouton5.setBounds(96, 68, 96, 68);
        bouton6 = new JButton("6");
        bouton6.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton6.setBackground(new Color(7, 104, 184));
        bouton6.setForeground(new Color(255, 255, 255));
        bouton6.setBounds(192, 68, 96, 68);
        bouton7 = new JButton("7");
        bouton7.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton7.setBackground(new Color(7, 104, 184));
        bouton7.setForeground(new Color(255, 255, 255));
        bouton7.setBounds(0, 0, 96, 68);
        bouton8 = new JButton("8");
        bouton8.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton8.setForeground(new Color(255, 255, 255));
        bouton8.setBackground(new Color(7, 104, 184));
        bouton8.setBounds(96, 0, 96, 68);
        bouton9 = new JButton("9");
        bouton9.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        bouton9.setForeground(new Color(255, 255, 255));
        bouton9.setBackground(new Color(7, 104, 184));
        bouton9.setBounds(192, 0, 96, 68);
        boutonAdd = new JButton("+");
        boutonAdd.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonAdd.setBackground(new Color(7, 104, 184));
        boutonAdd.setForeground(new Color(255, 255, 255));
        boutonAdd.setBounds(288, 204, 96, 68);
        boutonSub = new JButton("-");
        boutonSub.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonSub.setBackground(new Color(7, 104, 184));
        boutonSub.setForeground(new Color(255, 255, 255));
        boutonSub.setBounds(288, 136, 96, 68);
        boutonMul = new JButton("*");
        boutonMul.setBackground(new Color(7, 104, 184));
        boutonMul.setForeground(new Color(255, 255, 255));
        boutonMul.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonMul.setBounds(288, 68, 96, 68);
        boutonDiv = new JButton("/");
        boutonDiv.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonDiv.setForeground(new Color(255, 255, 255));
        boutonDiv.setBackground(new Color(7, 104, 184));
        boutonDiv.setBounds(288, 0, 96, 68);
        boutonEgal = new JButton("=");
        boutonEgal.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonEgal.setBackground(new Color(7, 104, 184));
        boutonEgal.setForeground(new Color(255, 255, 255));
        boutonEgal.setBounds(192, 204, 96, 68);
        boutonPoint = new JButton(".");
        boutonPoint.setForeground(new Color(255, 255, 255));
        boutonPoint.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonPoint.setBackground(new Color(7, 104, 184));
        boutonPoint.setBounds(96, 204, 96, 68);
        boutonClear = new JButton("C");
        boutonClear.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
        boutonClear.setBackground(new Color(7, 104, 184));
        boutonClear.setForeground(new Color(255, 255, 255));
        boutonClear.setBounds(0, 272, 96, 68);

        bouton0.addActionListener(this);
        bouton1.addActionListener(this);
        bouton2.addActionListener(this);
        bouton3.addActionListener(this);
        bouton4.addActionListener(this);
        bouton5.addActionListener(this);
        bouton6.addActionListener(this);
        bouton7.addActionListener(this);
        bouton8.addActionListener(this);
        bouton9.addActionListener(this);
        boutonAdd.addActionListener(this);
        boutonSub.addActionListener(this);
        boutonMul.addActionListener(this);
        boutonDiv.addActionListener(this);
        boutonEgal.addActionListener(this);
        boutonPoint.addActionListener(this);
        boutonClear.addActionListener(this);
        panel.setLayout(null);

        panel.add(bouton7);
        panel.add(bouton8);
        panel.add(bouton9);
        panel.add(boutonDiv);
        panel.add(bouton4);
        panel.add(bouton5);
        panel.add(bouton6);
        panel.add(boutonMul);
        panel.add(bouton1);
        panel.add(bouton2);
        panel.add(bouton3);
        panel.add(boutonSub);
        panel.add(bouton0);
        panel.add(boutonPoint);
        panel.add(boutonEgal);
        panel.add(boutonAdd);
        panel.add(boutonClear);

        getContentPane().add(textField, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bouton0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == bouton1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == bouton2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == bouton3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == bouton4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == bouton5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == bouton6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == bouton7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == bouton8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == bouton9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == boutonPoint) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            }
        } else if (e.getSource() == boutonClear) {
            textField.setText("");
            chiffre1 = 0;
            chiffre2 = 0;
            resultat = 0;
            operation = "";
        } else if (e.getSource() == boutonAdd) {
            chiffre1 = Double.parseDouble(textField.getText());
            operation = "+";
            textField.setText("");
        } else if (e.getSource() == boutonSub) {
            chiffre1 = Double.parseDouble(textField.getText());
            operation = "-";
            textField.setText("");
        } else if (e.getSource() == boutonMul) {
            chiffre1 = Double.parseDouble(textField.getText());
            operation = "*";
            textField.setText("");
        } else if (e.getSource() == boutonDiv) {
            chiffre1 = Double.parseDouble(textField.getText());
            operation = "/";
            textField.setText("");
        } else if (e.getSource() == boutonEgal) {
            chiffre2 = Double.parseDouble(textField.getText());
            switch (operation) {
                case "+":
                    resultat = chiffre1 + chiffre2;
                    break;
                case "-":
                    resultat = chiffre1 - chiffre2;
                    break;
                case "*":
                    resultat = chiffre1 * chiffre2;
                    break;
                case "/":
                    if (chiffre2 != 0) {
                        resultat = chiffre1 / chiffre2;
                    } else {
                        textField.setText("Erreur");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(resultat));
            chiffre1 = resultat;
            chiffre2 = 0;
            operation = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculatrice();
            }
        });
    }
}
