package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField textField;
    private String prevNumb = "0";
    private char op = 'n';
    private boolean opClicked = false;


    public static void main(String[] args) {

            EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Calculator(){

        setTitle("Calculator Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,354,387);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(null);
        setContentPane(contentPane);



        JButton buttonOne = new JButton("1");
        buttonOne.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonOne.setBounds(10,138,47,33);
        contentPane.add(buttonOne);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonTwo.setBounds(60,138,47,33);
        contentPane.add(buttonTwo);

        JButton buttonThree = new JButton("3");
        buttonThree.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonThree.setBounds(110,138,47,33);
        contentPane.add(buttonThree);

        JButton buttonFour = new JButton("4");
        buttonFour.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonFour.setBounds(10,100,47,33);
        contentPane.add(buttonFour);


        JButton buttonFive = new JButton("5");
        buttonFive.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonFive.setBounds(60,100,47,33);
        contentPane.add(buttonFive);

        JButton buttonSix = new JButton("6");
        buttonSix.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonSix.setBounds(110,100,47,33);
        contentPane.add(buttonSix);

        JButton buttonSeven = new JButton("7");
        buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonSeven.setBounds(10,62,47,33);
        contentPane.add(buttonSeven);

        JButton buttonEight = new JButton("8");
        buttonEight.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonEight.setBounds(60,62,47,33);
        contentPane.add(buttonEight);

        JButton buttonNine = new JButton("9");
        buttonNine.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonNine.setBounds(110,62,47,33);
        contentPane.add(buttonNine);

        JButton buttonZero = new JButton("0");
        buttonZero.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonZero.setBounds(60,176,47,33);
        contentPane.add(buttonZero);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonMinus.setBounds(180,62,47,33);
        contentPane.add(buttonMinus);

        JButton Clear = new JButton("C");
        Clear.setFont(new Font("Tahoma", Font.BOLD, 16));
        Clear.setBounds(235,62,47,33);
        contentPane.add(Clear);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonPlus.setBounds(180,100,47,33);
        contentPane.add(buttonPlus);

        JButton buttonDivison = new JButton("/");
        buttonDivison.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonDivison.setBounds(180,138,47,33);
        contentPane.add(buttonDivison);

        JButton buttonMultiple = new JButton("*");
        buttonMultiple.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonMultiple.setBounds(180,176,47,33);
        contentPane.add(buttonMultiple);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setFont(new Font("Tahoma", Font.BOLD, 16));
        buttonEquals.setBounds(235,14,47,33);
        contentPane.add(buttonEquals);


        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 30));
        textField.setHorizontalAlignment(SwingConstants.TRAILING);
        textField.setEditable(false);
        textField.setEnabled(false);
        textField.setBounds(10, 11, 218, 42);
        contentPane.add(textField);
        textField.setColumns(10);

        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    opClicked = true;
                    textField.setText("0");
            }
        });


        buttonZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("0");
                }
                else
                    textField.setText(textField.getText()+"0");


            }
        });

        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("1");
                }
                else
                    textField.setText(textField.getText()+"1");


            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("2");
                }
                else
                    textField.setText(textField.getText()+"2");


            }
        });

        buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("3");
                }
                else
                    textField.setText(textField.getText()+"3");


            }
        });

        buttonFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("4");
                }
                else
                    textField.setText(textField.getText()+"4");


            }
        });

        buttonFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("5");
                }
                else
                    textField.setText(textField.getText()+"5");


            }
        });

        buttonSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("6");
                }
                else
                    textField.setText(textField.getText()+"6");


            }
        });

        buttonSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("7");
                }
                else
                    textField.setText(textField.getText()+"7");


            }
        });

        buttonEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("8");
                }
                else
                    textField.setText(textField.getText()+"8");


            }
        });

        buttonNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(opClicked)
                {
                    opClicked = false;
                    textField.setText("9");
                }
                else
                    textField.setText(textField.getText()+"9");


            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prevNumb = textField.getText();
                op = '+';
                opClicked = true;
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prevNumb = textField.getText();
                op = '-';
                opClicked = true;
            }
        });

        buttonMultiple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prevNumb = textField.getText();
                op = '*';
                opClicked = true;
            }
        });

        buttonDivison.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prevNumb = textField.getText();
                op = '/';
                opClicked = true;
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                double result = 0.0;

                double currentNumber = Double.parseDouble(currentText);

                switch (op) {
                    case '+':
                        result = Double.parseDouble(prevNumb) + currentNumber;

                        break;
                    case '-':
                        result = Double.parseDouble(prevNumb) - currentNumber;
                        break;
                    case '*':
                        result = Double.parseDouble(prevNumb) * currentNumber;
                        break;
                    case '/':
                        if (currentNumber == 0) {
                            textField.setText("Error: Division by zero");
                            return;
                        } else {
                            result = Double.parseDouble(prevNumb) / currentNumber;
                        }
                        break;
                    default:
                        textField.setText("Error");
                        return;
                }

                textField.setText(Double.toString(result));
                prevNumb = Double.toString(result);

                op = 'n';
                opClicked = true;
            }

        });
    }

}